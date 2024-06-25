package sv.com.principal;

public class Producto implements Cobrable {
	private String nombreProducto;
	private float precio;

	public Producto(String nombreProducto, float precio) {
		this.nombreProducto = nombreProducto;
		this.precio = precio;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [nombreProducto=" + nombreProducto + ", precio=" + precio + "]";
	}

}
