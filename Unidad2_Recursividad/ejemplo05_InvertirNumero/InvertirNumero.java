package ejemplo05_InvertirNumero;

public class InvertirNumero {
	public int invierte(int n) {
		int rpta = 0;

		return invierte(n, rpta);
	}

	public int invierte(int n, int rpta) {
		if (n == 0)
			return rpta;
		else {
			int residuo = n % 10;
			n = n / 10;
			rpta = (rpta * 10) + residuo;
			return invierte(n, rpta);
		}
	}
}
