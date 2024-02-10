package interfaz;

public class Triangulo extends Figura implements IFigura {
	private double base;
	private double altura;
	private double a, b, c;

	// constructor
	public Triangulo(double base, double altura, double a, double b, double c) {
		super();
		this.base = base;
		this.altura = altura;
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		area = (base * altura) / 2;
	}

	@Override
	public void calcularPerimtro() {
		// TODO Auto-generated method stub
		perimetro = a + b + c;

	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return area;

	}

	@Override
	public double getPerimtro() {
		// TODO Auto-generated method stub
		return perimetro;

	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return "TRIANGULO";
	}

}
