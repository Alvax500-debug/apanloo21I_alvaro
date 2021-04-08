package herencia;

public class Auto extends Terrestre {
	
	private String tipo;

	public Auto() {
		// TODO Auto-generated constructor stub
	}

	public Auto(String alcance, double precio) {
		super(alcance, precio);
		// TODO Auto-generated constructor stub
	}

	public Auto(String alcance, double precio, int ruedas) {
		super(alcance, precio, ruedas);
		// TODO Auto-generated constructor stub
	}

	public Auto(String alcance, double precio, int ruedas, String tipo) {
		super(alcance, precio, ruedas);
		this.tipo = tipo;
		//super(alcance, precio, ruedas); // ESTO NO SE PUEDE, PRIMERO DEBE IR EL CONSTRUCTOR DE LA SUPERCLASE
	}
	
	public void getInformacion() {
		System.out.println();
		System.out.println("Esto es un Automovil: ");
		System.out.println("De tipo " + this.tipo);
		System.out.println("Con alcance " + this.getAlcance());
		System.out.println("Cuenta con " + this.getRuedas() + " ruedas");
		System.out.println("Con un precio de $" + this.getPrecio());
	}

}
