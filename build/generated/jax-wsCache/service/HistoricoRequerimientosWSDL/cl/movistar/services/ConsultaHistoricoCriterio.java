
package cl.movistar.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Obtiene el valor de la propiedad criterio.
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
     * Define el valor de la propiedad criterio.
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
