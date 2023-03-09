package Controller;

import Domain.Producto;
import Domain.Tienda;

public class Stock {
    public static void actualizarStock(Tienda tienda, Producto producto, int cantidad){
        int nuevoStock = producto.getCantidadStock() - cantidad;
        producto.setCantidadStock(nuevoStock);
    }

    public static boolean verificarStock(Tienda tienda, Producto producto, int cantidad){
        return producto.getCantidadStock() >= cantidad;
    }
}
