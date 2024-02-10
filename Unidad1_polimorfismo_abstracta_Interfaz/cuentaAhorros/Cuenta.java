package cuentaAhorros;

public abstract class Cuenta {
	//Clase abstracta no se puede instanciar, y usa métodos abstractos
	public String numeroCuenta;
	public double saldo;
	public String nombre;
	public abstract double calcularInteres();	
}
