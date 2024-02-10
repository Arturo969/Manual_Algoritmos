package arreglosUnidimensionales;

import java.security.SecureRandom;

public class LanzarDado60000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// tira el dado 60, 000 veces;
		// se usa el valor del dado como índice de frecuencia
		SecureRandom aleatorio = new SecureRandom();
		int dado[] = new int[7];

		for (int i = 0; i <= 60000; i++) {
			dado[1 + aleatorio.nextInt(6)]++;

		}
		// Mostrando los resultados
		System.out.printf("%6s|%s\n", "cara", " Frecuecia");
		for (int cara = 1; cara < dado.length; cara++) {
			System.out.printf("%4d  |%10d \n", cara, dado[cara]);

		}

	}

}
