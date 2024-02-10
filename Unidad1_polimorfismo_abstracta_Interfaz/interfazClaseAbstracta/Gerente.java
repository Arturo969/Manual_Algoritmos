package interfazClaseAbstracta;

public class Gerente extends Persona implements Trabajador {
	private int sueldo;

	public Gerente(String nombre, int edad, int sueldo) {
		super(nombre, edad);
		this.sueldo = sueldo;
	}

	public void cobrarSueldo() {
		System.out.println("El gerente " + nombre + " cobra S/. " + sueldo + " y lo gasta...");
	}

	@Override
	public void Laburar() {
		System.out.println("El Gerente " + nombre + " trabaja concentrado...");
	}

	@Override
	public void Descansar() {
		System.out.println("El gerente " + nombre + " se toma un respiro y una cerveza...");
	}
}
