package ejemplo01_Recursividad;

public class Recursividad {
	// Método Recursivo
	public void Mostrar(int x) {
		
		if(x<=10) {
			System.out.println(x + " ");
			Mostrar(x+1);
		}
	}
}
