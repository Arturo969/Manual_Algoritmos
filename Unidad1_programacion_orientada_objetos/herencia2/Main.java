package herencia2;

public class Main {

	public static void main(String[] args) {
		// Crea objeto motociclea
		Motocicleta moto1 = new Motocicleta();
		moto1.color = "Azul";
		moto1.num_placa = 3262;
		moto1.modelo = "Honda";
		moto1.acelerar();
		System.out.println("El color del la moto es: "  + moto1.color + ", Modelo: " + moto1.modelo + ", su placa es: " + moto1.num_placa );
		
		
		//crea objeto camion1
		System.out.println("----------------------------");
		Camion camion1 = new Camion();
		camion1.cambiarVelocidad();
		camion1.modelo = "volvo-747";
		camion1.num_placa = 6572;
		camion1.color = "Azul";
		camion1.acelerar();
		System.out.println("Su color es: " + camion1.color + ", El modelo del camion es: " + camion1.modelo  + ", su placa es: " + camion1.num_placa);
		
		//crea objeto automovil1
		System.out.println("----------------------------");
		Automovil automovil1 = new Automovil();
		automovil1.cambiarVelocidad();
		automovil1.color = "verde";
		automovil1.modelo = "Uruz";
		automovil1.num_placa = 4578;
		System.out.println("Su color es: " + automovil1.color + ", El Lamborghini es el modelo: " + automovil1.modelo + ", su placa es: " + automovil1.num_placa);
		//como todas las clases heredan de Vehiculo compartiran los mismos métodos y atributos
	}

}
