package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;

public class vistajuegos extends JFrame{

	private PanelD pd;

	public vistajuegos() {
		
		
		setTitle ("Juego");
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

		
		pd = new PanelD();
		pd.setBounds(0, 0, 700, 500);
		getContentPane().add(pd);
		
	}
	public PanelD getPd() {
		return pd;
	}
	public void setPd(PanelD pd) {
		this.pd = pd;
	}
	   
}
