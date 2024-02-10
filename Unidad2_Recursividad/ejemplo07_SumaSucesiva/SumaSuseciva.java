package ejemplo07_SumaSucesiva;

public class SumaSuseciva {
	int i = 0;
	int m;

	public int sumaSucesiva(int m, int M) {
		int rpta;
		if (M == 0) {
			rpta = 0;
		} else {
			if (M == 1) {
				rpta = m;
			} else {
				rpta = m + sumaSucesiva(m, M - 1);
			}
		}

		return rpta;
	}
}
