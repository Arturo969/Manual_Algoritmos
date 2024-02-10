package pregunta2;

import java.util.Scanner;

public class NumyDen {
	public static Scanner leer = new Scanner(System.in);

	private int numerador;
	private int denumerador;

	public NumyDen() {
		this.numerador = 0;
		this.denumerador = 1;
	}

	public void ingresarFraccion() {
		System.out.println("Ingrese el numerador: ");
		numerador = leer.nextInt();

		System.out.println("Ingrese el denominador: ");
		denumerador = leer.nextInt();
		// verificar si el numero es cero y asignar 1 en ese caso

		if (denumerador == 0) {
			denumerador = 1;
		}
	}

	public void mostrarFraccion() {
		System.out.println("La fraccion es: " + numerador + "/" + denumerador);
	}

}
