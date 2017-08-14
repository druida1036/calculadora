package co.edu.calculadora.modelo;

import java.util.ArrayList;
import java.util.List;

public abstract class Operacion implements Operable {

	List<Parametro> paramteros = new ArrayList<Parametro>();

	public void agregarParametro(Parametro parametro) {
		this.paramteros.add(parametro);
	}

}
