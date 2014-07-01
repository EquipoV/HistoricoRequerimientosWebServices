/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.movistar.hibernate.gateway;

import cl.movistar.services.ClienteRequest;
import cl.movistar.services.CriterioRequest;
import cl.movistar.services.HistoricoResponse;

/**
 *
 * @author RRR
 */
public class HistoricoRequerimientosFacade {

    public HistoricoResponse validaIngresoParametros(CriterioRequest criterio) {
        return HistoricoRequerimientosGateway.getInstance().validaIngresoParametros(criterio);
    }
    
    public HistoricoResponse validaIngresoParametrosCliente(ClienteRequest cliente) {
        return HistoricoRequerimientosGateway.getInstance().validaIngresoParametrosCliente(cliente);
    }    

    public HistoricoResponse procesarBusquedaCriterioCompleta(CriterioRequest criterio) {
        return HistoricoRequerimientosGateway.getInstance().procesarBusquedaCriterioCompleta(criterio);
    }
    
    public HistoricoResponse procesarBusquedaClienteCompleta(ClienteRequest criterio) {
        return HistoricoRequerimientosGateway.getInstance().procesarBusquedaClienteCompleta(criterio);
    }    
     
}
