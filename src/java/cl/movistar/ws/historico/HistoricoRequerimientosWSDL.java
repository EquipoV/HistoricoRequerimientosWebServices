/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.movistar.ws.historico;

import cl.movistar.hibernate.gateway.HistoricoRequerimientosFacade;
import cl.movistar.services.HistoricoResponse;
import javax.jws.WebService;
import javax.xml.datatype.DatatypeConfigurationException;
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
