package gettersYsetters;

public class Main {

	public static void main(String[] args) {
		// Se inicializan los atributos a través de los getters y settters
		Clase01 objeto1 = new Clase01();
		objeto1.setEdad(10);
		
		Clase01 objeto2 = new Clase01();
		objeto2.setNombre("Louis");
		
		
		System.out.println("La edad es: " + objeto1.getEdad());
		System.out.println("El nombre es: " + objeto2.getNombre());

	}

}
