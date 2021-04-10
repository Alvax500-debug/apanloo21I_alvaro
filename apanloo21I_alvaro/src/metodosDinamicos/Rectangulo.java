package metodosDinamicos;

public class Rectangulo extends Figura {

	public Rectangulo() {
		// TODO Auto-generated constructor stub
	}

	public Rectangulo(double dim1, double dim2) {
		super(dim1, dim2);
		// TODO Auto-generated constructor stub
	}
	
	double area() {
		System.out.println("Dentro de area para Rectangulo");
		return dim1 * dim2;
	}

}
