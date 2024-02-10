package interfazClaseAbstracta;

public class Empleado extends Persona implements Trabajador{
	private int numeroDeFamiliares;

	public int getNumeroDeFamiliares() {
		return numeroDeFamiliares;
	}

	public void setNumeroDeFamiliares(int numeroDeFamiliares) {
		this.numeroDeFamiliares = numeroDeFamiliares;

	}

	public Empleado(String nombre, int edad, int numeroDeFamiliares) {
		super(nombre, edad);
		this.numeroDeFamiliares = numeroDeFamiliares;
	}

	public void alimentaFamilia() {
		System.out.println("El empleado " + nombre + " alimenta a sus " + numeroDeFamiliares + " familiares...");
	}

	@Override
	public void Laburar() {
		System.out.println("El empleado " + nombre + " trabaja duro...");
	}

	@Override
	public void Descansar() {
		System.out.println("El empleado " + nombre + " se toma una siesta...");
	}

}
