package ejercicioInvertirArreglo;

public class InvertirArreglo {
	//Inicializa el arreglo:
	static int[] valores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	//Invierte el el arreglo
	public static void invertir() {

        for (int i = 0; i < valores.length / 2; i++) {

            int temp = valores[i];
            valores[i] = valores[valores.length - 1 - i];
            valores[valores.length - 1 - i] = temp;
        }
    }
	//Muestra el arreglo
    public static void mostrarArreglo(int[] valores) {
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] + " ");
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		invertir();
        mostrarArreglo(valores);
	}

}
