package Domain;

import Controller.Saldo;
import Controller.Stock;

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

    public void comprarProducto(Producto producto, int cantidad){
        if(Saldo.verificarSaldo(this, cantidad) && Stock.verificarStock(this, producto, cantidad)){
            Saldo.actualizarSaldo(this, cantidad);
            Stock.actualizarStock(this, producto, cantidad);
            this.getProductos().put(producto.getId(), producto);
        }else {
            System.out.println("No se puede realizar la compra");
        }

    }
}
