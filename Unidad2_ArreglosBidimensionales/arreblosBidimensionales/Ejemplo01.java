package arreblosBidimensionales;

public class Ejemplo01 {

	public static void main(String[] args) {
		//Crea y Muestra una Matriz
		int numeros[][] = new int[3][3];

		numeros[0][0] = 1;
		numeros[0][1] = 2;
		numeros[0][2] = 3;
		numeros[1][0] = 4;
		numeros[1][1] = 5;
		numeros[1][2] = 6;
		numeros[2][0] = 7;
		numeros[2][1] = 8;
		numeros[2][2] = 9;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("[ %d ]", numeros[i][j]);
			}
			System.out.println();
		}
	}

}
