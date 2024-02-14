package problema_3;

import java.util.Scanner;
import java.util.Vector;

import problema_2.SumaElementosVector;

public class ClaseVector {

	public int longitud(Scanner scan) {
		int longitud;
		System.out.println("Ingresa longitud del vector: ");
		longitud = scan.nextInt();
		return longitud;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ClaseVector vector = new ClaseVector();

		int l = vector.longitud(scan);
		Vector<Integer> v = new Vector<>(l);

		for (int i = 0; i < l; i++) {
			System.out.println((i + 1) + "° Componente:");
			v.addElement(scan.nextInt());
		}

		System.out.printf("Vector 1: %s \n", v.toString());

		// insertar elemento
		
		System.out.println("Ingrese el elemento que quiere ingresar al vector: ");
		int  elemento= scan.nextInt();
		System.out.println("Ingrese la posición en la cual desea inserter el elemento:");
		int posicion=scan.nextInt();
		v.add(posicion,elemento);
		System.out.printf("Vector 1: %s \n", v.toString());
		
		//elimina elemento de posición
		System.out.println("Ingrese la posición en la cual desea eliminar el elemento:");
		posicion=scan.nextInt();
		v.removeElementAt(posicion);
		System.out.printf("Vector 1: %s \n", v.toString());
		
		//Elimina elemento
		System.out.println("Ingrese el elemento que desea eliminar:");
		elemento=scan.nextInt();
		v.removeElement(elemento);
		System.out.printf("Vector 1: %s \n", v.toString());
		
		
		//verifica
		System.out.println("Ingrese el elemento que desea verificar en el vector:");
		elemento=scan.nextInt();
		if (v.contains(elemento)) {
			System.err.println("El elemento existe");
		} else
			System.out.println("El elemento no existe");
		
		System.out.printf("Vector 1: %s \n", v.toString());
		scan.close();
		
	}
	

	

}
