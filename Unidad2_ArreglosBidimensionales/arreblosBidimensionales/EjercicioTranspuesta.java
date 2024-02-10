package arreblosBidimensionales;

import java.util.Scanner;

public class EjercicioTranspuesta {

	public static void main(String[] args) {
		// Matriz Transpuesta:
		Scanner leer = new Scanner(System.in);

		System.out.println("INGRESE LA CANTIDAD DE FILAS: ");
		int filas = leer.nextInt();
		System.out.println("INGRESE LA CANTIDAD DE COLUMNAS: ");
		int columnas = leer.nextInt();

		// Genera una Matriz aleatoria
		int matriz[][] = new int[filas][columnas];
		int transpuerta[][] = new int[columnas][filas];

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {

				matriz[i][j] = (int) (Math.random() * 10);

				transpuerta[j][i] = matriz[i][j];
			}

		}
		System.out.println("========MATRIZ ORIGINAL======");
		mostrarMatriz(matriz);
		System.out.println("\n======MATRIZ TRANSPUESTA=======");
		mostrarMatriz(transpuerta);
		leer.close();
	}
	//Muestra la matriz
	private static void mostrarMatriz(int[][] matriz) {
		for (int f = 0; f < matriz.length; f++) {
			System.out.println();
			for (int c = 0; c < matriz[f].length; c++) {
				System.out.printf("[%d]", matriz[f][c]);
			}
		}
	}
	

}
