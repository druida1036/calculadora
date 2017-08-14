package co.edu.calculadora.vista;

import java.util.Arrays;
import java.util.Scanner;

import co.edu.calculadora.controlador.Calculadora;
import co.edu.calculadora.modelo.OperacionTipo;

public class Vista {
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculadora calculadora = new Calculadora();
		
		System.out.println("Bienvenido escoja una operacion:");
		System.out.println(Arrays.toString(OperacionTipo.values()));
		while(scanner.hasNext()){
			System.out.println();
			
			String linea = scanner.next();
			System.out.println("valor: "+linea);
			calculadora.obtener(linea);
			if(linea.equalsIgnoreCase("q")){
				break;
			}
		}
		scanner.close();
	}

}
