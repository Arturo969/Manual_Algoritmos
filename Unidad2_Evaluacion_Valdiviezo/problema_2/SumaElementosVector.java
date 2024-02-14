package problema_2;

import java.util.Scanner;
import java.util.Vector;

public class SumaElementosVector {
	public int longitud(Scanner scan)
	{
		int longitud;
		System.out.println("Ingresa longitud del vector: ");
		longitud = scan.nextInt();
		return longitud;
	}

//	suma de los elementos de un vector
	public int sumaVector(Vector<Integer> v, int l)
	{
		if(l==1)
			return v.elementAt(0);
		else
			return v.elementAt(l-1)+sumaVector(v,l-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		SumaElementosVector vector = new SumaElementosVector();
		
		int l = vector.longitud(scan);
		Vector<Integer> v = new Vector<>(l);
		
		for(int i = 0; i < l; i++)
		{
			System.out.println((i+1)+ "° Componente:");
			v.addElement(scan.nextInt());
		}
		
		System.out.printf("Vector 1: %s \n",v.toString());
		int suma=vector.sumaVector(v,l);
		
		System.out.println("Suma de componentes = "+ suma);
	}

}
