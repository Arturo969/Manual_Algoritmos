package busquedaBinaria;

import java.util.Random;
import java.util.Scanner;

public class BusquedaBinaria {
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
	
	private static int busquedaBinaria(int[] arreglo, int n, int x) {
//		Límite inferior izquierdo
		int iIzquierdo = 0;
//		Límite superior derecho
		int iDerecho = n-1;
//		Realizar búsqueda binaria mientras Límite izquierdo sea menor o igual al índice derecho
		
		while(iIzquierdo <= iDerecho)
		{
//			indice medio
			int medio = (iIzquierdo + iDerecho)/2;
//			Comprobar si el elemento buscado está en el medio:
			if(arreglo[medio] == x)
				return medio;
//			Si el número a buscar es mayor que el de la posición media. se busca en la sublista derecha
			if(arreglo[medio] < x)
				iIzquierdo = medio + 1;
			else
				iDerecho = medio - 1;
			
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
		int posicion = busquedaBinaria(arreglo, n, x);
		
		if(x == -1)
			System.out.println("No se encontró el número");
		else
			System.out.println("El número " + " está en la posición " + posicion);
		scan.close();
	}

}
