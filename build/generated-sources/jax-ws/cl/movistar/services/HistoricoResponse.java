
package cl.movistar.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para HistoricoResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HistoricoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoError" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="descripcionError" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mensajeError" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resp" type="{http://services.movistar.cl}ArrayOfHistoricoResponseData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistoricoResponse", propOrder = {
    "codigoError",
    "descripcionError",
    "mensajeError",
    "resp"
})
public class HistoricoResponse {

    protected int codigoError;
    @XmlElement(required = true, nillable = true)
    protected String descripcionError;
    @XmlElement(required = true, nillable = true)
    protected String mensajeError;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfHistoricoResponseData resp;

    /**
     * Obtiene el valor de la propiedad codigoError.
     * 
     */
    public int getCodigoError() {
        return codigoError;
    }

    /**
     * Define el valor de la propiedad codigoError.
     * 
     */
    public void setCodigoError(int value) {
        this.codigoError = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionError() {
        return descripcionError;
    }

    /**
     * Define el valor de la propiedad descripcionError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionError(String value) {
        this.descripcionError = value;
    }

    /**
     * Obtiene el valor de la propiedad mensajeError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensajeError() {
        return mensajeError;
    }

    /**
     * Define el valor de la propiedad mensajeError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensajeError(String value) {
        this.mensajeError = value;
    }

    /**
     * Obtiene el valor de la propiedad resp.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHistoricoResponseData }
     *     
     */
    public ArrayOfHistoricoResponseData getResp() {
        return resp;
    }

    /**
     * Define el valor de la propiedad resp.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHistoricoResponseData }
     *     
     */
    public void setResp(ArrayOfHistoricoResponseData value) {
        this.resp = value;
    }

}
