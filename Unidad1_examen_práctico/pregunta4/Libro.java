package pregunta4;

public class Libro {
	private String nombre;
	private int añoPublicacion;
	private String autor;
	private String editorial;

	// contructor vacio
	public Libro() {
		super();
	}

	public Libro(String nombre) {
		super();
		this.nombre = nombre;
		System.out.println("El nombre es: " + this.nombre);
	}

	// demas constructores
	public Libro(String nombre, int añoPublicacion) {
		super();
		this.nombre = nombre;
		this.añoPublicacion = añoPublicacion;
		System.out.println("El nombre es: " + this.nombre + "\nAño de publicacion: " + this.añoPublicacion);
	}

	public Libro(String nombre, String libro, int añoPublicacion, String autor) {
		super();
		this.nombre = nombre;
		this.añoPublicacion = añoPublicacion;
		this.autor = autor;
		System.out.println("El nombre es: " + this.nombre + "\nAño de publicacion: " + this.añoPublicacion + "\nAutor: "
				+ this.autor);
	}

	public Libro(String nombre, int añoPublicacion, String autor, String editorial) {
		super();
		this.nombre = nombre;
		this.añoPublicacion = añoPublicacion;
		this.autor = autor;
		this.editorial = editorial;
		System.out.println("El nombre es: " + this.nombre + "\nAño de publicacion:  " + this.añoPublicacion
				+ "\nAutor: " + this.autor + "\nEditorial: " + this.editorial);
	}

}
