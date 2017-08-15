package co.edu.calculadora.vista;

import java.util.Arrays;
import java.util.Scanner;

import co.edu.calculadora.controlador.Calculadora;
import co.edu.calculadora.excepcion.ParamtroInvalidado;
import co.edu.calculadora.modelo.Operable;
import co.edu.calculadora.modelo.OperacionTipo;
import co.edu.calculadora.modelo.Parametro;

public class Vista {

	private Calculadora calculadora;

	public void ejecutar() {
		Scanner scanner = new Scanner(System.in);
		calculadora = new Calculadora();

		System.out.println("Master Calculator Bienvenido!!!");
		boolean flag = true;
		while (flag) {
			System.out.println("Por favor seleccione una operacion:");
			System.out.println(Arrays.toString(OperacionTipo.values()));
			System.out.println();
			String valor = scanner.next();
			flag = validarSalida(valor);
			if (!flag) {
				break;
			}
			Operable operacion = crearOperacion(valor);
			cargarParametros(operacion, scanner);
			calcularResultado(operacion, scanner);

		}
	}

	private boolean validarSalida(String valor) {
		if (valor.equalsIgnoreCase("q")) {
			System.out.println("Gracias por usar nuestros servicios");
			System.out.println("Vuelva pronto!!!");
			return false;
		}
		return true;
	
	}

	private void calcularResultado(Operable operacion, Scanner scanner) {
		if (operacion != null) {
			try {
				System.out.println("Resultado: " + calculadora.calcular(operacion));
			} catch (ParamtroInvalidado e) {
				System.out.println("Error al calcular la operacion");
			}
		}
	}

	private Operable crearOperacion(String valor) {
		try {
			return calculadora.obtener(valor);
		} catch (Exception e) {
			System.out.println("Ha seleccionado una operacion incorrecta");
		}
		return null;
	}

	private void cargarParametros(Operable operacion, Scanner scanner) {
		if (operacion != null) {
			while (operacion.contarParamteros() < operacion.obtenerNumeroParamteros()) {
				System.out.println("Ingrese un numero");
				String linea = scanner.next();
				try {
					Parametro parametro = new Parametro(Integer.parseInt(linea));
					operacion.agregarParametro(parametro);
				} catch (Exception e) {
					System.out.println("Numero invalido");
				}

			}
		}
	}

	public static void main(String[] args) {
		new Vista().ejecutar();
	}

}
