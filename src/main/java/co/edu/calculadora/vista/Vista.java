package co.edu.calculadora.vista;

import java.util.Arrays;
import java.util.Scanner;

import co.edu.calculadora.controlador.Calculadora;
import co.edu.calculadora.excepcion.ParamtroInvalidado;
import co.edu.calculadora.modelo.Operable;
import co.edu.calculadora.modelo.OperacionTipo;
import co.edu.calculadora.modelo.Parametro;

public class Vista {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculadora calculadora = new Calculadora();

		System.out.println("Bienvenido escoja una operacion:");
		System.out.println(Arrays.toString(OperacionTipo.values()));
		while (scanner.hasNext()) {
			System.out.println();
			String linea = scanner.next();
			if (linea.equalsIgnoreCase("q")) {
				break;
			}

			System.out.println("valor: " + linea);
			Operable operacion = calculadora.obtener(linea);
			for (int i = 0; i < operacion.obtenerNumeroParamteros(); i++) {
				System.out.println("Ingrese un numero");
				linea = scanner.next();
				try {
					Parametro parametro = new Parametro(Integer.parseInt(linea));
					operacion.agregarParametro(parametro);
				} catch (Exception e) {
					System.out.println("Numero invalido");
				}

			}
			
			try {
				System.out.println("Resultado: " + calculadora.calcular(operacion));
			} catch (ParamtroInvalidado e) {
				System.out.println("Error al calcular la operacion");
			}

			
		}
		scanner.close();
	}

}
