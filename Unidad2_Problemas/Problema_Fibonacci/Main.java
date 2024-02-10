package Problema_Fibonacci;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci f = new Fibonacci();
		Scanner scan = new Scanner(System.in);
		System.out.println("¿Hasta qué término de la serie de Fibonacci que desea calcular?");
		int n = scan.nextInt();

		for (int i = 0; i <= n; i++) {
			System.out.printf("F%d° = %d \n", i, f.fibonacci(BigInteger.valueOf(i)));
		}
		scan.close();
	}

}
