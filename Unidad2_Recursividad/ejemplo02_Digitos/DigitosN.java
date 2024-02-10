package ejemplo02_Digitos;

public class DigitosN {
	public int numeroDigitos(int n)
	{
		int res;
		if(n<=10)
		{
			res = 1;
		}
		else
		{
			n=n/10;
			res = 1 + numeroDigitos(n);
		}
		return res;
	}
}
