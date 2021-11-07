package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;

public class vistapartida extends JFrame{

	private PanelC pc;
	
	public vistapartida() {
		setTitle ("Partida");
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

		
		pc = new PanelC();
		pc.setBounds(0, 0, 700, 500);
		getContentPane().add(pc);
		
	
	}
	public PanelC getPc() {
		return pc;
	}
	public void setPc(PanelC pc) {
		this.pc = pc;
	}
	   
}
