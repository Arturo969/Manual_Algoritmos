package ClaseVector;

import java.util.Scanner;
import java.util.Vector;

public class Vector2 {

	public static Vector<Integer> v = new Vector<>();// declara como variable global
	static Scanner sc = new Scanner(System.in);

	public static void LlenarVector(int n) {
		int elemento; // elemento a insertar

		for (int i = 0; i < n; i++) {
			System.out.print("V[" + i + "] = ");
			elemento = sc.nextInt();
			v.addElement(elemento);
		}
		System.out.println(" ");
	}

	public static void mostrarVector() {
		for (int i = 0; i < v.size(); i++) {
			System.out.println("V[" + i + "] =" + v.get(i));
		}
	}

	public static void adicionarElementos(int x, int p) {
		int numeroElemento;// número de elemento a adicionar
		numeroElemento = v.size();
		if (p <= numeroElemento) {
			// insertar el elemento x en la posición p
			v.insertElementAt(x, p);
			System.out.println("Elemento insertado.");

		} else {
			v.addElement(x);
		} // insertar el elemento al final

	}

	public static void main(String[] args) {
		// Dado un vector A de n elementos, se pide insertar en el vector A un elementos
		// X en la posición P, en caso de que no exista esa posición, colocar X como
		// último elemento del vector.
		int n;
		do {
			System.out.println("¿Cuántos elementos desea ingresar?");
			n = sc.nextInt();

			LlenarVector(n);

			mostrarVector();

		} while (n <= 0);
		System.out.println(" ");
		System.out.println("Digite el elemento y la posición a insertar separados por unespacio: ");
		int x = sc.nextInt();
		int p = sc.nextInt();
		adicionarElementos(x, p);
		mostrarVector();
	}
}
