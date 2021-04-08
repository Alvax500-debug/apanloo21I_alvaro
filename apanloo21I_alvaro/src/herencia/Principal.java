package herencia;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bicicleta bici1 = new Bicicleta("Individual", 2000, 2, "ruta");
		Bicicleta bici2 = new Bicicleta("Dos personas", 3573.20, 2, "Urbana");
		
		Auto auto1 = new Auto("Familias", 35000.89, 4, "Familiar");
		Auto auto2 = new Auto("Dos personas", 180000, 4, "Deportivo");
		
		bici1.getInformacion();
		auto2.getInformacion();
		bici2.getInformacion();
		auto1.getInformacion();
		
		MediosTransporte medtran1 = new MediosTransporte("Masivo", 1000000);
		MediosTransporte medtran2 = new MediosTransporte("Colectivo", 760000.13);
		
		Terrestre terr1 = new Terrestre("Colectivo", 483700.40, 16);
		Terrestre terr2 = new Terrestre("Colectivo", 120000.45, 4);
		
		System.out.println();
		System.out.println("Medio de transporte que cuenta con alcance: " + medtran1.getAlcance() + " y con un precio de $" + medtran1.getPrecio());
		System.out.println("Transporte terrestre que cuenta con alcance: " + terr1.getAlcance() + ", con un precio de $" + terr1.getPrecio() + " y tenga" + terr1.getRuedas() + " ruedas");
		System.out.println("Medio de transporte que cuenta con alcance: " + medtran2.getAlcance() + " y con un precio de $" + medtran2.getPrecio());
		System.out.println("Transporte terrestre que cuenta con alcance: " + terr2.getAlcance() + ", con un precio de $" + terr2.getPrecio() + " y tenga" + terr2.getRuedas() + " ruedas");

	}

}
