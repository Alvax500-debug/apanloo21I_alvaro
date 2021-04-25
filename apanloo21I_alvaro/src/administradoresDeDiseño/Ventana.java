package administradoresDeDiseño;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame {

	public Ventana(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
		setSize(600, 500);
		setLocationRelativeTo(null);
		
		setBackground(Color.CYAN);
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		
		Container panel_raiz = getContentPane();
		
		panel1.setBackground(Color.green);
		panel2.setBackground(Color.lightGray);
		panel3.setBackground(Color.red);
		
		JLabel etiqueta1 = new JLabel("Panel Norte");
		JLabel etiqueta2 = new JLabel("Panel Centro");
		JLabel etiqueta3 = new JLabel("Panel Sur");
		
		panel_raiz.add(panel1, BorderLayout.NORTH);
		panel_raiz.add(panel2, BorderLayout.CENTER);
		panel_raiz.add(panel3, BorderLayout.SOUTH);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

}
