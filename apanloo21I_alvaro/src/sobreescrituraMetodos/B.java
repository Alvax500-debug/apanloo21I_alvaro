package sobreescrituraMetodos;

public class B extends A {
	
	int k;

	public B() {
		// TODO Auto-generated constructor stub
	}

	public B(int i, int j) {
		super(i, j);
		// TODO Auto-generated constructor stub
	}

	public B(int i, int j, int k) {
		super(i, j);
		this.k = k;
		show();
		super.show();
	}
	
	void show() {
		//super(34, 25); //ERROR, solo ejecutable desde el constructor
		super.show();
		System.out.println("Desde B los valores son i=" + this.i + " j=" + this.j + " y k=" + this.k);
	}

}
