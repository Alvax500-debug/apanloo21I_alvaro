package metodosDinamicos;

public class Figura {
	
	double dim1;
	double dim2;

	public Figura() {
		// TODO Auto-generated constructor stub
	}

	public Figura(double dim1, double dim2) {
		super();
		this.dim1 = dim1;
		this.dim2 = dim2;
	}
	
	double area() {
		System.out.println("El area de la figura no esta definida");
		return 0.0;
	}

}
