package administradoresDeDiseño;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Ventana extends JFrame {

	public Ventana(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
		setSize(600, 500);
		setLocationRelativeTo(null);
		
		//setBackground(Color.CYAN);
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		Container panel_raiz = getContentPane();
		
		panel1.setBackground(Color.green);
		panel2.setBackground(Color.lightGray);
		panel3.setBackground(Color.CYAN);
		panel4.setBackground(Color.yellow);
		panel5.setBackground(Color.red);
		
		//panel1.setAlignmentX(CENTER_ALIGNMENT);
		//panel3.setAlignmentX(CENTER_ALIGNMENT);
		
		panel1.setLayout(new BorderLayout());
		panel3.setLayout(new GridLayout(3, 2));
		
		JLabel etiqueta1 = new JLabel("Panel Norte");
		JLabel etiqueta2 = new JLabel("Panel Centro");
		etiqueta2.setLocation(0, 0);
		JLabel etiqueta3 = new JLabel("Panel Sur");
		
		panel1.add(etiqueta1);
		panel2.add(etiqueta2);
		panel3.add(etiqueta3, 0, 0);
		
		panel_raiz.add(panel1, BorderLayout.NORTH);
		panel_raiz.add(panel2, BorderLayout.CENTER);
		panel_raiz.add(panel3, BorderLayout.SOUTH);
		panel_raiz.add(panel4, BorderLayout.WEST);
		panel_raiz.add(panel5, BorderLayout.EAST);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}

}
