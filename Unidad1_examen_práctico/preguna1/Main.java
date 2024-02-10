package preguna1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* Crear un algoritmo que solicite un número de elementos (n) 
		 * con visibilidad en privado y que muestre en una clase diferente
		 * los números de 3 en 3, iniciando en el 0.*/
		Scanner leer = new Scanner(System.in);
		TresEnTres p1 = new TresEnTres();

		System.out.println("¿Cuantos numeros desea?: ");
		int nElementos = leer.nextInt();
		p1.setnElementos(nElementos);

		for (int i = 0; i < p1.getnElementos(); i++) {
			int TresenTres = i * 3;
			System.out.println(" " + TresenTres);
		}
		leer.close();
	}
}
