package ejemplo03_MCDEuclides;

public class MetodoEuclides {
	public int mcd(int m, int n)
	{
		if(m%n==0)
			return n;
		else
			return mcd(n,m%n);
	}
}
