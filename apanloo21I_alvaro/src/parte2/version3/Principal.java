package parte2.version3;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Racional r1 = new Racional();
		Racional r2 = new Racional();
		
		r1.setNumerador(1);
		r1.setDenomidaor(2);
		
		r2.setNumerador(3);
		r2.setDenomidaor(4);
		
		Racional r3;
		r3 = Racional.sumaRacionales(r1, r2);
		
		if (r3 != null) {
			
			System.out.println("Se suma: " + r1.getNumerador() + "/" + r1.getDenomidaor());
			System.out.println("Con: " + r2.getNumerador() + "/" + r2.getDenomidaor());
			
			System.out.println("El resultado es: " + r3.getNumerador() + "/" + r3.getDenomidaor());
			
		} else {
			
			System.out.println("Error ninguno de los denominadores puede ser 0");

		}
		
		r2.setDenomidaor(5);
		
		r3 = Racional.sumaRacionales(r1, r2);
		
		if (r3 != null) {
			
			System.out.println("Se suma: " + r1.getNumerador() + "/" + r1.getDenomidaor());
			System.out.println("Con: " + r2.getNumerador() + "/" + r2.getDenomidaor());
			
			System.out.println("El resultado es: " + r3.getNumerador() + "/" + r3.getDenomidaor());
			
		} else {
			
			System.out.println("Error ninguno de los denominadores puede ser 0");

		}

	}

}
