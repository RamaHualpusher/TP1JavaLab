package Domain;

import java.util.Map;

public class Tienda {
    private String nombre;
    private long maxProductosStock;
    private double saldoCaja;
    private Map<String, Producto> productos;

    public Tienda() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getMaxProductosStock() {
        return maxProductosStock;
    }

    public void setMaxProductosStock(long maxProductosStock) {
        this.maxProductosStock = maxProductosStock;
    }

    public double getSaldoCaja() {
        return saldoCaja;
    }

    public void setSaldoCaja(double saldoCaja) {
        this.saldoCaja = saldoCaja;
    }

    public Map<String, Producto> getProductos() {
        return productos;
    }

    public void setProductos(Map<String, Producto> productos) {
        this.productos = productos;
    }
}
