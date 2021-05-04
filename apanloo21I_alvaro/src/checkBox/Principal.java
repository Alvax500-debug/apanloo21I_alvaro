package checkBox;

public class Principal {
	public static void main(String[] args) {
        
        int valorX = 11;
        System.out.println("Binario: " + Integer.toBinaryString(valorX));
        System.out.println("Octal: " + Integer.toOctalString(valorX));
        System.out.println("Hexadecimal: " + Integer.toHexString(valorX));
        new Ventana("Convetirdor Numeros");
    }
}
