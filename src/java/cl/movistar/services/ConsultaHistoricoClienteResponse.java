
package cl.movistar.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consultaHistoricoClienteReturn" type="{http://services.movistar.cl}HistoricoResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "consultaHistoricoClienteReturn"
})
@XmlRootElement(name = "consultaHistoricoClienteResponse")
public class ConsultaHistoricoClienteResponse {

    @XmlElement(required = true)
    protected HistoricoResponse consultaHistoricoClienteReturn;

    /**
     * Gets the value of the consultaHistoricoClienteReturn property.
     * 
     * @return
     *     possible object is
     *     {@link HistoricoResponse }
     *     
     */
    public HistoricoResponse getConsultaHistoricoClienteReturn() {
        return consultaHistoricoClienteReturn;
    }

    /**
     * Sets the value of the consultaHistoricoClienteReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoricoResponse }
     *     
     */
    public void setConsultaHistoricoClienteReturn(HistoricoResponse value) {
        this.consultaHistoricoClienteReturn = value;
    }

}
