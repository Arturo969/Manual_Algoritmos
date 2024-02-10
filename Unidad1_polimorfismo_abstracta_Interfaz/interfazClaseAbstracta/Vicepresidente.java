package interfazClaseAbstracta;

public class Vicepresidente extends Gerente{
	private int añosDeExperiencia;

	public Vicepresidente(String nombre, int edad, int sueldo, int añosDeExperiencia) {
		super(nombre, edad, sueldo);
		this.añosDeExperiencia = añosDeExperiencia;
	}

	@Override
	public void cobrarSueldo() {
		System.out.println("El Vicepresidente " + nombre + " cobra su sueldo y lo gasta...");
	}

	@Override
	public void Laburar() {
		System.out.println("El Vicepresidente " + nombre + " Trabaja...");
	}

	@Override
	public void Descansar() {
		System.out.println("El Vicepresidente " + nombre + " se toma un respiro del trabajo...");
	}

}
