
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
 *         &lt;element name="criterio" type="{http://services.movistar.cl}CriterioRequest"/>
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
    "criterio"
})
@XmlRootElement(name = "consultaHistoricoCriterio")
public class ConsultaHistoricoCriterio {

    @XmlElement(required = true)
    protected CriterioRequest criterio;

    /**
     * Gets the value of the criterio property.
     * 
     * @return
     *     possible object is
     *     {@link CriterioRequest }
     *     
     */
    public CriterioRequest getCriterio() {
        return criterio;
    }

    /**
     * Sets the value of the criterio property.
     * 
     * @param value
     *     allowed object is
     *     {@link CriterioRequest }
     *     
     */
    public void setCriterio(CriterioRequest value) {
        this.criterio = value;
    }

}
