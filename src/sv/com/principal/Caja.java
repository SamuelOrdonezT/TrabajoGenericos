package sv.com.principal;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Caja {
	private Queue<Cliente> cola = new LinkedList<>();

	public void agregarCliente(Cliente cliente) {
		cola.add(cliente);
	}

	public void cobrar() {

		while (!cola.isEmpty()) {
			Cliente cliente = cola.poll();
			System.out.printf("Cliente: %s  ", cliente.getNombre());

			Canasta<?> canasta = cliente.getCanasta();
			Stack<?> pilaDeProductos = canasta.getProductos();
			float precioPagar = 0;

			while (!pilaDeProductos.isEmpty()) {
				Producto producto = (Producto) pilaDeProductos.pop();
				System.out.printf("Producto: %s,  Precio: $%s%n%n", producto.getNombreProducto(), producto.getPrecio());

				precioPagar += producto.getPrecio();
			}

			cliente.pagar(precioPagar);
		}
	}
}
