package co.edu.calculadora.servicio;

import co.edu.calculadora.excepcion.ParamtroInvalidado;
import co.edu.calculadora.modelo.Operable;
import co.edu.calculadora.modelo.OperacionTipo;
import co.edu.calculadora.modelo.Suma;

public class CalculadoraServicios {

	public Operable obtenerOperacion(OperacionTipo tipo) {
		switch (tipo) {
		case SUMA:
			return new Suma();

		default:
			return new Suma();
		}
	}

	public boolean validarCantidadParamteros(Operable operacion) {
		return operacion.obtenerNumeroParamteros() == operacion
				.contarParamteros();
	}
	
	public String calcular(Operable operacion) throws ParamtroInvalidado{
		if (validarCantidadParamteros(operacion)) {
			return operacion.mostarResultado();
		}else{
			throw new ParamtroInvalidado("Parametros invalidos");
		}
	}

}
