package ejemplo05_InvertirNumero;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// Invierte un número:
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un número: ");
		int numero = scan.nextInt();

		InvertirNumero i = new InvertirNumero();
		int invertido = i.invierte(numero);
		System.out.println(invertido);
		scan.close();
	}

}
