package arreglosUnidimensionales;

import java.util.Scanner;

public class GenerarMostrarVector {

	public static void main(String[] args) {
		// Genera y Muestra un Vector
		Scanner leer = new Scanner(System.in);

		// pidiendo la cantidad de elementos
		System.out.println("Ingrese la cantidad de elementos: ");
		int n = leer.nextInt();

		int[] numeros = new int[n];

		// leer el vector y asignarle un valor a cada posición del vector

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Ingrese el valor para, numeros[" + (i + 1) + "]: ");
			numeros[i] = leer.nextInt();
		}

		System.out.println("Los numeros ingresados son: ");
		for (int i = 0; i < numeros.length; i++) {

			System.out.print(numeros[i] + "\t");
		}

		// llenar el arreglo con numeros aleatorios

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * 100);

		}

		System.out.println("Los numeros ingresados son: ");
		for (int i = 0; i < numeros.length; i++) {

			System.out.print(numeros[i] + "\t");
		}
		leer.close();

	}

}
