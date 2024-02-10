package herencia3Figura;

public class Circulo extends Figura {
	// El Overide nos sirve para detectar errores de los métodos sobreescritos a los
	// mismos metodos de la clase padre
	private double radio;

	//Creamos Constructor
	public Circulo(double radio) {
		this.radio = radio;
	}

	public void calculaArea() {
		area = Math.PI * Math.pow(radio, 2);
	}

	@Override
	public void calculaPerimetro() {
		perimetro = 2.0 * Math.PI * radio;
	}

}
