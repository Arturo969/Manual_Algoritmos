package herencia3Figura;

public class Figura {
	// creando los metodos de area y perimetro
	protected double area;
	protected double perimetro;


	public void calculaArea() {
		area = 0;

	}

	public void calculaPerimetro() {
		perimetro = 0;

	}

	// creando los getters en setters
	public double getArea() {
		return area;
	}

	public double getPerimetro() {
		return perimetro;
	}
}
