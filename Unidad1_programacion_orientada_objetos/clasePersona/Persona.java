package clasePersona;

public class Persona {
	private int edad;
	private String nombre;
	
	//Constructor de Persona
	public Persona(int edad, String nombre) {
		super();
		this.edad = edad;
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void mostrar() {
		System.out.println("El nombre es: " + nombre);
		System.out.println("Su edad es: " + edad);
	}

}
