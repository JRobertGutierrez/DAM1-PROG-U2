package pruebasString;

import javax.swing.JOptionPane;

public class PalabraSecreta {
	/**
	 * Programa donde un usuario introduce una palabra secreta y otro tiene que intentar
	 * adivinarla en menos de 3 intentos o los que queramos poner cambiando el n�mero.
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {
		int intentos = 0;
		String secreta, palabra;

		secreta = JOptionPane.showInputDialog("Introduzca la palabra secreta");
		do {
			palabra = JOptionPane.showInputDialog("Intenta averiguar la palabra, intento: " + (intentos + 1));
	// Se seguir�n dando oportunidades mientras que el usuario no acierte ni consuma los intentos
		} while (!palabra.equalsIgnoreCase(secreta) && ++intentos < 3);
		if (intentos == 3) {
			JOptionPane.showMessageDialog(null, "Lo siento, la palabra secreta era: " + secreta);
		} else {
			JOptionPane.showMessageDialog(null, "Enhorabuena!!");
		}
	}
}
