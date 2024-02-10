package interfaz;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IFigura figuras[] = new IFigura[4];
		figuras[0] = new Circulo(5);
		figuras[1] = new Triangulo(3, 4, 3, 4, 5);
		figuras[2] = new Circulo(5);
		figuras[3] = new Triangulo(2, 5, 6, 2, 4);

		for (IFigura i : figuras) {
			i.calcularArea();
			i.calcularPerimtro();
			System.out.println(i.getNombre());
			System.out.println("Área: " + i.getArea());
			System.out.println("Perímetro: " + i.getPerimtro());
		}

	}

}
