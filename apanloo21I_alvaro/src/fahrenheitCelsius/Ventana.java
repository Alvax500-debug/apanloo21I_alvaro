package fahrenheitCelsius;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Ventana extends JFrame implements ActionListener {

	public Ventana(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
		setSize(700, 220);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
