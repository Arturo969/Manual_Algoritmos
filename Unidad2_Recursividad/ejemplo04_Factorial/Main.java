package ejemplo04_Factorial;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Factorial fac = new Factorial();
		
		System.out.println("Ingrese el número del que quiere calcular su factorial: ");
		fac.setN(scan.nextInt());
		
		
		System.out.println("El factorial de "+ fac.getN()+ " es:");
		System.out.println(fac.factorial(fac.getN()));
		scan.close();
	}

}
