package busquedaBinaria;

import java.util.Random;
import java.util.Scanner;

public class BusquedaBiRecursiva {
	public static void generar(int[] arreglo, int n) {
		Random r = new Random();
		for (int i = 0; i < n; i++) {
			arreglo[i] = r.nextInt(101);
		}
	}

	public static void mostrar(int[] arreglo, int n) {
		for (int i = 0; i < n; i++) {
			System.out.printf("[ %d ]", arreglo[i]);
		}
		System.out.println();
	}
	public static void shell(int arr[], int n) 
	{
//		Este bucle se repetira mientras es espacio sea mayor que cero, en cada ciclo divide al espacio nuevamente entre 2
		for(int espacio = n/2; espacio > 0; espacio /= 2)
		{
//			Este ciclo recorre el arreglo desde arr[espacio] hasta arr[n]
			for(int i = espacio; i < n; i++)
			{
//				Se guarda el valor de la posición arr[i] (arr[espacio] en el primer ciclo) en una variable temporal
				int temp = arr[i];
//				apuntador j
				int j;
//				Inicializa j = i, se evalua si j es mayor o igual al espacio y el arr[j - espacio] sea mayor a temporal.
				for(j = i; j >= espacio && arr[j - espacio] > temp; j -= espacio)
				{
//					Si arr[j - espacio] > hacer:
					arr[j] = arr[j - espacio];
				}
				arr[j] = temp;
			}
		}  
    }
	
	private static int busquedaBinariaRecursiva(int[] arreglo, int n, int x, int iIzquierdo, int iDerecho) {
//		Realizar búsqueda binaria mientras Límite izquierdo sea menor o igual al índice derecho

		if(iIzquierdo <= iDerecho) {
//			Calcula la posición media del arreglo
			int medio = (iIzquierdo + iDerecho) / 2;
//			Comprobamos si el valor buscado está en el medio del subarreglo
			if (x == arreglo[medio])
				return medio;
//			Si el valor a buscar es mayor que el elemento de la posicion medio, se busca en la sublista derecha caso contrario en la sub lista izquierda
			if (arreglo[medio] < x)
				return busquedaBinariaRecursiva(arreglo, n, x, medio + 1, iDerecho);
			else
				return busquedaBinariaRecursiva(arreglo, n, x, iIzquierdo, medio-1);
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

//		Ordena de mayor a menor
		shell(arreglo, n);
		System.out.println("Arreglo ordenado: ");
		mostrar(arreglo, n);
		
//		pide el número a buscar:
		System.out.println("Ingresa el número a buscar: ");
		int x = scan.nextInt();
		
//		Guardamos el retorno del método en una variable
		int posicion = busquedaBinariaRecursiva(arreglo, n, x, 0, n-1);
		
		if(posicion == -1)
			System.out.println("No se encontró el número");
		else
			System.out.println("El número " + " está en la posición " + posicion);
		scan.close();
	}

}
