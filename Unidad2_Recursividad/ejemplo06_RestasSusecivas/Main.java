package ejemplo06_RestasSusecivas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
        int a, b;

        System.out.println("Ingrese el dividendo: ");
        a = scan.nextInt();
        System.out.println("Ingrese el divisor: ");
        b = scan.nextInt();

        RestaSucesiva rs = new RestaSucesiva();

        int resultado = rs.restaSucesiva(a, b);

        if (resultado != -1) {
            System.out.printf("\nSe realizaron %d restas\n", resultado);
            System.out.println("Residuo: " + rs.d);
        } else {
            System.out.print("No se puede dividir");
        }

        scan.close();
	}

}
