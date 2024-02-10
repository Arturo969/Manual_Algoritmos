package arreblosBidimensionales;

import java.util.Scanner;

public class EjercicioMultiplicacionMatricial {

	public static void main(String[] args) {
		// Multiplicación Matricial:
		Scanner leer = new Scanner(System.in);
		System.out.println("CANTIDAD DE FILAS MATRIZ 1: ");
		int filas1 = leer.nextInt();
		System.out.println("CANTIDAD DE COLUMNAS MATRIZ 1: ");
		int columnas1 = leer.nextInt();
		System.out.println("CANTIDAD DE FILAS MATRIZ 2: ");
		int filas2 = leer.nextInt();
		System.out.println("CANTIDAD DE COLUMNAS MATRIZ 2: ");
		int columnas2 = leer.nextInt();
		// verificamos si se pueden multiplicar:
		if (columnas1 != filas2) {
			System.out.println("Esta matriz no se puede multiplicar");
			leer.close();
			return;
		}
		// generamos las matrices:
		int matriz1[][] = generarMatriz(filas1, columnas1);
		int matriz2[][] = generarMatriz(filas2, columnas2);
		int resultado[][] = new int[filas1][columnas2];
		for (int i = 0; i < filas1; i++) {
			for (int j = 0; j < columnas2; j++) {
				for (int k = 0; k < columnas1; k++) {
					resultado[i][j] += matriz1[i][k] * matriz2[k][j];
				}
			}
		}
		System.out.println("PRIMERA MATRIZ: ");
		mostrarMatriz(matriz1);
		System.out.println("\nSEGUNDA MATRIZ: ");
		mostrarMatriz(matriz2);
		System.out.println("\nMULTIPLICACION DE LAS MATRICES:");
		mostrarMatriz(resultado);
		leer.close();
	}

	static int[][] generarMatriz(int filas, int columnas) {
		int matriz[][] = new int[filas][columnas];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int) (Math.random() * 10);
			}
		}
		return matriz;
	}

	private static void mostrarMatriz(int[][] matriz) {
		for (int f = 0; f < matriz.length; f++) {
			System.out.println();
			for (int c = 0; c < matriz[f].length; c++) {
				System.out.printf("%4d", matriz[f][c]);
			}

		}
	}

}
