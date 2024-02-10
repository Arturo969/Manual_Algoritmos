package ClaseVector;

import java.util.Vector;

public class ClaseVector {
	public static void main(String[] args) {
		//agregar elementos
		Vector v = new Vector();		
		v.addElement(2);
		v.addElement("Hola");
		v.addElement('s');
		System.out.println("Primer vector: ");
		for(int i = 0; i < v.size(); i++)
		{
			System.out.println("v["+(i)+"] = "+v.get(i));
		}
		
		//Crear un arrey te tipo entero
		Vector <Integer> v2 = new Vector<>();
		
		v2.addElement(2);
		v2.addElement(8);
		v2.addElement(9);
		
		//Insertar un elemento: 
		
		v2.insertElementAt(16,1);
		
		System.out.println("Segundo vector: ");
		for(int i = 0; i < v2.size(); i++)
		{
			System.out.println("v2["+(i)+"] = "+v2.get(i));
		}
		
		//Eliminar posición 3 del vector v2
		
		v2.removeElementAt(3);
		System.out.println("Segundo vector reducido: ");
		for(int i = 0; i < v2.size(); i++)
		{
			System.out.println("v2["+(i)+"] = "+v2.get(i));
		}
		
		
		//Verificar si un elemento esta dentro del vector v2
		//creamos
		
		int posicion;		
		if(v2.contains(8))
		{
			posicion = v2.indexOf(8);
			System.err.println("El elemento existe en la posición "+ posicion);
		}
		else
			System.out.println("El elemento no existe dentro del vector");
		//vector que ingrese el número ne elementos: 
		
	}
}
