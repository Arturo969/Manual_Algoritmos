package areaPerimetroFiguras;

public class Circulo {
	// CALCULAR LA LONGITUD Y ÁREA DE UNA CIRCUNFERENCIA CON RADIO PRIVADO:
	
	//Getters y setters
	private double  radio;
	
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		if (radio > 0) {
            this.radio = radio;
        } else {
            System.out.println("El radio debe ser un valor positivo.");
        }
	}
}
