package areaPerimetroFiguras;

public class TrianguloRectangulo {
	private double cateto1, cateto2, h, perimetro;
	
	public double getCateto1() {
		return cateto1;
	}

	public void setCateto1(double cateto1) {
		this.cateto1 = cateto1;
	}

	public double getCateto2() {
		return cateto2;
	}

	public void setCateto2(double cateto2) {
		this.cateto2 = cateto2;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public void calculaHipotenusa()
	{
		h=Math.sqrt((cateto1*cateto1)+(cateto2*cateto2));
		System.out.println("La hipotenusa del triángulos es: "+ h);
	}
	
	public void calculaPerimetro()
	{
		perimetro = h + cateto1 + cateto2; 
		System.out.println("El perimetro del triangulo es:  " + perimetro );
	}
	
	public void calculaArea()
	{
		System.out.println("El area del triangulo es: " +(cateto1*cateto2)/2);
	}
	
}
