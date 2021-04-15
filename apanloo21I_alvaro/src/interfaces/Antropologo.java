package interfaces;

public class Antropologo extends Trabajador implements Salariable {

	public Antropologo() {
		// TODO Auto-generated constructor stub
	}

	public Antropologo(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getSalario() {
		// TODO Auto-generated method stub
		return 30500.73;
	}

}
