package busquedaSecuencial;

import java.util.Random;
import java.util.Scanner;

public class BusquedaSecuencial {

	public static void generar(int[] arreglo, int n)
	{
		Random r = new Random();
		for (int i = 0; i < n; i++) 
		{
			arreglo[i] = r.nextInt(101);
		}
	}
	
	public static void mostrar(int[] arreglo, int n)
	{
		for (int i = 0; i < n; i++) {
			System.out.printf("[ %d ]", arreglo[i]);
		}
		System.out.println();
	}
	
		private static int busquedaSecuencial(int[] arreglo, int n, int x) {
			for (int i = 0; i < n; i++) 
			{
				if(x == arreglo[i])
					return i;
			}
			return -1;
		}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingrese la longitud del vector: ");
		int n = scan.nextInt();
		
		int[] arreglo = new int[n];
		
//		Invoca a los métodos generar y mostrar
		generar(arreglo, n);
		mostrar(arreglo, n);
		
//		pide el número a buscar:
		System.out.println("Ingresa el número a buscar: ");
		int x = scan.nextInt();
		
//		Invocamos al metodo de búsqueda secuencial:
		int posicion = busquedaSecuencial(arreglo, n, x);
		if(x == -1)
			System.out.println("No se encontró el número");
		else
			System.out.println("El número " + " está en la posición " + posicion);
		scan.close();
	}


}
