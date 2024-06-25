package sv.com.principal;

import java.util.Iterator;
import java.util.Stack;

public class Canasta<T> {
	private Stack<T> productos = new Stack<T>();

	public void agregarProducto(T obj) {
		productos.push(obj);

	}

	public Stack<T> getProductos() {
		return productos;
	}

	public void setProductos(Stack<T> productos) {
		this.productos = productos;
	}

	public void quitarProducto(T obj) {

		Iterator<T> iterator = productos.iterator();
		while (iterator.hasNext()) {
			T elem = iterator.next();
			if (elem == obj) {
				iterator.remove();
				System.out.println("Producto que se quito de la canasta: " + elem);
				break;
			}

		}
	}

}
