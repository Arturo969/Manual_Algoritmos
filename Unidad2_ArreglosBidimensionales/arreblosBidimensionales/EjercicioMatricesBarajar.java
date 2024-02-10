package arreblosBidimensionales;

import java.util.Random;

public class EjercicioMatricesBarajar {

	public static void main(String[] args) {
		// Crea un algoritmo para barajear un Mazo de cartas
		//Mazo:
		String mazo[][] = { { "♥1", "♦1", "♣1", "♠1" }, 
							{ "♥2", "♦2", "♣2", "♠2" }, 
							{ "♥3", "♦3", "♣3", "♠3" },
							{ "♥4", "♦4", "♣4", "♠4" }, 
							{ "♥5", "♦5", "♣5", "♠5" }, 
							{ "♥6", "♦6", "♣6", "♠6" },
							{ "♥7", "♦7", "♣7", "♠7" }, 
							{ "♥8", "♦8", "♣8", "♠8" }, 
							{ "♥9", "♦9", "♣9", "♠9" },
							{ "♥10", "♦10", "♣10", "♠10" }, 
							{ "♥11", "♦11", "♣11", "♠11" }, 
							{ "♥12", "♦12", "♣12", "♠12" },
							{ "♥13", "♦13", "♣13", "♠13" } };

		mazoOrdenado(mazo);
		barajea(mazo);
		mazoBarajeado(mazo);

	}

	public static void mazoBarajeado(String[][] mazo) {
		System.out.printf("%20s\n", "MAZO BARAJEADO");
		System.out.println();
		for (int i = 0; i < mazo.length; i++) {
			for (int j = 0; j < mazo[i].length; j++) {
				System.out.printf("%s[%4s ]", " ", mazo[i][j]);

			}
			System.out.println();
		}
		System.out.println();
	}

	public static void barajea(String[][] mazo) {
		int indicef, indicec;
		String[][] temporal = new String[13][4];
		Random r = new Random();
		for (int i = 0; i < mazo.length; i++) {
			indicef = r.nextInt(13);

			for (int j = 0; j < mazo[i].length; j++) {
				indicec = r.nextInt(4);
				if (indicef != i && indicec != j) {
					temporal[i][j] = mazo[indicef][indicec];
					mazo[indicef][indicec] = mazo[i][j];
					mazo[i][j] = temporal[i][j];
				}
			}
		}
		System.out.println();
	}

	public static void mazoOrdenado(String[][] mazo) {
//Muestra el mazo sin barajear
		System.out.printf("%20s\n", "MAZO ORDENADO");
		System.out.println();
		for (int i = 0; i < mazo.length; i++) {
			for (int j = 0; j < mazo[i].length; j++) {
				System.out.printf("%s[%4s ]", " ", mazo[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

}
