package co.edu.calculadora.modelo;

import java.util.ArrayList;
import java.util.List;

public abstract class Operacion implements Operable {

	List<Paramtero> paramteros = new ArrayList<Paramtero>();

	public void agregarParametro(Paramtero parametro) {
		this.paramteros.add(parametro);
	}

}
