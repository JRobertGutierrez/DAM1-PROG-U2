package pruebasString;

import java.util.*;

public class Ejercicio07 {
	/**
	 * Verificar si la cadena de texto almacenada en la String nif, es un NIF correcto o
	 * no. Si lo es, se mostrar� por consola su parte num�rica; si no lo es se mostrar�
	 * el mensaje "NIF no valido". Se tendr� en cuenta lo siguiente: Los NIFs tienen 8
	 * d�gitos y, a continuaci�n, una letra (no importa que sea may�scula o min�scula).
	 * 
	 * @author Robert G
	 */
		
	// Metodo para obtener la letra de un DNI
	public static void obtenerletra(int numero) {
		
		int resto = numero % 23;
		String letras[] = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V",
				"H", "L", "C", "K", "E" };
		System.out.println("La letra es: " + letras[resto]);

	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		boolean correcto = true;
		System.out.println("Introduce el NIF: ");
		String nif = sc.next();
		if (nif.length() == 9) {
			for (int i = 0; i < 8; i++) {
				if (Character.isLetter(nif.charAt(i))) {
					correcto = false;
				} else {
					if (Character.isLetter(nif.charAt(8))) {
						if (correcto) {
							correcto = true;
						}
					} else {
						correcto = false;
					}
				}
			}
		} else {
			correcto = false;
		}
		if (correcto) {
			System.out.println("El NIF introducido es correcto");
		} else {
			System.out.println("El NIF introducido no es correcto");
		}
		
		System.out.println("Introduce DNI sin letra para obtenerla");
		int numero = sc.nextInt();
		obtenerletra(numero);
		sc.close();
	}
}