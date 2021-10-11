package pruebasVariadas;

import java.util.Scanner;

public class Cuadrado01 {
	/**
	 * Programa que pide datos al usuario y halla el area y el per�metro de un cuadrado,
	 * 
	 * @author Robert G
	 */
	Scanner sc;
	int lado;

	// Constructor sin par�metros
	Cuadrado01() {
		lado = 0;
	}

	// Constructor con par�metros
	Cuadrado01(int l) {
		lado = l;
	}

	// Calcula el �rea
	public int area() {
		// System.out.println("El �rea es: "+(lado*lado));
		return (lado * lado);
	}

	// Imprime el per�metro
	public int perimetro() {
		// System.out.println("El per�metro es: "+(4*lado));
		return (4 * lado);
	}

	// Pide el valor del lado al usuario
	public void inicializar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un lado");
		lado = sc.nextInt();
		sc.close();
	}

	public static void main(String[] args) {
		Cuadrado01 c = new Cuadrado01();
		c.inicializar();
		System.out.println("El �rea es: " + c.area() + "m^2");
		System.out.println("El per�metro es: " + c.perimetro() + "m");

	}
}