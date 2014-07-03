
package cl.movistar.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClienteRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the numeroAbonado property.
     * 
     */
    public int getNumeroAbonado() {
        return numeroAbonado;
    }

    /**
     * Sets the value of the numeroAbonado property.
     * 
     */
    public void setNumeroAbonado(int value) {
        this.numeroAbonado = value;
    }

    /**
     * Gets the value of the numeroCelular property.
     * 
     */
    public int getNumeroCelular() {
        return numeroCelular;
    }

    /**
     * Sets the value of the numeroCelular property.
     * 
     */
    public void setNumeroCelular(int value) {
        this.numeroCelular = value;
    }

    /**
     * Gets the value of the rut property.
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
     * Sets the value of the rut property.
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
