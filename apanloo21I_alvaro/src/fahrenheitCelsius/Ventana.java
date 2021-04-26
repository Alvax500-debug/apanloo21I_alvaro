package fahrenheitCelsius;

import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame implements ActionListener {
	
	public double factorConversion;
	
	JButton botonBorrar;
	JButton botonCalcular;
	JButton botonSalir;
	
	JTextField cuadroCelsius;
	JTextField cuadroFahrenheit;

	public Ventana(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
		setSize(700, 220);
		setLocationRelativeTo(null);
		
		setLayout(null);
		
		JPanel panelTextos = new JPanel();
		JPanel panelBotones = new JPanel();
		
		panelTextos.setLayout(new GridLayout(2,2,1,18));
		panelTextos.setSize(270, 80);
		panelTextos.setLocation(200, 15);
		
		panelBotones.setSize(300, 60);
		panelBotones.setLocation(200, 120);
		
		JLabel etiquetaCelsius = new JLabel("Celsius");
		JLabel etiquetaFahrenheit = new JLabel("Fahrenheit");
		
		this.cuadroCelsius = new JTextField();
		this.cuadroFahrenheit = new JTextField();
		
		cuadroCelsius.setSize(310, 10);
		cuadroFahrenheit.setSize(310, 10);
		
		panelTextos.add(etiquetaFahrenheit, 0, 0);
		panelTextos.add(cuadroFahrenheit, 0, 1);
		panelTextos.add(etiquetaCelsius, 1, 0);
		panelTextos.add(cuadroCelsius, 1, 1);
		
		this.botonBorrar = new JButton("Borrar");
		this.botonCalcular = new JButton("Calcular");
		this.botonSalir = new JButton("Salir");
		
		this.botonBorrar.addActionListener(this);
		this.botonCalcular.addActionListener(this);
		this.botonSalir.addActionListener(this);
		
		panelBotones.add(botonBorrar);
		panelBotones.add(botonCalcular);
		panelBotones.add(botonSalir);
		
		add(panelTextos);
		
		add(panelBotones);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == botonBorrar) {
			this.cuadroCelsius.setText(null);
			this.cuadroFahrenheit.setText(null);
		}
		
		if(e.getSource() == botonCalcular) {
			double resultado;
			if(!this.cuadroCelsius.getText().isEmpty() && !this.cuadroFahrenheit.getText().isEmpty()) {
				resultado = this.celsiusFahrenheit(Double.parseDouble(this.cuadroCelsius.getText()));
				this.cuadroFahrenheit.setText(Double.toString(resultado));
			}
			
			if(!this.cuadroCelsius.getText().isEmpty()) {
				resultado = this.celsiusFahrenheit(Double.parseDouble(this.cuadroCelsius.getText()));
				this.cuadroFahrenheit.setText(Double.toString(resultado));
			} else {
				resultado = this.fahrenheitCelsius(Double.parseDouble(this.cuadroFahrenheit.getText()));
				//System.out.println(resultado);
				this.cuadroCelsius.setText(Double.toString(resultado));
			}
		}
		
		if(e.getSource() == botonSalir) {
			System.exit(EXIT_ON_CLOSE);
		}
	}
	
	private double celsiusFahrenheit(double gradosCelsius) {
		factorConversion = 1.8;//9/5;
		return (factorConversion*gradosCelsius) + 32;
	}
	
	private double fahrenheitCelsius(double gradosFahrenheit) {
		//System.out.println(gradosFahrenheit);
		factorConversion = 1.8;//5/9;
		//System.out.println(factorConversion);
		return (gradosFahrenheit - 32) / factorConversion;
	}

}
