package herenciaTareaGrupal;

public class Persona {
	// ****************************************
	// Atributos:
	private String nombre;
	private int edad;
	// ****************************************
	// ****************************************

	// ****************************************
	// Contructores:
	public Persona() {
	};

	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	// ****************************************
	// ****************************************

	// ****************************************
	// Getters y Setters:
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// ****************************************
	// ****************************************
	// Métodos:
	public void respirar() {
		System.out.println("Respirando..");
	}

	public void caminar() {
		System.out.println("Caminando...");
	}
}
