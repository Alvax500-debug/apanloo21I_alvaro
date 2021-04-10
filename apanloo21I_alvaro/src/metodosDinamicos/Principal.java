package metodosDinamicos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Figura f = new Figura(7.4, 13);
		
		Rectangulo r = new Rectangulo(3, 3.5);
		
		Triangulo t = new Triangulo(7, 8);
		
		Figura calcAreas;
		
		//Inverti el orden de los llamados con respecto a lo realizado en clase
		
		calcAreas = f;
		
		System.out.println("El area es " + calcAreas.area());
		
		calcAreas = r;
		
		System.out.println("El area es " + calcAreas.area());
		
		calcAreas = t;
		
		System.out.println("El area es " + calcAreas.area());

	}

}
