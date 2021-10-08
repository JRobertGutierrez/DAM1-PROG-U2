package pruebasString;

import java.util.Scanner;

public class Ejercicio08 {
	/**
	 * Realizar una clase, que permita cargar una direcci�n de mail en el constructor,
	 * luego en otro m�todo mostrar un mensaje si contiene el caracter '@'.
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un mail: ");
		String mail = sc.next();

		// Comprobaci�n de si el mail contiene la @ o no

		boolean cadena = (mail.contains("@"));

		if (cadena) {
			System.out.println("El mail es correcto");
		} else {
			System.out.println("El mail no es correcto");
		}
		sc.close();
	}
}
