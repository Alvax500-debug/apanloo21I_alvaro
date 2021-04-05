package parte2.version2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Racional r1 = new Racional();
		Racional r2 = new Racional();
		
		r1.numerador = 1;
		r1.denomidaor = 2;
		
		r2.numerador = 3;
		r2.denomidaor = 4;
		
		Racional r3;
		r3 = Racional.sumaRacionales(r1, r2);
		
		if (r3 != null) {
			
			System.out.println("El resultado de la suma es: " + r3.numerador + "/" + r3.denomidaor);
			
		} else {
			
			System.out.println("Error ninguno de los denominadores puede ser 0");

		}

	}

}
