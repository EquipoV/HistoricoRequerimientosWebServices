
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
 *         &lt;element name="consultaHistoricoCriterioReturn" type="{http://services.movistar.cl}HistoricoResponse"/>
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
    "consultaHistoricoCriterioReturn"
})
@XmlRootElement(name = "consultaHistoricoCriterioResponse")
public class ConsultaHistoricoCriterioResponse {

    @XmlElement(required = true)
    protected HistoricoResponse consultaHistoricoCriterioReturn;

    /**
     * Obtiene el valor de la propiedad consultaHistoricoCriterioReturn.
     * 
     * @return
     *     possible object is
     *     {@link HistoricoResponse }
     *     
     */
    public HistoricoResponse getConsultaHistoricoCriterioReturn() {
        return consultaHistoricoCriterioReturn;
    }

    /**
     * Define el valor de la propiedad consultaHistoricoCriterioReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoricoResponse }
     *     
     */
    public void setConsultaHistoricoCriterioReturn(HistoricoResponse value) {
        this.consultaHistoricoCriterioReturn = value;
    }

}