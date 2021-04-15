package interfaces2;

public class Antropologo implements Salariable, Trabajable {
	
	private String nombre;
	private int edad;

	public Antropologo() {
		// TODO Auto-generated constructor stub
	}

	public Antropologo(String nombre, int edad) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override
	public double getSalario() {
		// TODO Auto-generated method stub
		return 30500.73;
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
