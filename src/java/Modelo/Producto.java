package Modelo;
// Generated 06-jun-2020 21:33:38 by Hibernate Tools 4.3.1



/**
 * Producto generated by hbm2java
 */
public class Producto  implements java.io.Serializable {


     private int idProducto;
     private String tv;
     private String radio;
     private String tostadora;

    public Producto() {
    }

    public Producto(int idProducto, String tv, String radio, String tostadora) {
       this.idProducto = idProducto;
       this.tv = tv;
       this.radio = radio;
       this.tostadora = tostadora;
    }
   
    public int getIdProducto() {
        return this.idProducto;
    }
    
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    public String getTv() {
        return this.tv;
    }
    
    public void setTv(String tv) {
        this.tv = tv;
    }
    public String getRadio() {
        return this.radio;
    }
    
    public void setRadio(String radio) {
        this.radio = radio;
    }
    public String getTostadora() {
        return this.tostadora;
    }
    
    public void setTostadora(String tostadora) {
        this.tostadora = tostadora;
    }




}


