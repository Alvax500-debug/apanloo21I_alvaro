package clase_31Mar21;

public class Encapsulamiento_repaso4 {
	
	static int x;
	int y;
	
	void hola1() {
		
		System.out.println("Hola 1");
		x = 5;
		y = 6;
		hola2();
		hola1();
		
	}
	
	static void hola2() {
		
		System.out.println("Hola 2");
		x = 5;
		//y = 6;
		hola2();
		//hola1();
		
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		hola2();
		Encapsulamiento_repaso4.hola2();
		//hola1();
		x = 5; System.out.println(x);
		//y = 7;
		Encapsulamiento_repaso4 inst1 = new Encapsulamiento_repaso4();
		Encapsulamiento_repaso4 obj2 = new Encapsulamiento_repaso4();
		inst1.y = 7;
		inst1.x = 9; inst1.hola1(); inst1.hola2();
		obj2.x = 23;
		System.out.println(inst1.x);

	}

}
