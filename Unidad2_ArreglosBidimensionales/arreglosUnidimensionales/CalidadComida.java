package arreglosUnidimensionales;

import java.util.Scanner;

public class CalidadComida {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] calificacion = new int[20];
		for (int i = 0; i < calificacion.length; i++) {
			calificacion[i] = (int) (Math.random() * 6 + 1);
		}
		System.out.printf(" %15s\t | \t %15s %n", "# ESTUDIANTE", "CALIFICACIÓN");
		System.out.println("-------------------------------------------------");
		for (int i = 0; i < calificacion.length; i++) {

			System.out.printf("%4d° ESTUDIANTE \t | \t %9d %n", i + 1, calificacion[i]);
		}
		// (secuencias, variables)\n
		scan.close();
	}
}
