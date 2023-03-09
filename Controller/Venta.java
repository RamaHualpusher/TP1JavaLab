package Controller;

import Domain.Producto;
import Domain.Tienda;

import java.util.Map;
import java.util.Scanner;

public class Venta {
    public static void vender(Tienda tienda, Producto producto){
        int contador = 0;
        int salir = 0;
        int cantidad = 0;
        boolean productosConDiferenciaDeStock = false;
        Map<String, Producto> productos = tienda.getProductos();
        StringBuffer sb = new StringBuffer();
        do{
            Producto productoSeleccionado = seleccionarProducto(productos);
            cantidad = ingresarCantidad();


            if( productoSeleccionado.getCantidadStock() >= cantidad) {
                productoSeleccionado.setCantidadStock(productoSeleccionado.getCantidadStock() - cantidad);
                tienda.setSaldoCaja(tienda.getSaldoCaja() + (productoSeleccionado.getPrecioUnitario() * cantidad));
            }else if(productoSeleccionado.getCantidadStock() < cantidad && productoSeleccionado.getCantidadStock() > 0){
                cantidad = productoSeleccionado.getCantidadStock();
                productoSeleccionado.setCantidadStock(productoSeleccionado.getCantidadStock() - cantidad);
                productosConDiferenciaDeStock = true;
            }else if(productoSeleccionado.getCantidadStock() == 0){
                System.out.println("El producto seleccionado no tiene stock");
                continue;
            }
            sb.append(productoSeleccionado.getId() + " " + productoSeleccionado.getDescripcion() + " " + cantidad + " x $" + productoSeleccionado.getPrecioUnitario());
            if(productosConDiferenciaDeStock){
                sb.append(" (No hay stock suficiente, se vendieron " + cantidad + " unidades)");
            }
            sb.append("/n");
            contador++;
            salir = ingresarSalir();
        }while (contador < 3 || salir!=0);



    }
    public static Producto seleccionarProducto(Map<String, Producto> productos) {
        System.out.println("Seleccione el producto que desea comprar");
        productos.forEach((key, value) -> System.out.println(key + " " + value.getDescripcion() + " " + value.getPrecioUnitario()));
        //Ingresar por pantalla el codigo del producto
        Scanner scanner = new Scanner(System.in);
        String codigoProducto;
        do {
            codigoProducto = scanner.nextLine();
            if(!productos.get(codigoProducto).isDisponible()){
                System.out.println("El producto seleccionado no tiene stock, ingrese nuevamente");
                continue;
            }
            if (!productos.containsKey(codigoProducto)) {
                System.out.println("El codigo ingresado no existe, ingrese nuevamente");
            }
        } while (!productos.containsKey(codigoProducto) && (!productos.get(codigoProducto).isDisponible()));
        return productos.get(codigoProducto);
    }
    public static int ingresarCantidad(){
        System.out.println("Ingrese la cantidad que desea comprar");
        Scanner scanner = new Scanner(System.in);
        int cantidad;
        do {
            cantidad = scanner.nextInt();
            if (cantidad <= 0) {
                System.out.println("La cantidad ingresada no es valida, ingrese nuevamente");
            }
        } while (cantidad <= 0 && (cantidad >= 10));
        return cantidad;
    }

    public static int ingresarSalir(){
        System.out.println("Desea salir? 1:Si 0:No");
        Scanner scanner = new Scanner(System.in);
        int salir;
        do {
            salir = scanner.nextInt();
            if (salir != 1 && salir != 0) {
                System.out.println("La opcion ingresada no es valida, ingrese nuevamente");
            }
        } while (salir != 1 && salir != 0);
        return salir;
    }


}
