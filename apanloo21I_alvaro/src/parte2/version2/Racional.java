package parte2.version2;

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

}
