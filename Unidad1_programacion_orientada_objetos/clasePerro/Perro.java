package clasePerro;

import java.util.Scanner;

public class Perro {
	//Atributos:
	String nombre;
	String raza;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
		//Crea un objeto perro1
		Perro perro1 = new Perro();
		perro1.nombre = "Fido";
		perro1.raza = "Coker";
		//Crea un objeto perro2
		Perro perro2 = new Perro();
		perro2.nombre = "Raiser";
		perro2.raza = "Pastor";
		//Crea un objeto perro3
		Perro perro3 = new Perro();
		System.out.println("Nombre del perro: ");
		perro3.nombre = leer.next();
		System.out.println("Nombre de la raza: ");
		perro3.raza = leer.next();
		//Imprime los atributos de cada objeto:
		System.out.println("Perro 1, su nombre es: " + perro1.nombre + " su raza es: " + perro1.raza);
		System.out.println("Perro 2, su nombre es: " + perro2.nombre + " su raza es: " + perro2.raza);
		System.out.println("Perro 3, su nombre es: " + perro3.nombre + " su raza es: " + perro3.raza);
		leer.close();
	}

}
