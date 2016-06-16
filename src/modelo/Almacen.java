
package modelo;

import java.io.*;
import java.util.*;

public class Almacen implements Serializable {
    private final String nombre = "Almacen S.A.";
    private ArrayList<Proveedor> proveedores;

    public Almacen(ArrayList<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }
    
    public Almacen() {
        this.proveedores = new ArrayList();
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