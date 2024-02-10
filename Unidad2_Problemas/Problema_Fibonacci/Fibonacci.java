package Problema_Fibonacci;

import java.math.BigInteger;

public class Fibonacci {
	private BigInteger DOS = BigInteger.valueOf(2);

	public BigInteger fibonacci(BigInteger n) {
		if (n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE))
			return n;
		else
			return fibonacci(n.subtract(BigInteger.ONE)).add(fibonacci(n.subtract(DOS)));
	}
}
