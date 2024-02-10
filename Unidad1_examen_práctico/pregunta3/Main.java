package pregunta3;

public class Main {

	public static void main(String[] args) {
		/*
		 *Plantear una clase llamada “Empleado” definir los atributos nombres, apellidos,
		 *cargo, y edad con visibilidad en privado. Crear el constructor y los métodos para modificar
		 *y recuperar los valores de los atributos mediante las herramientas que provee Eclipse.*/
		Empleado empleado1 = new Empleado("Julian", "Alvares", "gerente", 28);

		System.out.println("EMPLEADO 1");
		System.out.println("Nombre: " + empleado1.getNombres() + "\nApellido: " + empleado1.getApellidos()
				+ "\nPuesto: " + empleado1.getCargo() + "\nEdad:" + empleado1.getEdad());
	}

}
