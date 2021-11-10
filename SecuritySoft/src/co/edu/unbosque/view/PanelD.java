package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelD extends JPanel{

	private JButton batras;
	private Image background;
	
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
	
}
