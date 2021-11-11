package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelD extends JPanel{

	private JButton batras;
	private JButton br;
	private Image background;
	private JTextField txtNombre;
	private JTextField txtTipo;
	private JLabel Nombre;
	private JLabel Tipo;
	
	public PanelD() {
		
		setLayout(null);
		setBackground(new ImageIcon(getClass().getResource("/imagenes/j.jpg")).getImage());
		
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
		
		JTextField TxtNombre = new JTextField();
		TxtNombre.setColumns(10);
		TxtNombre.setBounds(200, 150, 200, 20);
		add(TxtNombre);
		
		JTextField TxtTipo = new JTextField();
		TxtTipo.setColumns(10);
		TxtTipo.setBounds(200, 200, 200, 20);
		add(TxtTipo);
		
		JLabel Nombre = new JLabel("Nombre del Juego:");
		Nombre.setBounds(50, 150, 200, 20);
		add(Nombre);
		
		JLabel Tipo = new JLabel("Tipo de Juego::");
		Tipo.setBounds(50, 200, 200, 20);
		add(Tipo);
		
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
	
}
