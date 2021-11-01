package pruebasArray;

import java.util.Scanner;

public class ArrayMeses02 {
	/**
	 * Programa que pide introducir un n�mero del 1 al 12 para despu�s mostrar el mes del
	 * a�o
	 * 
	 * @author Robert G
	 */
	private String[] es = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
			"Octubre", "Noviembre", "Diciembre" };
	private String[] en = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
			"October", "November", "December" };

	public void imprimir() {
		Scanner m = new Scanner(System.in);
		int i = 0;

		try {
			while (i >= 0 && i <=12) {
				System.out.println("Introduce un n�mero entre 1 y 12 para mostrar el mes o pulsa 13 para acabar");
				i = m.nextInt() - 1;
				if (i >= 0 && i <=12) {
					System.out.println("El mes en espa�ol es: " + es[i]);
					System.out.println("El mes en ingl�s es:" + en[i]);
				} else {
					System.out.println("Opcion incorrecta");
					imprimir();
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Has salido del programa y has provocado esta excepci�n -> "
					+ e.getClass().getName());
		}
		m.close();
	}

	public static void main(String[] args) {

		ArrayMeses02 m = new ArrayMeses02();
		m.imprimir();
	}
}