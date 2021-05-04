/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkBoxV1;

/**
 *
 * @author Administrador
 */
public class Principal {
    public static void main(String[] args) {
        
        int valorX = 11;
        System.out.println("Binario: " + Integer.toBinaryString(valorX));
        System.out.println("Octal: " + Integer.toOctalString(valorX));
        System.out.println("Hexadecimal: " + Integer.toHexString(valorX));
        new Ventana("Convetirdor Numeros");
    }
}
