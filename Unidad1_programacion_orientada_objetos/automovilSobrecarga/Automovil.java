package automovilSobrecarga;
/*
 *Sobrecarga de métodos:
  
	La "sobrecarga de métodos" se refiere a la capacidad 
	de un lenguaje de programación de permitir que una clase 
	tenga múltiples métodos con el mismo nombre, pero con diferentes parámetros. 
	Esto se conoce como la sobrecarga de métodos o la capacidad de tener 
	varios métodos con la misma firma (nombre del método) pero con diferentes 
	tipos o números de parámetros.

	La teoría detrás de la sobrecarga de métodos es 
	proporcionar flexibilidad en el diseño del código, 
	permitiendo que una clase tenga métodos que realicen 
	tareas similares pero con diferentes tipos de datos o
	cantidades de información.*/
public class Automovil {
	int precio = 0;
	String nombre = "";
	int numPasajeros;
	String color;

	// Constructor:
	public Automovil(int precio, String nombre) {
		super();
		this.precio = precio;
		this.nombre = nombre;

		System.out.println("El precio es: " + precio + "El nombre es: " + nombre);
	}

	// Constructor sobre cargado:
	public Automovil(int precio, String nombre, int numPasajeros) {
		super();
		this.precio = precio;
		this.nombre = nombre;
		this.numPasajeros = numPasajeros;
		System.out.println("El precio es: " + precio + " El nombre es: " + nombre + " Pasajeros: " + numPasajeros);
	}

	// constructor sobrecargado
	public Automovil(int precio, String nombre, int numPasajeros, String color) {
		super();
		this.precio = precio;
		this.nombre = nombre;
		this.numPasajeros = numPasajeros;
		this.color = color;
		System.out.println("El precio es: " + precio + " El nombre es: " + nombre + " Pasajeros: " + numPasajeros
				+ " El color es: " + color);
	}

}
