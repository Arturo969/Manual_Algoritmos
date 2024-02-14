
package problema_1;

import java.util.Scanner;

public class Ventas {

	public static void prompt() {
		String[][] elementos = { { "Arroz", "Harina de Trigo", "Azucar" }, { "Enero", "", "", "" },
				{ "Febrero", "", "", "" }, { "Marzo", "", "", "" }, { "Abril", "", "", "" }, { "Mayo", "", "", "" },
				{ "Junio", "", "", "" } };

		System.out.println("Ingrese los elementos segun se indica en la siguiente tabla:");
		System.out.println(" ");
		System.out.printf("%-20s", "");
		for (int j = 0; j < elementos[0].length; j++) {
			System.out.printf("%-20s", elementos[0][j]);
		}
		System.out.println();

		for (int i = 1; i < elementos.length; i++) {
			System.out.printf("%-20s", elementos[i][0]);
			for (int j = 1; j < elementos[i].length; j++) {
				System.out.printf("%-20s", "[" + (i - 1) + "][" + (j - 1) + "]");
			}
			System.out.println();
		}
	}

	public static void ingresoDatos(double ventas[][], Scanner scan) {
		System.out.printf("", "Arroz", "Harina de Trigo", "Azucar", "Enero", "Febrero", "Marzo", "Abril", "Mayo",
				"Junio");
		for (int i = 0; i < ventas.length; i++) {
			for (int j = 0; j < ventas[i].length; j++) {

				System.out.printf("Ingrese la posicion [%d][%d]:", i, j);
				ventas[i][j] = scan.nextInt();
			}
			System.out.println();
		}
	}

	public static void calcularTotalPorMes(double[][] ventas, String[] meses) {
		double totalPorMes = 0;
		for (int i = 0; i < ventas.length; i++) {
			for (int j = 0; j < ventas[i].length; j++) {

				totalPorMes += ventas[i][j];
			}
			System.out.println();
			

				System.out.println("Total de ventas para " + meses[i] + ": " + totalPorMes);
			
			totalPorMes=0;
		}
	}
	
	public static void calcularTotal(double[][] ventas) {
		double total = 0;
		for (int i = 0; i < ventas.length; i++) {
			for (int j = 0; j < ventas[i].length; j++) {

				total += ventas[i][j];
			}

		}
		System.out.println("Total:"+ total);
	}

	public static void mejorNivel(double[][] ventas) {
		double[][] a = new double[6][3];
		for (int i = 0; i < ventas.length; i++) {
			for (int j = 0; j < ventas[i].length; j++) {

				a[i][j]= ventas[i][j];
			}
		}
		double mayor=0;
		for (int i = 0; i < ventas.length; i++) {
			for (int j = 0; j < ventas[i].length; j++) {
				a[i][j] = ventas[i][j];
				 mayor = a[i][j];
				if (mayor < ventas[i][j])
					mayor = ventas[i][j];
			}
		}
		System.out.println("El mejor nivel es: "+mayor);
		 
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Creamos la matriz:
		String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "junio" };
		double[][] ventas = new double[6][3];
		prompt();
		System.out.println("");
		ingresoDatos(ventas, scan);
		System.out.println("");
		calcularTotalPorMes(ventas, meses);
		calcularTotal(ventas);
		mejorNivel(ventas);

	}

}
