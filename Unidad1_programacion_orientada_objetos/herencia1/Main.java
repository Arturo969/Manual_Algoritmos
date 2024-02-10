package herencia1;

public class Main {

	public static void main(String[] args) {
		// Creamos objetos de todos las clases:
		Transporte transporte1 = new Transporte();
		//Aereonave puede usar capacidad y el método avanzar
		Aereonave avion = new Aereonave();
		avion.capacidad = 900;
		avion.avanzar();

		//Automovil puede usar el método detenerse y capacidad
		Automovil auto = new Automovil();
		auto.detener();
		System.out.println("La capacidad del avion es: " + avion.capacidad);

		
	}

}
