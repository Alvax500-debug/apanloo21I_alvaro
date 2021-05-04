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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
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
public class Ventana extends JFrame implements ActionListener{
    
    JPanel panelNorte;
    JPanel panelCentro;
    JPanel panelSur;
    
    JPanel panelBinario;
    JPanel panelOctal;
    JPanel panelHexadecimal;
    
    JLabel etiquetaDecimal;
    
    JTextField decimal;
    JTextField binario;
    JTextField octal;
    JTextField hexa;
    
    JCheckBox checkBinario;
    JCheckBox checkOctal;
    JCheckBox checkHexa;

    public Ventana(String string) throws HeadlessException {
        super(string);
        
        setSize(700, 600);
        setLocationRelativeTo(null);
        
        panelNorte = new JPanel();
        panelCentro = new JPanel();
        panelSur = new JPanel();
        
        panelBinario = new JPanel();
        panelOctal = new JPanel();
        panelHexadecimal = new JPanel();
        
        //panelBinario.setSize(210, 80);
        //panelBinario.setBackground(Color.BLUE);
        panelBinario.setAlignmentY(CENTER_ALIGNMENT);
        //panelOctal.setBackground(Color.PINK);
        //panelHexadecimal.setBackground(Color.ORANGE);
        
        panelCentro.setLayout(new GridLayout(3, 2));
        panelCentro.setAlignmentY(CENTER_ALIGNMENT);
        
        etiquetaDecimal = new JLabel("Numero Decimal: ");
        
        decimal = new JTextField();
        
        binario = new JTextField();
        binario.setEditable(false);
        octal = new JTextField();
        octal.setEditable(false);
        hexa = new JTextField();
        hexa.setEditable(false);
        
        checkBinario = new JCheckBox("binario");
        checkOctal = new JCheckBox("octal");
        checkHexa = new JCheckBox("hexadecimal");
        
        JButton botonCalcular = new JButton("Calcular");
        botonCalcular.addActionListener(this);
        
        Dimension tamanoTexto = new Dimension(100, 20);
        Dimension maximoTexto = new Dimension(110, 25);
        
        decimal.setPreferredSize(tamanoTexto);
        
        binario.setPreferredSize(tamanoTexto);
        binario.setMinimumSize(tamanoTexto);
        binario.setMaximumSize(maximoTexto);
        
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
        
        panelSur.add(botonCalcular);
        
        //System.out.println(binario.getAlignmentY());
        
        this.add(panelNorte, BorderLayout.NORTH);
        this.add(panelCentro, BorderLayout.CENTER);
        this.add(panelSur, BorderLayout.SOUTH);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (!this.decimal.getText().isEmpty()) {
            
            if (checkBinario.isSelected()) {
                binario.setText(Integer.toBinaryString(Integer.parseInt(decimal.getText())));
            }

            if (checkOctal.isSelected()) {
                octal.setText(Integer.toOctalString(Integer.parseInt(decimal.getText())));
            }

            if (checkHexa.isSelected()) {
                hexa.setText(Integer.toHexString(Integer.parseInt(decimal.getText())));
            }
        
        }
        
    }
    
}
