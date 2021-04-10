package metodosDinamicos;

public class Triangulo extends Figura {

	public Triangulo() {
		// TODO Auto-generated constructor stub
	}

	public Triangulo(double dim1, double dim2) {
		super(dim1, dim2);
		// TODO Auto-generated constructor stub
	}
	
	double area() {
		System.out.println("Dentro de area para Triangulo");
		return (dim1 * dim2) / 2;
	}

}
