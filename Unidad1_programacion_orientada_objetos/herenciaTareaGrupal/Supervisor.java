package herenciaTareaGrupal;

public class Supervisor extends Trabajador{
	// ****************************************
	private int trabajadoresACargo;
	// ****************************************
	// ****************************************

	// ****************************************
	public Supervisor() {
	};

	public Supervisor(String nombre, int edad, int id, int trabajadoresACargo) {
		super(nombre, edad, id);
		this.trabajadoresACargo = trabajadoresACargo;
	}
	// ****************************************
	// ****************************************

	// ****************************************
	public int getTrabajadoresACargo() {
		return trabajadoresACargo;
	}

	public void setTrabajadoresACargo(int trabajadoresACargo) {
		this.trabajadoresACargo = trabajadoresACargo;
	}
	// ****************************************
	// ****************************************

	// ****************************************
	public void supervisar() {
		System.out.println("El supervisor supervisando a los obreros...");
	}
	// ****************************************
	// ****************************************
}
