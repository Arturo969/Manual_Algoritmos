package arreblosBidimensionales;

import java.util.Scanner;

public class Ejemplo02 {

	public static void main(String[] args) {
		// Genera Matriz Con valores ingresados por teclado
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
				System.out.printf("Ingrese la posicion [%d][%d]", i + 1, j + 1);
				numeros[i][j] = scan.nextInt();
			}
			System.out.println();
		}

		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < columna; j++) {
				System.out.printf("[ %d ]", numeros[i][j]);
			}
			System.out.println();
		}
		scan.close();
	}

}
