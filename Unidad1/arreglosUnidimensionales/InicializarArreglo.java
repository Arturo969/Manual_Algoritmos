package arreglosUnidimensionales;

public class InicializarArreglo {

	public static void main(String[] args) {
		// Inicializa un arreglo con un bucle:
		int[] arregloE = new int[5];
        
        for (int i = 0; i < 5; i++) {
            arregloE[i] = i + 1;
        }
        
        for (int x = 0; x < 5; x++) {
            System.out.println(arregloE[x]);
        }
	}
}
