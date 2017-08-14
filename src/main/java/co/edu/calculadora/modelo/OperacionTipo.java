package co.edu.calculadora.modelo;

import java.util.HashMap;
import java.util.Map;

public enum OperacionTipo {
	SUMA(1, "Digite 1 -Suma"), RESTA(2, "Digite 2 -Resta");

	private final String texto;
	private int valor;
	private static Map<Integer, OperacionTipo> map = new HashMap<Integer, OperacionTipo>();

	OperacionTipo(int valor, String texto) {
		this.setValor(valor);
		this.texto = texto;
	}

	static {
		for (OperacionTipo operacionTipo : OperacionTipo.values()) {
			map.put(operacionTipo.valor, operacionTipo);
		}
	}

	public String getTexto() {
		return texto;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return texto;
	}

	public static OperacionTipo obtenerValor(int valor) {
		return map.get(valor);
	}
}
