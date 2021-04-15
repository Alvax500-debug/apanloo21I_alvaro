package abstractas;

public class Ingeniero extends Trabajador {

	public Ingeniero() {
		// TODO Auto-generated constructor stub
	}

	public Ingeniero(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}

	//@Override
	public double getSalario() {
		// TODO Auto-generated method stub
		return 15300.30;
	}
	
	//Trabajador empleado = new Trabajador("Persona", 54);	<--- Eclipse indica que esta clase no es instanciable

}
