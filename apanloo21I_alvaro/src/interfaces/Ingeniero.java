package interfaces;

public class Ingeniero extends Trabajador implements Salariable {

	public Ingeniero() {
		// TODO Auto-generated constructor stub
	}

	public Ingeniero(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getSalario() {
		// TODO Auto-generated method stub
		//int valor = Salariable.numero;
		//Salariable.numero = 14;
		return 15300.30;
	}
	
	//Salariable saldos = new Salariable();
	
}
