package modelo;

import java.io.*;
import java.util.*;

public class Proveedor implements Comparable<Proveedor>, Serializable{
    private String nombre;
    private String direccion;
    private String telefono;
    private String mail;
    private ArrayList<Producto> productos;

    public Proveedor(String nombre, String direccion, String telefono, String mail, ArrayList<Producto> productos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.mail = mail;
        this.productos = new ArrayList();
    }

    public Proveedor(String nombre, String direccion, String telefono, String mail) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.mail = mail;
        this.productos = new ArrayList();
    }
    

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getMail() {
        return mail;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }
    
    public int compareTo(Proveedor p){
        return nombre.compareTo(p.nombre);
    }
    
    public static Comparator<Proveedor>  comparadorProv = new Comparator<Proveedor>() {
        public int compare(Proveedor p1, Proveedor p2) {
            if (p1.nombre.compareTo(p2.nombre) <0) {
                return -1;
            } else if (p1.nombre.compareTo(p2.nombre) >0) {
                return 1;
            } else {
                return 0;
            }
        }
    };
    
    public boolean existeProducto(String codigo) {
        for(Producto p : productos) {
            if (p.equalsIgnoreCase(codigo)) {
                return true;
            }
        }
        return false;
    }
    
    public void agregarProducto (Producto p){
        if (!existeProducto(p.getCodigo())){
            productos.add(p);
       } 
    }
    
    public void eliminarProducto(String nombre) {
        String encontrado = null;
        for(Producto p : productos) {
            if (p.equalsIgnoreCase(nombre)) {
                encontrado = nombre;
                break;
            }
        }
        if (encontrado != null) {
            productos.remove(encontrado);
        }
    }

    boolean equalsIgnoreCase(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean equalsIgnoreCase(Proveedor p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}