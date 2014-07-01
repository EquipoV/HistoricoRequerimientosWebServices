
package cl.movistar.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClienteRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClienteRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroAbonado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numeroCelular" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="rut" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClienteRequest", propOrder = {
    "numeroAbonado",
    "numeroCelular",
    "rut"
})
public class ClienteRequest {

    protected int numeroAbonado;
    protected int numeroCelular;
    @XmlElement(required = true, nillable = true)
    protected String rut;

    /**
     * Obtiene el valor de la propiedad numeroAbonado.
     * 
     */
    public int getNumeroAbonado() {
        return numeroAbonado;
    }

    /**
     * Define el valor de la propiedad numeroAbonado.
     * 
     */
    public void setNumeroAbonado(int value) {
        this.numeroAbonado = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroCelular.
     * 
     */
    public int getNumeroCelular() {
        return numeroCelular;
    }

    /**
     * Define el valor de la propiedad numeroCelular.
     * 
     */
    public void setNumeroCelular(int value) {
        this.numeroCelular = value;
    }

    /**
     * Obtiene el valor de la propiedad rut.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRut() {
        return rut;
    }

    /**
     * Define el valor de la propiedad rut.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRut(String value) {
        this.rut = value;
    }

}
