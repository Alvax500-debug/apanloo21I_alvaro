package abstractas;

public abstract class Trabajador {
	
	private String nombre;
	private int edad;

	public Trabajador() {
		// TODO Auto-generated constructor stub
	}

	public Trabajador(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}
	
	//abstract public double getSalario();
	
	//Trabajador empleado = new Trabajador("Persona", 54);	<--- Eclipse indica que esta clase no es instanciable

}
