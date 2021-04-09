package sobreescrituraMetodos;

public class A {
	
	int i;
	int j;

	public A() {
		// TODO Auto-generated constructor stub
	}

	public A(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}
	
	void show() {
		System.out.println("Desde A los valores son i=" + this.i + " y j=" + this.j);
	}

}
