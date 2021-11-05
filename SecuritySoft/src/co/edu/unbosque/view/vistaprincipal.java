package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;

public class vistaprincipal extends JFrame {

	private PanelA pa;

	public vistaprincipal() {
		
		
		setTitle ("Picas y Fijas");
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

		
		pa = new PanelA();
		pa.setBounds(0, 0, 700, 500);
		getContentPane().add(pa);
		
	}
	public PanelA getPbotones() {
		return pa;
	}
	public void setPbotones(PanelA pbotones) {
		this.pa = pbotones;
	}

}
