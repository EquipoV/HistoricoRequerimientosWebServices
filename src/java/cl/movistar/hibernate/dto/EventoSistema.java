package cl.movistar.hibernate.dto;
// Generated 20-06-2014 11:47:45 AM by Hibernate Tools 3.6.0



/**
 * EventoSistema generated by hbm2java
 */
public class EventoSistema  implements java.io.Serializable {


     private int id;
     private String nombre;
     private String descripcion;
     private String accionesSistema;

    public EventoSistema() {
    }

    public EventoSistema(int id, String nombre, String descripcion, String accionesSistema) {
       this.id = id;
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.accionesSistema = accionesSistema;
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
    public String getAccionesSistema() {
        return this.accionesSistema;
    }
    
    public void setAccionesSistema(String accionesSistema) {
        this.accionesSistema = accionesSistema;
    }




}


