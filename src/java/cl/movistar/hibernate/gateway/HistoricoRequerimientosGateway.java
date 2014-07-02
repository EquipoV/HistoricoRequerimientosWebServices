/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.movistar.hibernate.gateway;

import cl.movistar.hibernate.dto.Canal;
import cl.movistar.hibernate.dto.Estado;
import cl.movistar.hibernate.dto.MovimientosTracking;
import cl.movistar.services.ArrayOfHistoricoResponseData;
import cl.movistar.services.ClienteRequest;
import cl.movistar.services.CriterioRequest;
import cl.movistar.services.HistoricoResponse;
import cl.movistar.services.HistoricoResponseData;
import cl.movistar.ws.dto.HelperQuery;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import org.hibernate.Query;
import org.hibernate.Session;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.hibernate.HibernateException;

/**
 *
 * @author RRR
 */
public class HistoricoRequerimientosGateway {

    public static HistoricoRequerimientosGateway getInstance() {
        return INSTANCE;
    }

    public HistoricoResponse validaIngresoParametros(CriterioRequest criterio) {

        HistoricoResponse historicoResponse = new HistoricoResponse();
        if (criterio.getAgencia().equalsIgnoreCase("") && criterio.getCanal().equalsIgnoreCase("") && criterio.getCodigoVendedor() == 0
                && criterio.getEstado().equalsIgnoreCase("") && criterio.getFechaDesde() == null && criterio.getFechaHasta() == null) {
            historicoResponse.setCodigoError(100);
            historicoResponse.setDescripcionError("No hay criterios de busqueda");
            historicoResponse.setMensajeError("Para buscar minimo un criterio");
        }

        return historicoResponse;
    }

    public HistoricoResponse validaIngresoParametrosCliente(ClienteRequest cliente) {
        HistoricoResponse historicoResponse = new HistoricoResponse();
        if (cliente.getNumeroAbonado() == 0 && cliente.getNumeroCelular() == 0) {
            historicoResponse.setCodigoError(100);
            historicoResponse.setDescripcionError("No hay criterios de busqueda");
            historicoResponse.setMensajeError("Para buscar minimo debe ir un criterio");
        }

        return historicoResponse;
    }

    public HistoricoResponse procesarBusquedaCriterioCompleta(CriterioRequest criterio) {

        session = HistoricoRequerimientosHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        HistoricoResponse respuesta = new HistoricoResponse();

        List<MovimientosTracking> movimientos = new ArrayList<MovimientosTracking>();

        //String where = obtenerQuery(criterio);
        HelperQuery helperQuery = new HelperQuery();
        helperQuery = obtenerQuery(criterio);

        if (helperQuery.getCodigo() != 0) {
            respuesta.setCodigoError(helperQuery.getCodigo());
            respuesta.setDescripcionError(helperQuery.getDescripcion());
            respuesta.setMensajeError(helperQuery.getMensaje());
            return respuesta;

        } else {
            logger.info("Ingresamos al método obtienerHistoricos");

            Query query;

            logger.info("FROM cl.movistar.hibernate.dto.MovimientosTracking " + helperQuery.getWhere());

            String queryString = "FROM cl.movistar.hibernate.dto.MovimientosTracking " + helperQuery.getWhere();

            try {
                query = session.createQuery(queryString);
                movimientos = query.list();

            } catch (HibernateException e) {
                logger.error("Error en hibernate al ejecutar la query: " + e);
                logger.info("Error en hibernate al ejecutar la query: " + e);
                respuesta.setCodigoError(100);
                respuesta.setMensajeError("Error al ejecutar consulta");
                respuesta.setDescripcionError("Ocurrio un error al ejecutar la consulta de Historico");
                return respuesta;
            }

            respuesta = procesarRespuesta(movimientos);

        }

        session.close();
        return respuesta;
    }

    public HistoricoResponse procesarBusquedaClienteCompleta(ClienteRequest cliente) {
        session = HistoricoRequerimientosHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        HistoricoResponse respuesta = new HistoricoResponse();

        List<MovimientosTracking> movimientos = new ArrayList<MovimientosTracking>();

        HelperQuery helperQuery = new HelperQuery();
        helperQuery = obtenerQueryCliente(cliente);

        if (helperQuery.getCodigo() != 0) {
            respuesta.setCodigoError(helperQuery.getCodigo());
            respuesta.setDescripcionError(helperQuery.getDescripcion());
            respuesta.setMensajeError(helperQuery.getMensaje());
            return respuesta;

        } else {
            logger.info("Ingresamos al método procesarBusquedaClienteCompleta");

            Query query;

            logger.info("FROM cl.movistar.hibernate.dto.MovimientosTracking " + helperQuery.getWhere());

            String queryString = "FROM cl.movistar.hibernate.dto.MovimientosTracking " + helperQuery.getWhere();

            try {
                query = session.createQuery(queryString);
                movimientos = query.list();

            } catch (HibernateException e) {
                logger.error("Error en hibernate al ejecutar la query: " + e);
                logger.info("Error en hibernate al ejecutar la query: " + e);
                respuesta.setCodigoError(100);
                respuesta.setMensajeError("Error al ejecutar consulta");
                respuesta.setDescripcionError("Ocurrio un error al ejecutar la consulta de Historico");
                return respuesta;
            }

            respuesta = procesarRespuesta(movimientos);
        }

        session.close();
        return respuesta;
    }

    private HistoricoResponse procesarRespuesta(List<MovimientosTracking> movimientos) {
        HistoricoResponse response = new HistoricoResponse();

        if (!movimientos.isEmpty()) {

            logger.info("Existen " + movimientos.size() + " registros");

            ArrayOfHistoricoResponseData responseData = new ArrayOfHistoricoResponseData();
            logger.info("Inicio for para crear el response que se retornará");

            for (MovimientosTracking m : movimientos) {

                HistoricoResponseData responseDataAux = new HistoricoResponseData();

                responseDataAux.setIdTransaccion(verificarNullInteger(m.getId()));

                String nombreCanal = null;
                Canal c = new Canal();
                try {
                    c = obtieneNombreCanal(verificarNullInteger(m.getCanal()));
                    nombreCanal = c.getNombre();
                    responseDataAux.setCanalContratacion(verificarNullString(nombreCanal));
                } catch (Exception e) {
                    logger.error("No existe el codigo en la tabla canal");
                }

                responseDataAux.setCicloFacturacion(verificarNullInteger(m.getCicloFacturacion()));
                responseDataAux.setCodigoCliente(verificarNullInteger(m.getCodigoCliente()));
                responseDataAux.setCodigoOferta(m.getCodigoOferta());
                responseDataAux.setDescuento(verificarNullInteger(m.getDescuento()));

                String nombreEstado = null;
                Estado es = new Estado();
                try {
                    es = obtieneNombreEstado(verificarNullInteger(m.getEstado()));
                    nombreEstado = es.getNombre();
                    responseDataAux.setEstado(verificarNullString(nombreEstado));
                } catch (Exception e) {
                    logger.error("No existe el codigo en la tabla estado");
                }

                if (m.getFechaActivacion() != null) {
                    Date fechaActivacion = m.getFechaActivacion();
                    GregorianCalendar gregory1 = new GregorianCalendar();
                    gregory1.setTime(fechaActivacion);
                    XMLGregorianCalendar xmlGregory1 = null;
                    try {
                        xmlGregory1 = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregory1);
                    } catch (DatatypeConfigurationException ex) {
                        java.util.logging.Logger.getLogger(HistoricoRequerimientosGateway.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    responseDataAux.setFechaHoraActivacion(xmlGregory1);
                } else {
                    logger.error("Fecha activacion nula, error");
                }

                if (m.getFechaContratacion() != null) {
                    Date fechaContratacion = m.getFechaContratacion();
                    GregorianCalendar gregory2 = new GregorianCalendar();
                    gregory2.setTime(fechaContratacion);
                    XMLGregorianCalendar xmlGregory2 = null;
                    try {
                        xmlGregory2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregory2);
                    } catch (DatatypeConfigurationException ex) {
                        java.util.logging.Logger.getLogger(HistoricoRequerimientosGateway.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    responseDataAux.setFechaHoraContratacion(xmlGregory2);
                } else {
                    logger.error("Fecha contratacion nula");
                }

                if (m.getFechaNotificacion() != null) {
                    Date fechaNotificacion = m.getFechaNotificacion();
                    GregorianCalendar gregory3 = new GregorianCalendar();
                    gregory3.setTime(fechaNotificacion);
                    XMLGregorianCalendar xmlGregory3 = null;
                    try {
                        xmlGregory3 = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregory3);
                    } catch (DatatypeConfigurationException ex) {
                        java.util.logging.Logger.getLogger(HistoricoRequerimientosGateway.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    responseDataAux.setFechaHoraNotificacion(xmlGregory3);
                } else {
                    logger.error("Fecha notificacion nula");
                }

                responseDataAux.setNombreOferta(verificarNullString(m.getNombreOferta()));
                responseDataAux.setNumeroAbonado(verificarNullInteger(m.getNumeroAbonado()));
                responseDataAux.setNumeroCelular(verificarNullInteger(m.getNumeroCelular()));

                responseDataAux.setPrecioCompra(verificarNullInteger(m.getPrecio()));
                responseDataAux.setPuntosUtilizados(verificarNullInteger(m.getPuntosUtilizados()));

                responseDataAux.setCodigoVendedor(verificarNullString(m.getCodigoVendedor()));
                responseDataAux.setSubCanal(verificarNullInteger(m.getSubCanal()).toString());
                responseDataAux.setAgencia(verificarNullString(m.getAgencia()));
                responseData.getItem().add(responseDataAux);
            }

            logger.info("Fin for para crear el response que se retornará");
            logger.info("Se hace el setResp(responseData) en: consultaHistoricoCriterio");

            response.setResp(responseData);

        } else {

            logger.info("No existen movimientos asociados a los criterios");
            logger.info("CodigoError = 100");
            logger.info("No hay datos");

            response.setDescripcionError("No existen movimientos asociados a los criterios");
            response.setCodigoError(100);
            response.setMensajeError("No hay datos");
        }

        return response;
    }

    private Estado obtieneNombreEstado(int codigoEstado) {

        logger.info("Ingresamos al método obtieneNombreEstado");

        Query query = session.createQuery("FROM cl.movistar.hibernate.dto.Estado where id = '" + codigoEstado + "' ");
        List<Estado> e = query.list();
        return e.get(0);
    }

    private Canal obtieneNombreCanal(int codigoCanal) {
        logger.info("Ingresamos al método obtieneNombreCanal");

        Query query = session.createQuery("FROM cl.movistar.hibernate.dto.Canal where id = '" + codigoCanal + "' ");
        List<Canal> e = query.list();
        return e.get(0);
    }

    private HistoricoRequerimientosGateway() {

        String resourceLog = "cl/movistar/ws/historico/HistoricoRequerimientosLog4j.properties";
        InputStream isLog = this.getClass().getClassLoader().getResourceAsStream(resourceLog);
        Properties props = new Properties();
        try {
            props.load(isLog);
            PropertyConfigurator.configure(props);
            isLog.close();
        } catch (IOException ex) {
            logger.error("IOException");
            logger.error(ex);
        }

    }
    private Session session;
    private static final HistoricoRequerimientosGateway INSTANCE = new HistoricoRequerimientosGateway();
    private static final Logger logger = Logger.getLogger(HistoricoRequerimientosGateway.class.getName());

    private HelperQuery obtenerQuery(CriterioRequest criterio) {

        HelperQuery helperQuery = new HelperQuery();

        String canal = criterio.getCanal();
        int codigoVendedor = criterio.getCodigoVendedor();
        String estado = criterio.getEstado();
        XMLGregorianCalendar fechaDesde = criterio.getFechaDesde();
        XMLGregorianCalendar fechaHasta = criterio.getFechaHasta();

        Boolean canalExiste = false;
        Boolean codigoVendedorExiste = false;
        Boolean estadoExiste = false;
        Boolean fechaDesdeExiste = false;

        String queryParteWhere = "where ";

        if (canal != null && !canal.isEmpty()) {
            Canal canalBd = new Canal();
            try {
                Query query = session.createQuery("FROM cl.movistar.hibernate.dto.Canal where nombre = '" + canal + "' ");
                List<Canal> canalAux = query.list();
                canalBd = canalAux.get(0);
                if (canalAux.size() < 1) {
                    helperQuery.setCodigo(1);
                    helperQuery.setMensaje("Error al obtener canal");
                    helperQuery.setDescripcion("No se encontro el canal");
                    logger.info("No existe el canal");

                    return helperQuery;
                } else {
                    queryParteWhere = queryParteWhere + "canal = '" + canalBd.getId() + "' ";
                    canalExiste = true;
                }

            } catch (Exception e) {
                helperQuery.setCodigo(1);
                helperQuery.setMensaje("Error al obtener canal");
                helperQuery.setDescripcion("No se encontro el canal");
                logger.error("No existe el canal, error: " + e);

                return helperQuery;
            }

        }

        if (codigoVendedor != 0) {
            if (canalExiste) {
                queryParteWhere = queryParteWhere + " AND codigo_vendedor = '" + codigoVendedor + "' ";
            } else {
                queryParteWhere = queryParteWhere + " codigo_vendedor  = '" + codigoVendedor + "' ";
            }
            codigoVendedorExiste = true;
        }

        if (estado != null && !estado.isEmpty()) {
            try {
                Estado estadoBd = new Estado();
                Query query = session.createQuery("FROM cl.movistar.hibernate.dto.Estado where nombre = '" + estado + "' ");
                List<Estado> estadoAux = query.list();
                if (estadoAux.size() < 1) {
                    helperQuery.setCodigo(1);
                    helperQuery.setMensaje("Error al obtener estado");
                    helperQuery.setDescripcion("No se encontro el estado");
                    logger.info("No existe el estado");
                } else {
                    estadoBd = estadoAux.get(0);
                }

                if (canalExiste || codigoVendedorExiste) {
                    queryParteWhere = queryParteWhere + " AND estado = '" + estadoBd.getId() + "' ";
                } else {
                    queryParteWhere = queryParteWhere + " estado = '" + estadoBd.getId() + "' ";
                }
                estadoExiste = true;
            } catch (Exception e) {
                helperQuery.setCodigo(1);
                helperQuery.setMensaje("Error al obtener estado");
                helperQuery.setDescripcion("No se encontro el estado");
                logger.error("No existe el estado");
                return helperQuery;

            }
        }

        if (fechaDesde != null && fechaHasta != null) {

            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

            Date fDesde = fechaDesde.toGregorianCalendar().getTime();

            Calendar c = new GregorianCalendar(fechaHasta.getYear(), fechaHasta.getMonth() - 1, fechaHasta.getDay());
            c.add(Calendar.DAY_OF_MONTH, 1);
            Date fHasta = c.getTime();

            String desde = formato.format(fDesde);
            String hasta = formato.format(fHasta);

            if (canalExiste || codigoVendedorExiste || estadoExiste) {
                queryParteWhere = queryParteWhere + " AND fecha_contratacion >= '" + desde + "' AND fecha_contratacion <= '" + hasta + "'";
            } else {
                queryParteWhere = queryParteWhere + " fecha_contratacion >= '" + desde + "' AND fecha_contratacion <= '" + hasta + "'";
            }
        }

        helperQuery.setWhere(queryParteWhere);
        return helperQuery;
    }

    private HelperQuery obtenerQueryCliente(ClienteRequest cliente) {

        HelperQuery helperQuery = new HelperQuery();

        int numeroAbonado = cliente.getNumeroAbonado();
        int numeroCelular = cliente.getNumeroCelular();

        Boolean numeroAbonadoExiste = false;

        String queryParteWhere = "WHERE ";

        if (numeroAbonado != 0) {
            queryParteWhere = queryParteWhere + " numero_abonado = '" + numeroAbonado + "' ";
            numeroAbonadoExiste = true;
        }

        if (numeroCelular != 0) {
            if (numeroAbonadoExiste) {
                queryParteWhere = queryParteWhere + " AND numero_celular = '" + numeroCelular + "' ";
            } else {
                queryParteWhere = queryParteWhere + " numero_celular = '" + numeroCelular + "' ";
            }
        }

        helperQuery.setWhere(queryParteWhere);
        return helperQuery;
    }

    private String verificarNullString(String dato) {
        if (dato == null) {
            return "";
        }
        return dato;
    }

    private Integer verificarNullInteger(Integer dato) {
        if (dato == null) {
            return 0;
        }
        return dato;
    }

}
