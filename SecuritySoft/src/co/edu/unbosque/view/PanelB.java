package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import co.edu.unbosque.controller.Controller;

public class PanelB extends JPanel {

	private JButton batras;
	private Image background;
	private JTextField txtNombre1;
	private JTextField txtEdad1;
	private JTextField txtGenero1;
	private JTextField txtNombre2;
	private JTextField txtEdad2;
	private JTextField txtGenero2;
	
	public PanelB() {
		
		setLayout(null);
		setBackground(new ImageIcon(getClass().getResource("/imagenes/js.jpg")).getImage());
		
		inicializarComponentes();
		setVisible(true);
	}
	public void paintComponent(Graphics g) {

		int width = 700;
		int height = 500;

		if (this.background != null) {
			g.drawImage(this.background, 0, 0, width, height, null);
		}

		super.paintComponent(g);
	}
	public void setBackground(Image image) {

		this.setOpaque(false);
		this.background = new ImageIcon(image).getImage();
		repaint();
	}
	public void inicializarComponentes() {
		setBackground(Color.black);
		
		batras = new JButton("Atrás");
		batras.setBounds(450, 400, 200, 50);
		add(batras);
		batras.setActionCommand("ATRAS");

	}
	public JButton getBatras() {
		return batras;
	}
	public void setBatras(JButton batras) {
		this.batras = batras;
	}
	public void inicializarComponentes(Controller BajoControl){
		
		
		txtNombre1 = new JTextField("");
		txtEdad1 = new JTextField("");
		txtGenero1 =new JTextField("");
		txtNombre2 = new JTextField("");
		txtEdad2 = new JTextField("");
		txtGenero2 =new JTextField("");
	}
	
	
}
