package ejemplo02_Digitos;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un número: ");
		DigitosN d = new DigitosN();
		System.out.println("tiene "+d.numeroDigitos(scan.nextInt())+" digitos.");
		scan.close();
	}

}
