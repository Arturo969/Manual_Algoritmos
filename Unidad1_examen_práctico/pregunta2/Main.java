package pregunta2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Crear un algoritmo que solicite un numerador y un denominador con visibilidad
		 * en privado y que muestre en una clase diferente la fracción formada, tener en
		 * cuenta que, si el denominador es cero, debe ser asignado el número 1
		 */
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);

		NumyDen fraccion = new NumyDen();
		fraccion.ingresarFraccion();
		fraccion.mostrarFraccion();
		leer.close();
	}

}
