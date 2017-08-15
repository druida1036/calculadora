package co.edu.calculadora.modelo;

import java.util.HashMap;
import java.util.Map;

public enum OperacionTipo {
	SUMA(1, "Digite 1 -Suma"), RESTA(2, "Digite 2 -Resta"), SALIR(99, "Digite q -Salir");

	private final String texto;
	private int codigo;
	private static Map<Integer, OperacionTipo> map = new HashMap<Integer, OperacionTipo>();

	OperacionTipo(int codigo, String texto) {
		this.codigo = codigo;
		this.texto = texto;
	}

	static {
		for (OperacionTipo operacionTipo : OperacionTipo.values()) {
			map.put(operacionTipo.codigo, operacionTipo);
		}
	}

	public String getTexto() {
		return texto;
	}

	public int getCodigo() {
		return codigo;
	}

	@Override
	public String toString() {
		return texto;
	}

	public static OperacionTipo obtenerValor(int valor) {
		return map.get(valor);
	}
}
