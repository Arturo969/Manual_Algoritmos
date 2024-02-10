package herencia3Figura;

public class Main {

	public static void main(String[] args) {
		//Instanciamos las clases y usamos constructores y métodos:
		Circulo circulo1 = new Circulo(4.0);
		Triangulo triangulo1 = new Triangulo(2.0, 4.0, 5.0, 2.0, 5.0);

		circulo1.calculaArea();
		circulo1.calculaPerimetro();

		triangulo1.calculaArea();
		triangulo1.calculaPerimetro();

		System.out.println("CIRCULO");
		System.out.println("Area: " + circulo1.getArea());
		System.out.println("Perimetro: " + circulo1.getPerimetro());

		System.out.println("TRIANGULO");
		System.out.println("Area: " + triangulo1.getArea());
		System.out.println("Perimetro: " + triangulo1.getPerimetro());
	}

}
