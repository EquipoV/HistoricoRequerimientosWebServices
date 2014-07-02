/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.movistar.ws.historico;

import cl.movistar.services.ClienteRequest;
import cl.movistar.services.CriterioRequest;
import cl.movistar.services.HistoricoResponse;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Christian
 */
public class HistoricoRequerimientosWSDLTest {
    
    public HistoricoRequerimientosWSDLTest() {
    }

    @Test
    public void testConsultaHistoricoCriterio() throws DatatypeConfigurationException, ParseException {
        System.out.println("consultaHistoricoCriterio");
        CriterioRequest criterio = new CriterioRequest();
        criterio.setCanal("CANAL IN");
        criterio.setSubCanal("SUBCANAL IN");
        criterio.setCodigoVendedor(0);
        criterio.setEstado("");
        criterio.setAgencia("");

        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
        String strDesde = "2014-07-01";

        try {
            Date fechaDesde = formatoDelTexto.parse(strDesde);
            GregorianCalendar gregory1 = new GregorianCalendar();
            gregory1.setTime(fechaDesde);
            XMLGregorianCalendar xmlGregory1 = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregory1);
            criterio.setFechaDesde(xmlGregory1);

            //Date fechaHasta = new Date();
            String strHasta = "2014-07-02";
            Date fechaHasta = formatoDelTexto.parse(strHasta);
            GregorianCalendar gregory2 = new GregorianCalendar();
            gregory2.setTime(fechaHasta);
            XMLGregorianCalendar xmlGregory2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregory2);
            criterio.setFechaHasta(xmlGregory2);
        } catch (ParseException ex) {
        }

        HistoricoRequerimientosWSDL instance = new HistoricoRequerimientosWSDL();
        HistoricoResponse expResult = null;
        HistoricoResponse result = instance.consultaHistoricoCriterio(criterio);
        assertNotNull("No hay datos", result);
    }

    @Test
    public void testConsultaHistoricoCliente() {
        System.out.println("consultaHistoricoCliente");
        ClienteRequest cliente = new ClienteRequest();
        cliente.setNumeroAbonado(54339035);
        cliente.setNumeroCelular(90338819);
        HistoricoRequerimientosWSDL instance = new HistoricoRequerimientosWSDL();
        HistoricoResponse expResult = null;
        HistoricoResponse result = null;
        try {
            result = instance.consultaHistoricoCliente(cliente);
        } catch (DatatypeConfigurationException ex) {
            Logger.getLogger(HistoricoRequerimientosWSDLTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertNotNull("No hay datos", result);
    }
}