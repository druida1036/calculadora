package co.edu.calculadora.controlador;

import co.edu.calculadora.excepcion.ParamtroInvalidado;
import co.edu.calculadora.modelo.Operable;
import co.edu.calculadora.modelo.OperacionTipo;
import co.edu.calculadora.servicio.CalculadoraServicios;

public class Calculadora {
	
	private CalculadoraServicios servicio = new CalculadoraServicios();

	public Operable obtener(String valor){
		return servicio.obtenerOperacion(OperacionTipo.obtenerValor(Integer.parseInt(valor)));
	}
	
	public String calcular(Operable operacion) throws ParamtroInvalidado{
		return servicio.calcular(operacion);
	}
}
