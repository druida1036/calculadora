package co.edu.calculadora.modelo;


public class Suma extends Operacion {

	public int obtenerNumeroParamteros() {
		return 2;
	}

	public String mostarResultado() {
		int total = 0;
		for (Parametro paramtero : paramteros) {
			total = total+(paramtero.getValor()*paramtero.getSigno());
		}
		return new Integer(total).toString();
	}

	public int contarParamteros() {
		return paramteros.size();
	}

}
