package co.edu.calculadora.modelo;

public enum ParametroSigno {
	POSITIVO(1),
	NEGATIVO(-1);
	private final int signo;
	private ParametroSigno(int signo) {
		this.signo = signo;
	}
	
	public int getSigno() {
		return signo;
	}

}
