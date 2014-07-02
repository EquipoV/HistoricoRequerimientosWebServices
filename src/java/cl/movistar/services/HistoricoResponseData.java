
package cl.movistar.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for HistoricoResponseData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HistoricoResponseData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="canalContratacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cicloFacturacion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codigoCliente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codigoOferta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descuento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaHoraActivacion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="fechaHoraContratacion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="fechaHoraNotificacion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="idTransaccion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombreOferta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numeroAbonado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numeroCelular" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="precioCompra" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="puntosUtilizados" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="subCanal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="agencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoVendedor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistoricoResponseData", propOrder = {
    "canalContratacion",
    "cicloFacturacion",
    "codigoCliente",
    "codigoOferta",
    "descuento",
    "estado",
    "fechaHoraActivacion",
    "fechaHoraContratacion",
    "fechaHoraNotificacion",
    "idTransaccion",
    "nombreOferta",
    "numeroAbonado",
    "numeroCelular",
    "precioCompra",
    "puntosUtilizados",
    "subCanal",
    "agencia",
    "codigoVendedor"
})
public class HistoricoResponseData {

    @XmlElement(required = true, nillable = true)
    protected String canalContratacion;
    protected int cicloFacturacion;
    protected int codigoCliente;
    @XmlElement(required = true)
    protected String codigoOferta;
    protected int descuento;
    @XmlElement(required = true, nillable = true)
    protected String estado;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraActivacion;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraContratacion;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraNotificacion;
    protected int idTransaccion;
    @XmlElement(required = true, nillable = true)
    protected String nombreOferta;
    protected int numeroAbonado;
    protected int numeroCelular;
    protected int precioCompra;
    protected int puntosUtilizados;
    @XmlElement(required = true, nillable = true)
    protected String subCanal;
    @XmlElement(required = true, nillable = true)
    protected String agencia;
    @XmlElement(required = true, nillable = true)
    protected String codigoVendedor;

    /**
     * Gets the value of the canalContratacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanalContratacion() {
        return canalContratacion;
    }

    /**
     * Sets the value of the canalContratacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanalContratacion(String value) {
        this.canalContratacion = value;
    }

    /**
     * Gets the value of the cicloFacturacion property.
     * 
     */
    public int getCicloFacturacion() {
        return cicloFacturacion;
    }

    /**
     * Sets the value of the cicloFacturacion property.
     * 
     */
    public void setCicloFacturacion(int value) {
        this.cicloFacturacion = value;
    }

    /**
     * Gets the value of the codigoCliente property.
     * 
     */
    public int getCodigoCliente() {
        return codigoCliente;
    }

    /**
     * Sets the value of the codigoCliente property.
     * 
     */
    public void setCodigoCliente(int value) {
        this.codigoCliente = value;
    }

    /**
     * Gets the value of the codigoOferta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoOferta() {
        return codigoOferta;
    }

    /**
     * Sets the value of the codigoOferta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoOferta(String value) {
        this.codigoOferta = value;
    }

    /**
     * Gets the value of the descuento property.
     * 
     */
    public int getDescuento() {
        return descuento;
    }

    /**
     * Sets the value of the descuento property.
     * 
     */
    public void setDescuento(int value) {
        this.descuento = value;
    }

    /**
     * Gets the value of the estado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Gets the value of the fechaHoraActivacion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHoraActivacion() {
        return fechaHoraActivacion;
    }

    /**
     * Sets the value of the fechaHoraActivacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHoraActivacion(XMLGregorianCalendar value) {
        this.fechaHoraActivacion = value;
    }

    /**
     * Gets the value of the fechaHoraContratacion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHoraContratacion() {
        return fechaHoraContratacion;
    }

    /**
     * Sets the value of the fechaHoraContratacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHoraContratacion(XMLGregorianCalendar value) {
        this.fechaHoraContratacion = value;
    }

    /**
     * Gets the value of the fechaHoraNotificacion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHoraNotificacion() {
        return fechaHoraNotificacion;
    }

    /**
     * Sets the value of the fechaHoraNotificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHoraNotificacion(XMLGregorianCalendar value) {
        this.fechaHoraNotificacion = value;
    }

    /**
     * Gets the value of the idTransaccion property.
     * 
     */
    public int getIdTransaccion() {
        return idTransaccion;
    }

    /**
     * Sets the value of the idTransaccion property.
     * 
     */
    public void setIdTransaccion(int value) {
        this.idTransaccion = value;
    }

    /**
     * Gets the value of the nombreOferta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreOferta() {
        return nombreOferta;
    }

    /**
     * Sets the value of the nombreOferta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreOferta(String value) {
        this.nombreOferta = value;
    }

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
     * Gets the value of the precioCompra property.
     * 
     */
    public int getPrecioCompra() {
        return precioCompra;
    }

    /**
     * Sets the value of the precioCompra property.
     * 
     */
    public void setPrecioCompra(int value) {
        this.precioCompra = value;
    }

    /**
     * Gets the value of the puntosUtilizados property.
     * 
     */
    public int getPuntosUtilizados() {
        return puntosUtilizados;
    }

    /**
     * Sets the value of the puntosUtilizados property.
     * 
     */
    public void setPuntosUtilizados(int value) {
        this.puntosUtilizados = value;
    }

    /**
     * Gets the value of the subCanal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCanal() {
        return subCanal;
    }

    /**
     * Sets the value of the subCanal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubCanal(String value) {
        this.subCanal = value;
    }

    /**
     * Gets the value of the agencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencia() {
        return agencia;
    }

    /**
     * Sets the value of the agencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencia(String value) {
        this.agencia = value;
    }

    /**
     * Gets the value of the codigoVendedor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoVendedor() {
        return codigoVendedor;
    }

    /**
     * Sets the value of the codigoVendedor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoVendedor(String value) {
        this.codigoVendedor = value;
    }

}
