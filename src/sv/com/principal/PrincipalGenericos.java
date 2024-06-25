package sv.com.principal;

import java.util.Iterator;
import java.util.Stack;

public class PrincipalGenericos {

	public static void main(String[] args) {

		Canasta<Cobrable> canastaCliente = new Canasta<Cobrable>();
		Canasta<Cobrable> canastaCliente2 = new Canasta<Cobrable>();
		Caja caja = new Caja();

		Cliente cliente = new Cliente("pedro", canastaCliente);
		Cliente cliente2 = new Cliente("Roberto du santos", canastaCliente2);

		Producto producto = new Producto("jabon para genitales", 9);
		Producto producto2 = new Producto("Desodorante", 10);
		Producto producto3 = new Producto("Comida", 23);
		Producto producto4 = new Producto("Chicles clorex", 2);
		Producto producto5 = new Producto("Pan dulce", 3);

		cliente.getCanasta().agregarProducto(producto);
		cliente.getCanasta().agregarProducto(producto2);
		cliente2.getCanasta().agregarProducto(producto3);
		cliente2.getCanasta().agregarProducto(producto4);
		cliente.getCanasta().agregarProducto(producto5);

		Stack<Cobrable> pilaProductosCliente = cliente.getCanasta().getProductos();
		Iterator<Cobrable> i = pilaProductosCliente.iterator();
		Producto objeto;
		System.out.println("Productos que lleva el primer cliente: " + cliente.getNombre());
		System.out.println();
		while (i.hasNext()) {
			objeto = (Producto) i.next(); // si el asignas este valor casteado a una variable de tipo cobrable, no podras usar los metodos propios de productos
			System.out.printf("Producto: %s%n", objeto.getNombreProducto());
		}

		System.out.println();
		cliente.getCanasta().quitarProducto(producto5);

		caja.agregarCliente(cliente);
		caja.agregarCliente(cliente2);

		caja.cobrar();

	}

}
