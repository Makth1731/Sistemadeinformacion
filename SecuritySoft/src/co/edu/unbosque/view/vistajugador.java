package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;

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
		
	}
	public PanelB getPb() {
		return pb;
	}
	public void setPb(PanelB pb) {
		this.pb = pb;
	}
	   
}
