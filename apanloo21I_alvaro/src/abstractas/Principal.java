package abstractas;

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
		
		
		//Trabajador empleado = new Trabajador("Persona", 54);	<--- Eclipse indica que esta clase no es instanciable
		
		//6.- b) Se pueden tener constructores de las clases abstractas y se ocupan 
		// cuando la clase tiene atributos que deseas inicializar desde que se crea
		// una instancia de su subclase
		
		//6.- c) En el caso de eclipse, si se crea desde la propia interfaz de eclipse
		// este solo marca un error de que se debe quitar la anotacion override
		// una vez removida o comentada, el metodo funciona pero como si fuera nativo
		// de las subclases de Trabajador
		
		//6.- d) Si, siempre que todos sus metodos esten implementados y no se incluya
		// la palabra reservada abstract
		
		//6.- e) Si, siempre que la clase incluya la palabra reservada abstract y 
		// no exista alguna instancia de la misma

	}

}
