package ejerciciosArreglos;

public class MostrarNumeroOpcion5 {

	public static void main(String[] args) {
		// Mostrar diez números aumentando de 2 en 2 unidades entra cada número:
		// Inicializa el arreglo:
		int[] n = new int[10];
		int i;
		// Mostrar:
		for (i = 0; i < 10; i++) {
			n[i] = i * 2;
			System.out.print(n[i] + " ");
		}
	}

}
