package Controller;

import Domain.Producto;
import Domain.Tienda;

public class Saldo {
    /*public static void comprarProducto(Tienda tienda, Producto producto, int cantidad){
        if(verificarSaldo(tienda, cantidad) && Stock.verificarStock(tienda, producto, cantidad)){
            actualizarSaldo(tienda, cantidad);
            Stock.actualizarStock(tienda, producto, cantidad);
            tienda.getProductos().put(producto.getId(), producto);
        }else {
            System.out.println("No se puede realizar la compra");
        }
    }*/

    public static void actualizarSaldo(Tienda tienda, int cantidad){
        double nuevoSaldo = tienda.getSaldoCaja() - cantidad;
        tienda.setSaldoCaja(nuevoSaldo);
    }

    public static boolean verificarSaldo(Tienda tienda, int cantidad){
           return tienda.getSaldoCaja() >= cantidad;
    }
}
