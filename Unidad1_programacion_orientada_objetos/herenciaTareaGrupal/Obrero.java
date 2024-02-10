package herenciaTareaGrupal;

public class Obrero extends Trabajador {
	// ****************************************
	// Atributos:
	int horasExtra;

	// ****************************************
	// Contructores:
	public Obrero() {
	};

	public Obrero(String nombre, int edad, int id, int horasExtra) {
		super(nombre, edad, id);
		this.horasExtra = horasExtra;
	}
	// ****************************************
	// ****************************************

	// ****************************************
	// Getters y Setters:
	public int getHorasExtra() {
		return horasExtra;
	}

	public void setHorasExtra(int horasExtra) {
		this.horasExtra = horasExtra;
	}

	// ****************************************
	// ****************************************
	// Métodos:
	public void prepararCemento() {
		System.out.println("El obrero está preparando el cemento...");
	}

	public void cargarCemento() {
		System.out.println("El obrero está cargando el cemento...");
	}

	public void cargarLadrillo() {
		System.out.println("El obrero está cargando algunos ladrillos...");
	}
	// ****************************************
	// ****************************************

}
