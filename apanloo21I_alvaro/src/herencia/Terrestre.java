package herencia;

public class Terrestre extends MediosTransporte {
	
	private int ruedas;

	public Terrestre() {
		// TODO Auto-generated constructor stub
	}

	public Terrestre(String alcance, double precio) {
		super(alcance, precio);
		// TODO Auto-generated constructor stub
	}

	public Terrestre(String alcance, double precio, int ruedas) {
		super(alcance, precio);
		this.ruedas = ruedas;
	}

	public int getRuedas() {
		return ruedas;
	}
	
	

}
