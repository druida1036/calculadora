package co.edu.calculadora.modelo;

public interface Operable {
	
	public int obtenerNumeroParamteros();
	public void agregarParametro(Parametro parametro);
	public int contarParamteros();
	public String mostarResultado();

}
