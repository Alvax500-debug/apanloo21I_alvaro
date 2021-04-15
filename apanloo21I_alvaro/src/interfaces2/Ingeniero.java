package interfaces2;

public class Ingeniero implements Salariable, Trabajable {
	
	private String nombre;
	private int edad;

	public Ingeniero() {
		// TODO Auto-generated constructor stub
	}

	public Ingeniero(String nombre, int edad) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override
	public double getSalario() {
		// TODO Auto-generated method stub
		return 15300.30;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		//return null;
		return nombre;
	}

	@Override
	public int getEdad() {
		// TODO Auto-generated method stub
		//return 0;
		return edad;
	}
	
	
	
}
