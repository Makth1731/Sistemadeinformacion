package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import co.edu.unbosque.controller.Controller;

public class PanelB extends JPanel {

	private JButton batras;
	private JButton br;
	private Image background;
	private JTextField txtNombre1;
	private JTextField txtEdad1;
	private JTextField txtGenero1;
	private JTextField txtNombre2;
	private JTextField txtEdad2;
	private JTextField txtGenero2;
	private JLabel Jugador;
	private JLabel Edad;
	private JLabel Genero;
	private JLabel Jugador2;
	private JLabel Edad2;
	private JLabel Genero2;
	
	
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
		JTextField TxtNombre1 = new JTextField();
		TxtNombre1.setColumns(10);
		TxtNombre1.setBounds(100, 150, 200, 20);
		add(TxtNombre1);
		
		JTextField TxtEdad1 = new JTextField();
		TxtEdad1.setColumns(10);
		TxtEdad1.setBounds(100, 200, 200, 20);
		add(TxtEdad1);
		
		JTextField TxtGenero1 = new JTextField();
		TxtGenero1.setColumns(10);
		TxtGenero1.setBounds(100, 250, 200, 20);
		add(TxtGenero1);
		
		JTextField TxtNombre2 = new JTextField();
		TxtNombre2.setColumns(10);
		TxtNombre2.setBounds(450, 150, 200, 20);
		add(TxtNombre2);
		
		JTextField TxtEdad2 = new JTextField();
		TxtEdad2.setColumns(10);
		TxtEdad2.setBounds(450, 200, 200, 20);
		add(TxtEdad2);
		
		JTextField TxtGenero2 = new JTextField();
		TxtGenero2.setColumns(10);
		TxtGenero2.setBounds(450, 250, 200, 20);
		add(TxtGenero2);

		JLabel Jugador = new JLabel("J1:");
		Jugador.setBounds(50, 150, 200, 20);
		add(Jugador);
		
		JLabel Edad = new JLabel("Edad:");
		Edad.setBounds(50, 200, 200, 20);
		add(Edad);
		
		JLabel Genero = new JLabel("Genero:");
		Genero.setBounds(50, 250, 200, 20);
		add(Genero);
		
		JLabel Jugador2 = new JLabel("J2:");
		Jugador2.setBounds(400, 150, 200, 20);
		add(Jugador2);
		
		JLabel Edad2 = new JLabel("Edad:");
		Edad2.setBounds(400, 200, 200, 20);
		add(Edad2);
		
		JLabel Genero2 = new JLabel("Genero:");
		Genero2.setBounds(400, 250, 200, 20);
		add(Genero2);
			
		
		br = new JButton("Registrar");
		br.setBounds(150, 400, 200, 50);
		add(br);
		br.setActionCommand("R");
		
		batras = new JButton("Atrás");
		batras.setBounds(450, 400, 200, 50);
		add(batras);
		batras.setActionCommand("ATRAS");

	}
	
	public JButton getBr() {
		return br;
	}
	public void setBr(JButton br) {
		this.br = br;
	}
	public JButton getBatras() {
		return batras;
	}
	public void setBatras(JButton batras) {
		this.batras = batras;
	}
	public JTextField getTxtNombre1() {
		return txtNombre1;
	}
	public void setTxtNombre1(JTextField txtNombre1) {
		this.txtNombre1 = txtNombre1;
	}
	public JTextField getTxtEdad1() {
		return txtEdad1;
	}
	public void setTxtEdad1(JTextField txtEdad1) {
		this.txtEdad1 = txtEdad1;
	}
	public JTextField getTxtGenero1() {
		return txtGenero1;
	}
	public void setTxtGenero1(JTextField txtGenero1) {
		this.txtGenero1 = txtGenero1;
	}
	public JTextField getTxtNombre2() {
		return txtNombre2;
	}
	public void setTxtNombre2(JTextField txtNombre2) {
		this.txtNombre2 = txtNombre2;
	}
	public JTextField getTxtEdad2() {
		return txtEdad2;
	}
	public void setTxtEdad2(JTextField txtEdad2) {
		this.txtEdad2 = txtEdad2;
	}
	public JTextField getTxtGenero2() {
		return txtGenero2;
	}
	public void setTxtGenero2(JTextField txtGenero2) {
		this.txtGenero2 = txtGenero2;
	}
	
	
	
}
