package interfaces;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ingeniero inge = new Ingeniero("Paco", 27);
		
		System.out.println("Del inge ----------------------");
		
		System.out.println("Nombre: " + inge.getNombre());
		
		System.out.println("Edad: " + inge.getEdad());
		
		System.out.println("Sueldo: $" + inge.getSalario());
		
		Antropologo dino = new Antropologo("Ross", 36);
		
		System.out.println("Del antropologo ---------------");
		
		System.out.println("Nombre: " + dino.getNombre());
		
		System.out.println("Edad: " + dino.getEdad());
		
		System.out.println("Sueldo: $" + dino.getSalario());
		
		//Salariable saldos = new Salariable();
		
		//4.- a) Si la salida es la misma
		
		//4.- b) No, no es posible ya que por definicion los atributos en una interfaz
		// siempre son tratados como constantes aunque no se declaren de esa manera
		// y por ende siempre van inicializados y su valor no puede ser modificado
		
		//4.- c) No, ya que por definicion una interfaz no contiene implementaciones
		// en sus metodos, esta no puede serinstanciable

	}

}
