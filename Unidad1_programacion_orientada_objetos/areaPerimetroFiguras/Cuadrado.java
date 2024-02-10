package areaPerimetroFiguras;



public class Cuadrado {	
	//Area y perimetro del cuadrado
	double lado;
	
	public void setLado(double lado) 
	{
		this.lado = lado;
	}
	
	public double getLado()
	{
		return lado;
	}
	
	public void calculaArea()
	{
		System.out.println("El Perimetro es: " + lado*4);
	}
	
	public void calculaPerimetro()
	{
		System.out.println("El área del cuadrado es:" + lado*lado);
	}
}
