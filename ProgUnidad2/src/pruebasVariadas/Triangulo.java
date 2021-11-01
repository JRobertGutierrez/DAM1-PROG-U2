package pruebasVariadas;

import java.util.Scanner;

public class Triangulo {
	/**
	 * Programa que pide los 3 lados de un tri�ngulo y determina si es Equil�tero(3 lados
	 * iguales), Is�sceles(2 lados iguales) o Escaleno(ning�n lado igual).
	 * 
	 * Tambi�n he incluido un m�todo para hallar el �rea de un rect�ngulo.
	 * 
	 * @author Robert G
	 */
	private int lado1, lado2, lado3;
	Scanner teclado;

	Triangulo() {
		lado1 = 0;
		lado2 = 0;
		lado3 = 0;
	}

	Triangulo(int i, int j, int k) {
		lado1 = i;
		lado2 = j;
		lado3 = k;
	}

	public void inicializar() {
		teclado = new Scanner(System.in);
		System.out.println("Introduce el lado 1");
		lado1 = teclado.nextInt();
		System.out.println("Introduce el lado 2");
		lado2 = teclado.nextInt();
		System.out.println("Introduce el lado 3");
		lado3 = teclado.nextInt();
	}

	// Imprimir los valores de tri�ngulo
	public void mostrarloslados() {
		System.out.println("los lados son " + lado1 + " " + lado2 + " " + lado3);
	}

	// M�todo que determina de tipo es el tri�ngulo
	public void esTipo() {
		if (lado1 == lado2 && lado2 == lado3)
			System.out.println("El tri�ngulo es Equil�tero");
		else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3)
			System.out.println("El tri�ngulo es Is�sceles");
		else
			System.out.println("El tri�ngulo es Escaleno");
	}

	// M�todo para hallar el area de un rect�ngulo
	public int area(int base, int altura) {
		return ((base * altura) / 2);
	}

	public static void main(String[] args) {

		Triangulo t1 = new Triangulo();
		Triangulo t2 = new Triangulo();
		Triangulo t3 = new Triangulo();

		t1.inicializar();
		t1.mostrarloslados();
		t1.esTipo();

		t2.inicializar();
		t2.mostrarloslados();
		t2.esTipo();

		t3.inicializar();
		t3.mostrarloslados();
		t3.esTipo();

		Triangulo rectangulo = new Triangulo();
		int area = rectangulo.area(4, 3);
		System.out.println("\nEl area del rect�ngulo es: " + area);
	}
}