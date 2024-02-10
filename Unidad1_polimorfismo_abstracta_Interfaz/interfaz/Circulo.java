package interfaz;

public class Circulo extends Figura implements IFigura {
	private double radio;

	// constructor
	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	// metodos calcularArea y calcularPerimtro

	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		area = Math.PI * radio * radio;
	}

	@Override
	public void calcularPerimtro() {
		// TODO Auto-generated method stub
		perimetro = Math.PI * 2 * radio;

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
		return "CIRCULO";
	}

}
