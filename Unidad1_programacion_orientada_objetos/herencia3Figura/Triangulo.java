package herencia3Figura;

public class Triangulo extends Figura{
	private double base;
	private double altura;
	private double a, b, c;

	public Triangulo(double base, double altura, double a, double b, double c) {
		this.base = base;
		this.altura = altura;
		this.a = a;
		this.b = b;
		this.c = c;
	}

	//Sobre escritura de métodos
	@Override
	public void calculaArea() {
		area = (base * altura) / 2;
	}

	@Override
	public void calculaPerimetro() {
		perimetro = a + b + c;
	}

}
