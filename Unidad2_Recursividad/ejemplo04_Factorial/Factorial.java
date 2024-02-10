package ejemplo04_Factorial;

public class Factorial {
	private long n;

	public long getN() {
		return n;
	}

	public void setN(long n) {
		this.n = n;
	}

	public long factorial(long n) {
		if (n == 0)
			return 1;
		else
			return n * factorial(n - 1);
	}
}
