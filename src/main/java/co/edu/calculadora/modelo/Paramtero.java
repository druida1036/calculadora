package co.edu.calculadora.modelo;

public class Paramtero {
	private int valor;
	private int signo = ParametroSigno.POSITIVO.getSigno();
	
	public Paramtero(int valor, int signo) {
		super();
		this.valor = valor;
		this.signo = signo;
	}

	public Paramtero(int valor) {
		super();
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getSigno() {
		return signo;
	}

	public void setSigno(int signo) {
		this.signo = signo;
	}
	

}
