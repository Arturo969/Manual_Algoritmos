package ejemplo07_SumaSucesiva;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int m,M;
		System.out.println("Ingrese el multiplicando: ");
		m=scan.nextInt();
		System.out.println("Ingrese el multiplicador: ");
		M=scan.nextInt();
		SumaSuseciva sum = new SumaSuseciva();
		System.out.printf("\n%d x %d = %d",m,M,sum.sumaSucesiva(m, M));
		scan.close();
	}

}
