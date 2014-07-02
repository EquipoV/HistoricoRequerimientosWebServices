package cl.movistar.hibernate.dto;
// Generated 02-07-2014 06:50:33 PM by Hibernate Tools 3.6.0



/**
 * EventosTracking generated by hbm2java
 */
public class EventosTracking  implements java.io.Serializable {


     private int id;
     private String nombre;
     private String descripcion;
     private int eventoSistema;
     private int eventoNegocio;
     private int canal;

    public EventosTracking() {
    }

    public EventosTracking(int id, String nombre, String descripcion, int eventoSistema, int eventoNegocio, int canal) {
       this.id = id;
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.eventoSistema = eventoSistema;
       this.eventoNegocio = eventoNegocio;
       this.canal = canal;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getEventoSistema() {
        return this.eventoSistema;
    }
    
    public void setEventoSistema(int eventoSistema) {
        this.eventoSistema = eventoSistema;
    }
    public int getEventoNegocio() {
        return this.eventoNegocio;
    }
    
    public void setEventoNegocio(int eventoNegocio) {
        this.eventoNegocio = eventoNegocio;
    }
    public int getCanal() {
        return this.canal;
    }
    
    public void setCanal(int canal) {
        this.canal = canal;
    }




}


