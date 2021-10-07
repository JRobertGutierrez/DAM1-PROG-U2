package extras;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class DniLetra {
	/**
	 * Verificar si la cadena de texto almacenada en la String nif, es un NIF correcto o
	 * no. Si lo es, se mostrar� por consola su parte num�rica; si no lo es se mostrar�
	 * el mensaje "NIF no valido". Se tendr� en cuenta lo siguiente: Los NIFs tienen 8
	 * d�gitos y, a continuaci�n, una letra (no importa que sea may�scula o min�scula).
	 * 
	 * @author Robert G
	 */

	// M�todo para saber si el DNI tiene nueve caracteres y darlo as� por correcto
	public static void dnicorrecto() {
		Scanner sc = new Scanner(System.in);
		boolean correcto = true;

		System.out.println("Introduce el NIF: ");
		String nif = sc.next();
		nif.equalsIgnoreCase(nif);// Para no distinguir entre mays y minus
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
			sc.close();
		}

	}

	// M�todo para obtener la letra correcta de un DNI
	public static void obtenerletra(int numero) {
		int resto = numero % 23;
		String letras[] = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V",
				"H", "L", "C", "K", "E" };
		System.out.println("La letra es: " + letras[resto]);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		try {
			while (opcion != 3) {
				System.out.println("*************************************");
				System.out.println("Pulse la opci�n deseada");
				System.out.println("1. Para comprobar si el DNI es correcto");
				System.out.println("2. Para averiguar la letra de un DNI");
				System.out.println("3. Salir del programa");
				System.out.println("*************************************");

				opcion = sc.nextInt();

				switch (opcion) {
				case 1:
					dnicorrecto();
					break;
				case 2:
					System.out.println("Introduce DNI sin letra para obtenerla");
					int numero = sc.nextInt();
					obtenerletra(numero);
					break;
				case 3:
					System.out.println("Has salido del programa");
					break;
				}

			}
		} catch (NoSuchElementException e) {
			System.out.println("Falta alg�n car�cter y la excepci�n es esta -> " + e.getClass().getName());
		}
		sc.close();
	}
}