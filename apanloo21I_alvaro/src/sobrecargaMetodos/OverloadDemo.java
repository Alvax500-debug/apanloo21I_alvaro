package sobrecargaMetodos;

public class OverloadDemo {
	
	void test() {
		System.out.println("Sin parametros");
	}
	
	void test(int a, int b) {
		System.out.println("Con 2 enteros: a=" + a + " y b="+b);
	}
	
	void test (double a) {
		System.out.println("Con un doble de valor: " + a);
	}

}
