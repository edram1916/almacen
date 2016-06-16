
package modelo;

public class ProductoNoPerecedero extends Producto {
    private double preciobase;
    private final double descuento = 0.07;

    public ProductoNoPerecedero(double preciobase, String descripcion, String codigo) {
        super(descripcion, codigo);
        this.preciobase = preciobase;
    }

    public double getPreciobase() {
        return preciobase;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setPreciobase(double preciobase) {
        this.preciobase = preciobase;
    }
    
    

    @Override
    public double calcularPrecio() {
        return getPreciobase() - getPreciobase()* getDescuento(); 
    }

}
