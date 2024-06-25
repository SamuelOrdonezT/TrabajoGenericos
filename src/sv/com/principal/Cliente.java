package sv.com.principal;

public class Cliente {
	private String nombre;
	private Canasta<Cobrable> canasta;

	public Cliente(String nombre, Canasta<Cobrable> canasta) {
		this.nombre = nombre;
		this.canasta = canasta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Canasta<Cobrable> getCanasta() {
		return canasta;
	}

	public void setCanasta(Canasta<Cobrable> canasta) {
		this.canasta = canasta;
	}

	public void pagar(float monto) {
		System.out.printf("%s paga %s dolares con tarjeta de credito %n", nombre, monto);

	}

}
