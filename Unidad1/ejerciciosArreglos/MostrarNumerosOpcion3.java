package ejerciciosArreglos;

public class MostrarNumerosOpcion3 {

	public static void main(String[] args) {
		// Mostrar diez números aumentando de 2 en 2 unidades entra cada número:
		// Inicializa el arreglo:
		int[] arreglo = new int[20];
		for (int i = 0; i < 20; i++) {
			arreglo[i] = i + 1;
		}
		// Muestra el arreglo:
		for (int x = 0; x < 20; x = x + 2) {
			arreglo[x] = x + 2;
			System.out.println(arreglo[x]);
		}
	}

}
