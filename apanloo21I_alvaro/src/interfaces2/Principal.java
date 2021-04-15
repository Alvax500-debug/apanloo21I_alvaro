package interfaces2;

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

	}

}
