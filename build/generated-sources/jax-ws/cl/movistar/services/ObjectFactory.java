
package cl.movistar.services;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cl.movistar.services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cl.movistar.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultaHistoricoCliente }
     * 
     */
    public ConsultaHistoricoCliente createConsultaHistoricoCliente() {
        return new ConsultaHistoricoCliente();
    }

    /**
     * Create an instance of {@link ClienteRequest }
     * 
     */
    public ClienteRequest createClienteRequest() {
        return new ClienteRequest();
    }

    /**
     * Create an instance of {@link ConsultaHistoricoClienteResponse }
     * 
     */
    public ConsultaHistoricoClienteResponse createConsultaHistoricoClienteResponse() {
        return new ConsultaHistoricoClienteResponse();
    }

    /**
     * Create an instance of {@link HistoricoResponse }
     * 
     */
    public HistoricoResponse createHistoricoResponse() {
        return new HistoricoResponse();
    }

    /**
     * Create an instance of {@link ConsultaHistoricoCriterioResponse }
     * 
     */
    public ConsultaHistoricoCriterioResponse createConsultaHistoricoCriterioResponse() {
        return new ConsultaHistoricoCriterioResponse();
    }

    /**
     * Create an instance of {@link ConsultaHistoricoCriterio }
     * 
     */
    public ConsultaHistoricoCriterio createConsultaHistoricoCriterio() {
        return new ConsultaHistoricoCriterio();
    }

    /**
     * Create an instance of {@link CriterioRequest }
     * 
     */
    public CriterioRequest createCriterioRequest() {
        return new CriterioRequest();
    }

    /**
     * Create an instance of {@link HistoricoResponseData }
     * 
     */
    public HistoricoResponseData createHistoricoResponseData() {
        return new HistoricoResponseData();
    }

    /**
     * Create an instance of {@link ArrayOfHistoricoResponseData }
     * 
     */
    public ArrayOfHistoricoResponseData createArrayOfHistoricoResponseData() {
        return new ArrayOfHistoricoResponseData();
    }

}
