package parte2.version3;

public class Racional {
	
	private int numerador;
	private int denomidaor;
	
	
	
	public int getNumerador() {
		return numerador;
	}



	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}



	public int getDenomidaor() {
		return denomidaor;
	}



	public void setDenomidaor(int denomidaor) {
		this.denomidaor = denomidaor;
	}

	
	public void setRacional(int numerador, int denominador) {
		
		this.numerador = numerador;
		this.denomidaor = denominador;
		
	}


	static Racional sumaRacionales(Racional a, Racional b) {
		
		Racional resultadoSuma = new Racional();
		
		if (a.getDenomidaor() == 0 || b.getDenomidaor() == 0) {
			
			return null;
			
		} else {
			
			if (a.getDenomidaor() != b.getDenomidaor()) {
				
				resultadoSuma.setNumerador((a.getNumerador() * b.getDenomidaor()) + (b.getNumerador() * a.getDenomidaor()));
				resultadoSuma.setDenomidaor(a.getDenomidaor() * b.getDenomidaor());
				
			} else {
				
				resultadoSuma.setNumerador(a.getNumerador() + b.getNumerador());
				resultadoSuma.setDenomidaor(a.getDenomidaor());

			}
			
			return resultadoSuma;

		}
		
	}

}
