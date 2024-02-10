package herenciaTareaGrupal;

public class Trabajador extends Persona{
	// ****************************************
	// Atributos:
	private int id;
	private int horasLaborables;
	// ****************************************
	// ****************************************

	// ****************************************
	// Constructores:
	public Trabajador() {
	};

	public Trabajador(String nombre, int edad, int id) {
		super(nombre, edad);
		this.id = id;
	}
	// ****************************************
	// ****************************************

	// ****************************************
	// Getter y Setters:
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHorasLaborables() {
		return horasLaborables;
	}

	public void setHorasLaborables(int horasLaborables) {
		this.horasLaborables = horasLaborables;
	}
	// ****************************************
	// ****************************************

	// ****************************************
	// Métodos:
	public void trabajar() {
		System.out.println("Trabajando duro...");
	}

	public void cobrar() {
		System.out.println("Cobrando el sueldo...");
	}
}
