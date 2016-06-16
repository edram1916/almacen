
package modelo;

import java.io.*;
import java.util.*;

public class Almacen implements Serializable {
    private final String nombre = "Almacen S.A.";
    private ArrayList<Proveedor> proveedores;
    
    // el nombre 
    static private String defaultNombreArchivo = "./almacen.dat";

    public Almacen(ArrayList<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }
    
    public Almacen() {
        this.proveedores = new ArrayList();
    }
    
    /* Funciones para persistencia */
    
    public static Boolean existeAlmacen() {
        System.out.println("existeAlmacen()");
        File archivo = new File(defaultNombreArchivo);
        return archivo.exists() && !archivo.isDirectory();
    }
    
    public void almacenarAlmacen() throws IOException {
        System.out.println("almacenarAlmacen()");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(defaultNombreArchivo));
        oos.writeObject(this);
        
        oos.close();
    }
    
    public static Almacen cargarAlmacen() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(defaultNombreArchivo));
        Almacen almacen = (Almacen) ois.readObject();
        return almacen;
    }
    
    public int cantidadProveedores(){
        return proveedores.size();
    }
    
    public void agregarProveedor(Proveedor p){
        proveedores.add(p);
        // if(!existeProveedor(p.getNombre())){

        // }
    }
    
    public boolean existeProveedor (String nombre) {
        for(Proveedor p: proveedores) {
            if (p.equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }
    
    public void editar(int i, Proveedor p) {
        proveedores.set(i, p);
    }
    
    public void borrar(String nombre) {
        int indice = buscarProveedor(nombre);
        if(indice != -1) {
            proveedores.remove(indice);
        }
    }
    
    public int buscarProveedor (String nombre) {
         int indice = -1;
         for(int i = 0 ; i< proveedores.size(); ++i) {
             if(proveedores.get(i).getNombre().equals(nombre)) {
                 indice = 1;
                 break;
             }
         }
         return indice;
    }
    
    public Proveedor getProveedor(int i) { // que pasa si no existe
       
        return proveedores.get(i);
    }
   
 }