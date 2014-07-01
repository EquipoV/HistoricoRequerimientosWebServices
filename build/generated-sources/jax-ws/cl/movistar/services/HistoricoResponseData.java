
package cl.movistar.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para HistoricoResponseData complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Obtiene el valor de la propiedad canalContratacion.
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
     * Define el valor de la propiedad canalContratacion.
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
     * Obtiene el valor de la propiedad cicloFacturacion.
     * 
     */
    public int getCicloFacturacion() {
        return cicloFacturacion;
    }

    /**
     * Define el valor de la propiedad cicloFacturacion.
     * 
     */
    public void setCicloFacturacion(int value) {
        this.cicloFacturacion = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoCliente.
     * 
     */
    public int getCodigoCliente() {
        return codigoCliente;
    }

    /**
     * Define el valor de la propiedad codigoCliente.
     * 
     */
    public void setCodigoCliente(int value) {
        this.codigoCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoOferta.
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
     * Define el valor de la propiedad codigoOferta.
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
     * Obtiene el valor de la propiedad descuento.
     * 
     */
    public int getDescuento() {
        return descuento;
    }

    /**
     * Define el valor de la propiedad descuento.
     * 
     */
    public void setDescuento(int value) {
        this.descuento = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
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
     * Define el valor de la propiedad estado.
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
     * Obtiene el valor de la propiedad fechaHoraActivacion.
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
     * Define el valor de la propiedad fechaHoraActivacion.
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
     * Obtiene el valor de la propiedad fechaHoraContratacion.
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
     * Define el valor de la propiedad fechaHoraContratacion.
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
     * Obtiene el valor de la propiedad fechaHoraNotificacion.
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
     * Define el valor de la propiedad fechaHoraNotificacion.
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
     * Obtiene el valor de la propiedad idTransaccion.
     * 
     */
    public int getIdTransaccion() {
        return idTransaccion;
    }

    /**
     * Define el valor de la propiedad idTransaccion.
     * 
     */
    public void setIdTransaccion(int value) {
        this.idTransaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreOferta.
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
     * Define el valor de la propiedad nombreOferta.
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
     * Obtiene el valor de la propiedad precioCompra.
     * 
     */
    public int getPrecioCompra() {
        return precioCompra;
    }

    /**
     * Define el valor de la propiedad precioCompra.
     * 
     */
    public void setPrecioCompra(int value) {
        this.precioCompra = value;
    }

    /**
     * Obtiene el valor de la propiedad puntosUtilizados.
     * 
     */
    public int getPuntosUtilizados() {
        return puntosUtilizados;
    }

    /**
     * Define el valor de la propiedad puntosUtilizados.
     * 
     */
    public void setPuntosUtilizados(int value) {
        this.puntosUtilizados = value;
    }

    /**
     * Obtiene el valor de la propiedad subCanal.
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
     * Define el valor de la propiedad subCanal.
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
     * Obtiene el valor de la propiedad agencia.
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
     * Define el valor de la propiedad agencia.
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
     * Obtiene el valor de la propiedad codigoVendedor.
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
     * Define el valor de la propiedad codigoVendedor.
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
