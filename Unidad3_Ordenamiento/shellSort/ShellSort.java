package shellSort;

import java.util.Random;
import java.util.Scanner;

public class ShellSort {

	public static void main(String[] args) {
//		Crea un objeto scanner
		Scanner scan = new Scanner(System.in);
		
//		Pide ingresar por teclado la logitud del arreglo
		System.out.println("Ingrese el número de elementos: ");
		int n = scan.nextInt();
		
//		Crea el arreglo con la longitud ingresada
		int[] arreglo = new int[n];
		
//		Genera y muestra el arreglo creado
		generar(arreglo);
		System.out.println("Arreglo sin ordenar: ");
		mostrar(arreglo);
		
		System.out.println();
		System.out.println("Arreglo ordenado: ");
		shell(arreglo, n);
		mostrar(arreglo);

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
	
	

//	Método para mostrar el arreglo
	public static void mostrar(int[] arreglo) {
		// Muestra el arreglo ingresado al método:
		System.out.print("[ ");
		for (int i = 0; i < arreglo.length; i++) {
			System.out.printf("%d ",arreglo[i]);
		}
		System.out.print("]");
	}
	
//	Método para generar valores aleatorios y guardarlos en el arreglo
	public static void generar(int[] arreglo) {
		// Generar un arreglo aleatorio
		Random r = new Random();
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = r.nextInt(100);
		}
		
	}
}
