package ejerciciosArreglos;

public class MostrarNumerosOpcion1 {

	public static void main(String[] args) {
		// Mostrar diez números aumentando de 2 en 2 unidades entra cada número:
		// Inicializa el arreglo:
        int[] arregloE = new int[10];
        for (int i = 0; i < 10; i++) {
            arregloE[i] = i * 2;
        }
        
        // Muestra el arreglo:
        for (int x = 0; x < 10; x++) {
            System.out.println(arregloE[x]);
        }
	}

}
