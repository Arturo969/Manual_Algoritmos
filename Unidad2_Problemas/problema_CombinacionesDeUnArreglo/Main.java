package problema_CombinacionesDeUnArreglo;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5 };
		Scanner scan = new Scanner(System.in);
		CombinacionArreglo c = new CombinacionArreglo();
		System.out.println("Ingrese la cantidad de elementos para cada combinación: ");
		int r = scan.nextInt();
		int n = arr.length;
	
		c.imprimeCombinacion(arr, n, r);
		scan.close();
	}

}
