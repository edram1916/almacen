package modelo;

import java.io.*;
import java.util.*;

public abstract class Producto implements Comparable<Producto>, Serializable {

    protected String descripcion;
    protected String codigo;

    public Producto(String descripcion, String codigo) {
        this.descripcion = descripcion;
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public static Comparator<Producto>  comparadorDescCod = new Comparator<Producto>() {
        public int compare(Producto p1, Producto p2) {
            if (p1.descripcion.compareTo(p2.descripcion) <0) {
                return -1;
            } else if (p1.descripcion.compareTo(p2.descripcion) >0) {
                return 1;
            } else {
                return 0;
            }
        }
    };
    
    public int compareTo(Producto p){
        return descripcion.compareTo(p.descripcion);
    }   
    public abstract double calcularPrecio();

    boolean equalsIgnoreCase(String codigo) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return true;
    }
}