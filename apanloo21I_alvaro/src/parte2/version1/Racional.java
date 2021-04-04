package parte2.version1;

public class Racional {
	
	int numerador;
	int denomidaor;
	
	static Racional sumaRacionales(Racional a, Racional b) {
		
		Racional resultadoSuma = new Racional();
		
		if (a.denomidaor == 0 || b.denomidaor == 0) {
			
			return null;
			
		} else {
			
			if (a.denomidaor != b.denomidaor) {
				
				resultadoSuma.numerador = (a.numerador * b.denomidaor) + (b.numerador * a.denomidaor);
				resultadoSuma.denomidaor = a.denomidaor * b.denomidaor;
				
			} else {
				
				resultadoSuma.numerador = a.numerador + b.numerador;
				resultadoSuma.denomidaor = a.denomidaor;

			}
			
			return resultadoSuma;

		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Racional r1 = new Racional();
		Racional r2 = new Racional();
		
		r1.numerador = 1;
		r1.denomidaor = 2;
		
		r2.numerador = 3;
		r2.denomidaor = 4;
		
		Racional r3;
		r3 = r1.sumaRacionales(r1, r2);
		
		if (r3 != null) {
			
			System.out.println("El resultado de la suma es: " + r3.numerador + "/" + r3.denomidaor);
			
		} else {
			
			System.out.println("Error ninguno de los denominadores puede ser 0");

		}

	}

}
