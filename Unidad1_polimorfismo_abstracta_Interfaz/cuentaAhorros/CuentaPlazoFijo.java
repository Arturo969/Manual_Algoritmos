package cuentaAhorros;

public class CuentaPlazoFijo extends Cuenta{
	@Override
	public double calcularInteres() {
		// Hereda saldo
		return this.saldo*0.12;
	}

}
