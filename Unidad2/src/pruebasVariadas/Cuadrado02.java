package pruebasVariadas;

import java.util.Scanner;

public class Cuadrado02 {
	/**
	 * Programa que pide datos al usuario y halla el area y el per�metro de un cuadrado,
	 * otra forma diferente a Cuadrado01
	 * 
	 * @author Robert G
	 */
	Scanner sc;
	int lado;

	// Constructor sin par�metros
	Cuadrado02() {
		lado = 0;
	}

	// Constructor con par�metros
	Cuadrado02(int l) {
		lado = l;
	}

	// Imprime el �rea
	public void area() {
		System.out.println("El �rea es: " + (lado * lado) + "m^2");
	}

	// Imprime el per�metro
	public void perimetro() {
		System.out.println("El per�metro es: " + (4 * lado) + "m");
	}

	// Pide el valor del lado al usuario
	public void inicializar() {
		sc = new Scanner(System.in);
		System.out.println("Introduce un lado");
		lado = sc.nextInt();
	}

	public static void main(String[] args) {
		Cuadrado02 c = new Cuadrado02();
		c.inicializar();
		c.area();
		c.perimetro();
	}
}