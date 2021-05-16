package arbolGrafico;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class VentanasPrueba extends JFrame implements AdjustmentListener{
	
	JLabel lc1;	//, lc2, lc3;
	
	ImageIcon c1, c2, c3;

	public VentanasPrueba(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
		
		//setLayout(null);
		setSize(700, 700);
		setLocationRelativeTo(null);
		
		c1 = new ImageIcon("src/imagenesPrueba/cuadro_rojo.png");
		c2 = new ImageIcon("src/imagenesPrueba/cuadro_azul.png");
		c3 = new ImageIcon("src/imagenesPrueba/cuadro_verde.png");
		
		JPanel panelImagenes = new JPanel();
		
		panelImagenes.setPreferredSize (new Dimension(600, 300));
		
		JScrollBar desplazadorAbajo = new JScrollBar(JScrollBar.HORIZONTAL, 0, 1, 0, 3);
		
		desplazadorAbajo.addAdjustmentListener(this);
		
		lc1 = new JLabel();
		lc1.setIcon(c1);
		//lc1.setBounds(80, 50, 200, 200);
		//lc2 = new JLabel("", c2, SwingConstants.CENTER);
		//lc3 = new JLabel("", c3, SwingConstants.RIGHT);
		
		//panelImagenes.add(lc1);
		//panelImagenes.add(lc2);
		//panelImagenes.add(lc3);
		
		
		add(lc1, BorderLayout.NORTH);
		add(desplazadorAbajo, BorderLayout.SOUTH);
		setVisible(true);
		
	}

	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		// TODO Auto-generated method stub
		//System.out.println(e.getValue());
		switch (e.getValue()) {
		case 0:
			lc1.setIcon(c1);
			break;

		case 1:
			lc1.setIcon(c2);
			break;
			
		case 2:
			lc1.setIcon(c3);
			break;
			
		default:
			break;
		}
	}

}
