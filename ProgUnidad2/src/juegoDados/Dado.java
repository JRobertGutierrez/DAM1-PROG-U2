package juegoDados;

public class Dado {
	/**
	 * Clase Dado donde creo el m�todo lanzar para obtener un n�mero aleatorio entre 1 y
	 * 6 y adem�s creo el m�todo imprimirValor para mostrar el resultado obtenido.
	 * 
	 * @author Robert G
	 */
	private int valor;

	Dado() {
		valor = 1;
	}

	public void lanzar() {
		valor = ((int) (Math.random() * 6) + 1);
	}

	public int getvalor() {
		return valor;
	}

	public void imprimirValor() {
		System.out.println("Saca un " + valor);
	}
}