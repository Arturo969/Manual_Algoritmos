package pregunta3;

public class Empleado {
	private String nombres;
	private String apellidos;
	private String cargo;
	private int edad;
	
	
	public Empleado(String nombres, String apellidos, String cargo, int edad) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.cargo = cargo;
		this.edad = edad;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
}
