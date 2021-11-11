package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class vistajugador extends JFrame{

	private PanelB pb;

	public vistajugador() {
		
		
		setTitle ("Jugador");
		setSize(700, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.black);
		getContentPane().setLayout(null);
		
		
		inicializarComponentes();
		
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		}
	   public void inicializarComponentes() {

		
		pb = new PanelB();
		pb.setBounds(0, 0, 700, 500);
		getContentPane().add(pb);
		
		JTextField TxtNombre1 = new JTextField();
		TxtNombre1.setColumns(10);
		TxtNombre1.setBounds(183, 119, 200, 20);
		getContentPane().add(TxtNombre1);
		
		JTextField TxtEdad1 = new JTextField();
		TxtEdad1.setColumns(10);
		TxtEdad1.setBounds(183, 75, 200, 20);
		getContentPane().add(TxtEdad1);
		
		JTextField TxtGenero1 = new JTextField();
		TxtGenero1.setColumns(10);
		TxtGenero1.setBounds(183, 25, 200, 20);
		getContentPane().add(TxtGenero1);
			
		
	}
	public PanelB getPb() {
		return pb;
	}
	public void setPb(PanelB pb) {
		this.pb = pb;
	}
	   
}
