package modelo;

public class ProductoBasico extends Producto {

    private double precioBase;
    private final double iva = 0.05;

    public ProductoBasico(double precioBase, String descripcion, String codigo) {
        super(descripcion, codigo);
        this.precioBase = precioBase;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public double getIva() {
        return iva;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
    
    
    @Override
    public double calcularPrecio() {
        return getPrecioBase() + getPrecioBase()*getIva();
    }
}