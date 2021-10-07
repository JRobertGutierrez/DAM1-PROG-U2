package pruebasString;

import java.util.Scanner;

public class Ejercicio6 {
	/**
	 * Realizar un programa que haga lo siguiente: 
	 * 1) Pida al usuario un n�mero entero comprendido entre [10,25] y repita 
	 * la solicitud en caso de que el n�mero no pertenezca al intervalo. 
	 * 
	 * 2) Una vez introducido el n�mero el programa debe
	 * detectar si es divisible por 5 y mostrar el mensaje adecuado. 
	 * 
	 * 3) Luego, el programa pedir� al usuario su nombre para mostrarle lo siguiente: 
	 * N�mero de caracteres del nombre Car�cter inicial y final Nombre en may�sculas
	 * Indicaci�n de si la letra � o la � forman parte de su nombre. 
	 * 
	 * NOTA 1: las excepciones deben gestionarse con la cl�usula �throws IOException�.
	 * NOTA 2: la letra � es el car�cter 164 de la tabla Unicode, la � el 165.
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = 0;

		while (n < 10 || n > 25) {
			System.out.println("Introduce un n�mero entero entre 10 y 25: ");
			n = sc.nextInt();
		}

		if (n >= 10 || n <= 25) {

			if (n % 5 == 0) {
				System.out.println("Es m�ltiplo de 5");
			} else {
				System.out.println("No es multiplo de 5");

			}
		}

		System.out.println("Introduce tu nombre: ");
		System.out.println("*********************");
		String cadena = sc.next();

		// Cantidad de letras o caracteres del nombre introducido
		System.out.println("El nombre tiene " + cadena.length() + " letras");

		// Primera letra y �ltima del nombre introducido
		int posFinal = cadena.length() - 1; // Restamos uno para obtener el �ndice del ultimo caracter
		char letraFinal = cadena.charAt(posFinal);// Obtenemos el car�cter de dicha posici�n
		System.out.println("La primera letra es la " + cadena.charAt(0) + " y la �ltima letra es la " + letraFinal);

		// Cambiar a mayusculas el nombre introducido
		System.out.println("El nombre en may�sculas es: " + cadena.toUpperCase());

		// Comprobaci�n de si el nombre contiene la letra � o no
		// String letra=("�");
		// String letra2=("�");
		boolean cadena1 = (cadena.contains("�") || cadena.contains("�"));

		if (cadena1) {
			System.out.println("El nombre contiene la letra � o �");
		} else {
			System.out.println("El nombre no contiene la letra � o �");
		}
		sc.close();
	}
}