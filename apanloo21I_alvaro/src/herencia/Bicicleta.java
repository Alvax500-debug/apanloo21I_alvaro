package herencia;

public class Bicicleta extends Terrestre {
	
	private String tipo;

	public Bicicleta() {
		// TODO Auto-generated constructor stub
	}

	public Bicicleta(String alcance, double precio) {
		super(alcance, precio);
		// TODO Auto-generated constructor stub
	}

	public Bicicleta(String alcance, double precio, int ruedas) {
		super(alcance, precio, ruedas);
		// TODO Auto-generated constructor stub
	}

	public Bicicleta(String alcance, double precio, int ruedas, String tipo) {
		super(alcance, precio, ruedas);
		this.tipo = tipo;
	}
	
	public void getInformacion() {
		System.out.println();
		System.out.println("Esta es una bicicleta: ");
		System.out.println("De tipo " + this.tipo);
		System.out.println("Con alcance " + this.getAlcance());
		System.out.println("Cuenta con " + this.getRuedas() + " ruedas");
		System.out.println("Con un precio de $" + this.getPrecio());
	}

}
