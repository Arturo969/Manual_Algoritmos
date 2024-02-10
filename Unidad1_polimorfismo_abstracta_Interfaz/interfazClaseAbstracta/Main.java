package interfazClaseAbstracta;

public class Main {

	public static void main(String[] args) {
		
		Gerente g = new Gerente("Louis", 19, 5000);
		g.Laburar();
		g.Descansar();
		g.cobrarSueldo();

		System.out.println("============================================");

		Vicepresidente v = new Vicepresidente("Arnold", 18, 2000, 3);
		v.Laburar();
		v.Descansar();
		v.cobrarSueldo();

		System.out.println("============================================");

		Empleado e = new Empleado("Arturo", 20, 15);
		e.Laburar();
		e.Descansar();
		e.alimentaFamilia();

		System.out.println("============================================");

		Distribuidor d = new Distribuidor("Sarah", 17, 2, 16);
		d.Laburar();
		d.piensaEnLaSalida();
		d.Descansar();
		d.alimentaFamilia();

	}

}
