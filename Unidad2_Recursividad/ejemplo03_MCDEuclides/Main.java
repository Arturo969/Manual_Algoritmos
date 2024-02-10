package ejemplo03_MCDEuclides;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MetodoEuclides maximo = new MetodoEuclides();
		System.out.println("Ingrese el primer valor: ");
		int m = scan.nextInt();
		System.out.println("Ingrese el segundo valor: ");
		int n = scan.nextInt();
		System.out.printf("El máximo común divisor de %d y %d es %d", m, n, maximo.mcd(m, n));
		maximo.mcd(m, n);
		scan.close();
	}

}
