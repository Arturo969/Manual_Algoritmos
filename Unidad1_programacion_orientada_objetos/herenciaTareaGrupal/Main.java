package herenciaTareaGrupal;

public class Main {

	public static void main(String[] args) {
		// GERENTE
		Gerente arnold = new Gerente("Arnold", 18, 73439588, false);
		arnold.setHorasLaborables(2);
		System.out.println("\tGERENTE");
		System.out.println("==========================");
		System.out.println("Nombre: " + arnold.getNombre());
		System.out.println("Edad: " + arnold.getEdad());
		System.out.println("id: " + arnold.getId());
		System.out.println("¿Es soltero? " + arnold.getSoltero());
		System.out.println("Horas Laborables: " + arnold.getHorasLaborables());

		arnold.caminar();
		arnold.respirar();
		arnold.trabajar();
		arnold.firmarContratos();
		arnold.cobrar();

		System.out.println("==========================\n");

		// SUPERVISOR
		System.out.println("\tSUPERVISOR");
		System.out.println("==========================");
		Supervisor louis = new Supervisor();
		louis.setNombre("Louis");
		louis.setEdad(19);
		louis.setId(66666666);
		louis.setHorasLaborables(10);
		louis.setTrabajadoresACargo(1);
		System.out.println("Nombre: " + louis.getNombre());
		System.out.println("Edad: " + louis.getEdad());
		System.out.println("id: " + louis.getId());
		System.out.println("Trabajadores a cargo: " + louis.getTrabajadoresACargo());
		System.out.println("Horas Laborables: " + louis.getHorasLaborables());

		louis.caminar();
		louis.respirar();
		louis.trabajar();
		louis.supervisar();
		louis.cobrar();

		System.out.println("==========================\n");

		// OBRERO
		System.out.println("\tOBRERO");
		System.out.println("==========================");
		Obrero arturo = new Obrero("Arturo", 11, 12345678, 15);
		arturo.setHorasLaborables(9);
		System.out.println("Nombre: " + arturo.getNombre());
		System.out.println("Edad: " + arturo.getEdad());
		System.out.println("id: " + arturo.getId());
		System.out.println("Horas Extra: " + arturo.getHorasExtra());
		System.out.println("Horas Laborables: " + arturo.getHorasLaborables());
		arturo.caminar();
		arturo.respirar();
		arturo.prepararCemento();
		arturo.cargarCemento();
		arturo.cargarLadrillo();
		arturo.trabajar();
		arturo.cobrar();
		System.out.println("==========================\n");
	}
}
