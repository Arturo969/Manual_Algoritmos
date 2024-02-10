package problema_CombinacionesDeUnArreglo;

public class CombinacionArreglo {
	public void combinacion(int arr[], int arrTem[], int inicio, int fin, int indice, int r) {

		if (indice == r) {
			System.out.print("[ ");
			for (int j = 0; j < r; j++)
				System.out.printf("%d ", arrTem[j]);
			System.out.println("]");
			return;
		}

		for (int i = inicio; i <= fin && fin - i + 1 >= r - indice; i++) {
			arrTem[indice] = arr[i];
			combinacion(arr, arrTem, i + 1, fin, indice + 1, r);
		}
	}

	public void imprimeCombinacion(int arr[], int n, int r) {
		int arrTem[] = new int[r];
		combinacion(arr, arrTem, 0, n - 1, 0, r);
	}
}
