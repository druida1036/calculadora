package co.edu.calculadora.modelo;


public class Resta extends Operacion {

	public int obtenerNumeroParamteros() {
		return 2;
	}

	public String mostarResultado() {
		int total = paramteros.get(0).getValor()-paramteros.get(1).getValor();
		return new Integer(total).toString();
	}

	public int contarParamteros() {
		return paramteros.size();
	}

}
