package pruebasArray;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperaciones {
	/**
	 * Programa que pide introducir n�meros para almacenar en un array y despues los
	 * muestra haciendo distintas operaciones con los elementos introducidos: Ordeno los
	 * elementos del array y los muesto, suma, media, mayor elemento, n�mero de pares e
	 * impares, buscar un n�mero concreto en el array, suma de pares e impares, cuantos
	 * elementos menores que el primero.
	 * 
	 * @author Robert G
	 */
	private double[] datos;

	// Constructor
	ArrayOperaciones() {
		datos = new double[10];
	}

	// Constructor
	ArrayOperaciones(int tam) {
		datos = new double[tam];
	}

	// M�todo
	public void cargarvalores() {
		Scanner sc = new Scanner(System.in);
		int aux;
		for (int i = 0; i < datos.length; i++) {
			System.out.println("Introduce el valor " + (i + 1));
			aux = sc.nextInt();
			datos[i] = aux;
		}
		sc.close();
		Arrays.sort(datos);// Ordeno los datos de menos a mayor
	}

	// M�todo suma
	public double suma() {
		double s = 0;
		for (int i = 0; i < datos.length; i++) {
			// System.out.println("Sumo: "+s+" + "+datos[i]);
			s = s + datos[i];
		}
		return s;
	}

	// M�todo media
	public double media() {
		return (this.suma() / datos.length);
	}

	// M�todo mayor
	public double mayor() {
		double[] aux2 = new double[datos.length];

		for (int i = 0; i < datos.length; i++)
			aux2[i] = datos[i];

		Arrays.sort(aux2);// Ordena nuestro array datos ascendente de menor a mayor
		System.out.println("Direcci�n de memoria donde empieza aux2 " + aux2);
		return aux2[aux2.length - 1];
	}

	// M�todo pares
	public int Numeropares() {
		int cont = 0;
		for (int i = 0; i < datos.length; i++) {
			if (datos[i] % 2 == 0)
				cont++;
		}
		return cont;
	}

	// M�todo impares
	public int Numeroimpares() {
		int cont = 0;
		for (int i = 0; i < datos.length; i++) {
			if (datos[i] % 2 != 0)
				cont++;
		}
		return cont;
	}

	// M�todo buscar
	public boolean buscar(double busqui) {
		boolean encontrado = false;
		for (int i = 0; i < datos.length; i++)
			if (datos[i] == busqui)
				encontrado = true;
		return encontrado;
	}

	// M�todo sumar pares
	public double sumapospares() {
		double suma = 0;
		for (int i = 0; i < datos.length; i++) {
			if (i % 2 == 0)
				suma = suma + datos[i];
		}
		return suma;
	}

	// M�todo sumar impares
	public double sumaposimpares() {
		double suma = 0;
		for (int i = 0; i < datos.length; i++) {
			if (i % 2 != 0)
				suma = suma + datos[i];
		}
		return suma;
	}

	// M�todo menores que el primero
	public int menoresprimero() {
		int cont = 0;
		for (int i = 0; i < datos.length; i++) {
			if (datos[0] > datos[i])
				cont++;
		}
		return cont;
	}

	public String toString() {
		return Arrays.toString(datos);
	}

	public static void main(String[] args) {

		ArrayOperaciones op = new ArrayOperaciones();
		op.cargarvalores();
		System.out.println(op.toString());
		System.out.println("La suma es: " + op.suma());
		System.out.println("La media de los valores es: " + op.media());
		System.out.println("El mayor elemento es: " + op.mayor());
		System.out.println("El n�mero de pares es: " + op.Numeropares());
		System.out.println("El n�mero de impares es: " + op.Numeroimpares());
		// Pedimos un n�mero al usuario
		if (op.buscar(24))
			System.out.println("El n�mero est� en el array");
		else
			System.out.println("El n�mero no est� en el array");
		System.out.println("La suma de los elementos en la posici�n par es: " + op.sumapospares());
		System.out.println("La suma de los elementos en la posici�n impar es: " + op.sumaposimpares());
		System.out.println("Hay " + op.menoresprimero() + " n�meros menores que el primero");
	}
}