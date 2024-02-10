package interfazClaseAbstracta;

public class Distribuidor extends Empleado{
	int horasDeTrabajo;

	public Distribuidor(String nombre, int edad, int numeroDeFamiliares, int horasDeTrabajo) {
		super(nombre, edad, numeroDeFamiliares);
		this.horasDeTrabajo = horasDeTrabajo;
	}

	public void piensaEnLaSalida() {
		System.out.println("El distribuidor " + nombre + " lleva " + horasDeTrabajo + " trabajando, ya quiere irse...");
	}

	@Override
	public void Laburar() {
		System.out.println("El distribuidor " + nombre + " está distribuyendo los productos...");
	}

	@Override
	public void Descansar() {
		System.out.println("El distribuidor " + nombre + " se toma una coca cola...");
	}

	@Override
	public void alimentaFamilia() {
		System.out.println(
				"El distribuidor " + nombre + " almuerza con sus " + this.getNumeroDeFamiliares() + " familiares...");
	}

}
