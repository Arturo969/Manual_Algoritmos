package herenciaTareaGrupal;

public class Gerente extends Trabajador {
	private boolean soltero;

	// ****************************************
	// Constructores:
	public Gerente() {};

	public Gerente(String nombre, int edad, int id, boolean soltero) {
		super(nombre, edad, id);
		this.soltero = soltero;
	}
	// ****************************************
	// ****************************************

	// ****************************************
	// Getters y Setters:
	public boolean getSoltero() {
		return soltero;
	}

	public void setSoltero(boolean soltero) {
		this.soltero = soltero;
	}
	// ****************************************
	// ****************************************

	// ****************************************
	// Métodos:
	public void firmarContratos() {
		System.out.println("El gerente está firmando contratos...");
	}

}
