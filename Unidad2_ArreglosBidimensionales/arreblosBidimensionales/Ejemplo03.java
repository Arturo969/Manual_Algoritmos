package arreblosBidimensionales;

import java.util.Scanner;

public class Ejemplo03 {

	public static void main(String[] args) {
		// Genera Matriz con valores Aleatorios
		int fila, columna;
		int numeros[][];
		Scanner scan = new Scanner(System.in);
		System.out.print("INGRESE CANTIDAD DE FILAS: \n");
		fila = scan.nextInt();
		System.out.print("INGRESE CANTIDAD DE COLUMNAS: \n");
		columna = scan.nextInt();
		numeros = new int[fila][columna];

		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < columna; j++) {
				numeros[i][j] = numeros[i][j] = (int) (Math.random() * 10);
				;

			}

		}

		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < columna; j++) {
				System.out.printf("[%2d ]", numeros[i][j]);
			}
			System.out.println();
		}
		scan.close();
	}

}
