package sv.com.principal;

import java.util.Comparator;

public class ComparadorNombres implements Comparator<Cliente> {

	@Override
	public int compare(Cliente o1, Cliente o2) {
		return o1.getNombre().compareTo(o1.getNombre());
	}
	
}
