
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
 *         &lt;element name="cliente" type="{http://services.movistar.cl}ClienteRequest"/>
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
    "cliente"
})
@XmlRootElement(name = "consultaHistoricoCliente")
public class ConsultaHistoricoCliente {

    @XmlElement(required = true)
    protected ClienteRequest cliente;

    /**
     * Gets the value of the cliente property.
     * 
     * @return
     *     possible object is
     *     {@link ClienteRequest }
     *     
     */
    public ClienteRequest getCliente() {
        return cliente;
    }

    /**
     * Sets the value of the cliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClienteRequest }
     *     
     */
    public void setCliente(ClienteRequest value) {
        this.cliente = value;
    }

}
