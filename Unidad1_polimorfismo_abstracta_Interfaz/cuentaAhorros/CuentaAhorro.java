package cuentaAhorros;

public class CuentaAhorro extends Cuenta {
	@Override
	public double calcularInteres() {
		// sobreescribe calcularInteres()
		return this.saldo * 0.5;
	}
}
