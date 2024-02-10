package ejercicioMostrarNumero;

public class MostrarNumeroOpcion4 {

	public static void main(String[] args) {
		// Mostrar diez números aumentando de 2 en 2 unidades entra cada número:
		// Inicializa el arreglo:
		int[] arregloEntero = new int[10];

		// Leer:
		for (int i = 0; i < 10; i++) {
			arregloEntero[i] = i + i;
		}
		// Mostrar:
		for (int x = 0; x < 10; x++) {
			System.out.println(arregloEntero[x]);
		}
	}

}
