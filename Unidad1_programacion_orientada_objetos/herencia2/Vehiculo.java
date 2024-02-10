package herencia2;

public class Vehiculo {
	public int num_placa;
	public String color;
	public String modelo;

	public void acelerar() {
		System.out.println("El vehiculo esta aceleando");
	}
	public void frenar() {
		System.out.println("El vehiculo ha freando");
	}
	
	public void cambiarVelocidad(){
		System.out.println("El vehiculo ha cambiado de velocidad");
	}
}
