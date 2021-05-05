/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radioButtons;

import checkBoxV2.*;
import checkBoxV1.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.html.HTML;

/**
 *
 * @author Administrador
 */
public class Ventana extends JFrame implements KeyListener, ItemListener{
    
    JPanel panelNorte;
    JPanel panelCentro;
    
    JLabel etiquetaDecimal;
    
    JTextField decimal;
    
    ButtonGroup grupoRadios;
    
    JRadioButton radioDecimal;
    JRadioButton checkBinario;
    JRadioButton checkOctal;
    JRadioButton checkHexa;
    
    String valorOriginal;

    public Ventana(String string) throws HeadlessException {
        super(string);
        
        setSize(700, 600);
        setLocationRelativeTo(null);
        
        panelNorte = new JPanel();
        panelCentro = new JPanel();
        
        
        panelCentro.setLayout(new GridLayout(4, 1));
        panelCentro.setAlignmentY(CENTER_ALIGNMENT);
        
        etiquetaDecimal = new JLabel("Numero Decimal: ");
        
        decimal = new JTextField();
        decimal.addKeyListener(this);
        
        
        grupoRadios = new ButtonGroup();
        
        radioDecimal = new JRadioButton("Decimal");
                
        checkBinario = new JRadioButton("binario");
        checkOctal = new JRadioButton("octal");
        checkHexa = new JRadioButton("hexadecimal");
        
        radioDecimal.setEnabled(false);
        checkBinario.setEnabled(false);
        checkOctal.setEnabled(false);
        checkHexa.setEnabled(false);
        
        radioDecimal.addItemListener(this);
        checkBinario.addItemListener(this);
        checkOctal.addItemListener(this);
        checkHexa.addItemListener(this);
        
        grupoRadios.add(radioDecimal);
        grupoRadios.add(checkBinario);
        grupoRadios.add(checkOctal);
        grupoRadios.add(checkHexa);
        
        Dimension tamanoTexto = new Dimension(100, 20);
        
        decimal.setPreferredSize(tamanoTexto);
        
        
        //System.out.println("antes de agregar: " + binario.getSize());
        
        panelNorte.add(etiquetaDecimal);
        panelNorte.add(decimal);
        
        
        panelCentro.add(checkHexa, 0, 0);
        
        panelCentro.add(checkOctal, 1, 0);
        
        panelCentro.add(checkBinario, 2, 0);
        
        panelCentro.add(radioDecimal, 3, 0);
        
        
        /*binario.setBounds(0, 0, 100, 20);
        binario.revalidate();
        binario.repaint();*/
        
        //panelSur.add(botonCalcular);
        
        //System.out.println(binario.getAlignmentY());
        
        this.add(panelNorte, BorderLayout.NORTH);
        this.add(panelCentro, BorderLayout.CENTER);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (!this.decimal.getText().isEmpty()) {
            
            valorOriginal = decimal.getText();
            
            radioDecimal.setEnabled(true);
            radioDecimal.setSelected(true);
            
            checkBinario.setEnabled(true);
            checkOctal.setEnabled(true);
            checkHexa.setEnabled(true);
        
        } else  {
            
            valorOriginal = null;
            
            radioDecimal.setSelected(false);
            radioDecimal.setEnabled(false);
            
            checkBinario.setEnabled(false);
            checkOctal.setEnabled(false);
            checkHexa.setEnabled(false);
            
        }
        
        //System.out.println(valorOriginal);
        
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        if (ie.getSource() == radioDecimal) {
            //binario.setText(Integer.toBinaryString(Integer.parseInt(decimal.getText())));
            decimal.setEditable(true);
            decimal.setText(valorOriginal);
        }
        
        if (ie.getSource() == checkBinario) {
            //binario.setText(Integer.toBinaryString(Integer.parseInt(decimal.getText())));
            decimal.setEditable(false);
            decimal.setText(Integer.toBinaryString(Integer.parseInt(valorOriginal)));
        }

        if (ie.getSource() == checkOctal) {
            //octal.setText(Integer.toOctalString(Integer.parseInt(decimal.getText())));
            decimal.setEditable(false);
            decimal.setText(Integer.toOctalString(Integer.parseInt(valorOriginal)));
        }

        if (ie.getSource() == checkHexa) {
            //hexa.setText(Integer.toHexString(Integer.parseInt(decimal.getText())));
            decimal.setEditable(false);
            decimal.setText(Integer.toHexString(Integer.parseInt(valorOriginal)));
        }
    }
    
}
