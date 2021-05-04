/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkBoxV1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.html.HTML;

/**
 *
 * @author Administrador
 */
public class Ventana extends JFrame{

    public Ventana(String string) throws HeadlessException {
        super(string);
        
        setSize(700, 600);
        setLocationRelativeTo(null);
        
        JPanel panelNorte = new JPanel();
        JPanel panelCentro = new JPanel();
        JPanel panelSur = new JPanel();
        
        JPanel panelBinario = new JPanel();
        JPanel panelOctal = new JPanel();
        JPanel panelHexadecimal = new JPanel();
        
        //panelNorte.setSize(210, 80);
        //panelNorte.setBackground(Color.BLUE);
        
        //panelBinario.setSize(210, 80);
        //panelBinario.setLayout(new BorderLayout());
        panelBinario.setBackground(Color.BLUE);
        //panelBinario.setAlignmentY(CENTER_ALIGNMENT);
        //panelOctal.setSize(210, 80);
        panelOctal.setBackground(Color.PINK);
        //panelHexadecimal.setSize(210, 80);
        panelHexadecimal.setBackground(Color.ORANGE);
        
        panelCentro.setLayout(new GridLayout(3, 2));
        
        JLabel etiquetaDecimal = new JLabel("Numero Decimal: ");
        
        JTextField decimal = new JTextField();
        
        JTextField binario = new JTextField();
        JTextField octal = new JTextField();
        JTextField hexa = new JTextField();
        
        JCheckBox checkBinario = new JCheckBox("binario");
        JCheckBox checkOctal = new JCheckBox("octal");
        JCheckBox checkHexa = new JCheckBox("hexadecimal");
        
        Dimension tamanoTexto = new Dimension(100, 20);
        Dimension maximoTexto = new Dimension(110, 25);
        
        //decimal.setSize(100, 40);
        decimal.setPreferredSize(tamanoTexto);
        //decimal.setMinimumSize(tamanoTexto);
        //decimal.setAlignmentX(CENTER_ALIGNMENT);
        //decimal.setLocation(0, 0);
        
        binario.setPreferredSize(tamanoTexto);
        binario.setMinimumSize(tamanoTexto);
        binario.setMaximumSize(maximoTexto);
        //binario.setSize(100, 20);
        //binario.setBounds(0, 0, 100, 20);
        //binario.setHorizontalAlignment(JTextField.CENTER);
        //binario.setAlignmentY(CENTER_ALIGNMENT);
        binario.setLocation(0, 80);
        octal.setPreferredSize(tamanoTexto);
        hexa.setPreferredSize(tamanoTexto);
        
        //System.out.println("antes de agregar: " + binario.getSize());
        
        panelNorte.add(etiquetaDecimal);
        panelNorte.add(decimal);
        
        panelCentro.add(checkHexa, 0, 0);
        panelHexadecimal.add(hexa);
        panelCentro.add(panelHexadecimal, 0, 1);
        panelCentro.add(checkOctal, 1, 0);
        panelOctal.add(octal);
        panelCentro.add(panelOctal, 1, 1);
        panelCentro.add(checkBinario, 2, 0);
        panelBinario.add(binario);
        panelCentro.add(panelBinario, 2, 1);
        
        /*binario.setBounds(0, 0, 100, 20);
        binario.revalidate();
        binario.repaint();*/
        
        System.out.println(binario.getAlignmentY());
        
        this.add(panelNorte, BorderLayout.NORTH);
        this.add(panelCentro, BorderLayout.CENTER);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setVisible(true);
    }
    
}
