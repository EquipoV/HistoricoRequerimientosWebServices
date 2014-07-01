/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.movistar.ws.historico;

import cl.movistar.hibernate.dto.Canal;
import cl.movistar.hibernate.dto.Estado;
import cl.movistar.hibernate.dto.MovimientosTracking;
import cl.movistar.hibernate.gateway.HistoricoRequerimientosFacade;
import cl.movistar.hibernate.gateway.HistoricoRequerimientosGateway;
import cl.movistar.services.ArrayOfHistoricoResponseData;
import cl.movistar.services.HistoricoResponse;
import cl.movistar.services.HistoricoResponseData;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.jws.WebService;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.log4j.Logger;

/**
 *
 * @author RRR
 */
@WebService(serviceName = "HistoricoRequerimientosImplService", portName = "HistoricoRequerimientosImpl", endpointInterface = "cl.movistar.services.HistoricoRequerimientosImpl", targetNamespace = "http://services.movistar.cl", wsdlLocation = "WEB-INF/wsdl/HistoricoRequerimientosWSDL/HistoricoRequerimientosImpl.wsdl")
public class HistoricoRequerimientosWSDL {

    public cl.movistar.services.HistoricoResponse consultaHistoricoCriterio(cl.movistar.services.CriterioRequest criterio) throws DatatypeConfigurationException {
        
        logger.info("Ingresamos al método consultaHistoricoCriterio");
        HistoricoRequerimientosFacade historicoRequerimientosFacade = new HistoricoRequerimientosFacade();
        HistoricoResponse respuesta = new HistoricoResponse();
        respuesta = historicoRequerimientosFacade.validaIngresoParametros(criterio);
        if (respuesta.getCodigoError() != 0)
        {
            return respuesta;
        }else{
            respuesta = historicoRequerimientosFacade.procesarBusquedaCriterioCompleta(criterio);
        }
    
        return respuesta;
    }

    public cl.movistar.services.HistoricoResponse consultaHistoricoCliente(cl.movistar.services.ClienteRequest cliente) throws DatatypeConfigurationException {

         logger.info("Ingresamos al método consultaHistoricoCriterio");
        HistoricoRequerimientosFacade historicoRequerimientosFacade = new HistoricoRequerimientosFacade();
        HistoricoResponse respuesta = new HistoricoResponse();
        respuesta = historicoRequerimientosFacade.validaIngresoParametrosCliente(cliente);
        if (respuesta.getCodigoError() != 0)
        {
            return respuesta;
        }else{
            respuesta = historicoRequerimientosFacade.procesarBusquedaClienteCompleta(cliente);
        }
    
        return respuesta;
    }

    private static final Logger logger = Logger.getLogger(HistoricoRequerimientosWSDL.class.getName());
    
}
