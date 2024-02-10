package cuentaAhorros;

public class Main {

	public static void main(String[] args) {
		CuentaAhorro cuentaAhorro1 = new CuentaAhorro();
		cuentaAhorro1.saldo = 10000;
		System.out.println("El interes de la cuenta de ahorro es: " + cuentaAhorro1.calcularInteres());

		CuentaPlazoFijo cuentaPlazofijo1 = new CuentaPlazoFijo();
		cuentaPlazofijo1.saldo = 20000;
		System.out.println("El interes de la cuenta a plazo fijo  es: " + cuentaPlazofijo1.calcularInteres());

	}

}
