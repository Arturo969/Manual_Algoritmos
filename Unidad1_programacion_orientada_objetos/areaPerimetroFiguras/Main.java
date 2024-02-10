package areaPerimetroFiguras;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		//Área de un Circulo y longitud de su circunferencia:
		System.out.println("CIRCULO:");
		Circulo ci = new Circulo();
		Circulo radio = new Circulo();
		System.out.println("Ingrese el valor del radio: ");
		ci.setRadio(scan.nextDouble());		
		System.out.println("Radio es :" + radio.getRadio());
		//calcula la longitud
        System.out.println("Longitud es: " + 2.0*ci.getRadio()*Math.PI);
   
        System.out.println("Area es: " + ci.getRadio()*ci.getRadio()*Math.PI);
        
         
        
		
		
		
		//Área y perímetro de un cuadrado:
		System.out.println(" ");
		System.out.println("CUADRADO:");
		Cuadrado q = new Cuadrado();
		System.out.println("Ingrese la longitud del lado del cuadrado: ");
		q.setLado(scan.nextInt());			
		q.calculaArea();
		q.calculaPerimetro();
		
		//Área y perímetro de triángulo rectángulo:
		System.out.println(" ");
		System.out.println("TRIANGULO RECTANGULO:");
		TrianguloRectangulo t = new TrianguloRectangulo();
		System.out.println("Ingrese un cateto del triangulo: ");
		t.setCateto1(scan.nextDouble());
		System.out.println("Ingrese el otro cateto del triangulo: ");
		t.setCateto2(scan.nextDouble());
		t.calculaHipotenusa();
		t.calculaPerimetro();
		t.calculaArea();
		
		scan.close();
	}

}
