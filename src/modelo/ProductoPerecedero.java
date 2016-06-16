package modelo;

public class ProductoPerecedero extends Producto {
    private double preciounico;
    private final double iva = 0.10;

    public ProductoPerecedero(double preciounico, String descripcion, String codigo) {
        super(descripcion, codigo);
        this.preciounico = preciounico;
    }

    public double getPreciounico() {
        return preciounico;
    }

    public void setPreciounico(double preciounico) {
        this.preciounico = preciounico;
    }

    public double getIva() {
        return iva;
    }

    @Override
    public double calcularPrecio() {
        return getPreciounico() + getPreciounico()*getIva();
    }
}