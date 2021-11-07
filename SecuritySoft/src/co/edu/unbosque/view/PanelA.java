package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelA extends JPanel{

	public JButton Partida;
	public JButton Jugador;
	public JButton Juegos;
	public JButton Torneos;
	private Image background;
	
	public PanelA() {
		setLayout(null);
		setBackground(new ImageIcon(getClass().getResource("/imagenes/ss.jpg")).getImage());
		
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
		
		
		Partida = new JButton("Partida");
		Partida.setBounds(250, 200, 200, 50);
		add(Partida);
		Partida.setActionCommand("Partida");
		
		Jugador = new JButton("Jugador");
		Jugador.setBounds(250, 150, 200, 50);
		add(Jugador);
		Jugador.setActionCommand("Jugador");
		
		Juegos = new JButton("Juegos");
		Juegos.setBounds(250, 250, 200, 50);
		add(Juegos);
		Juegos.setActionCommand("Juegos");
		
		Torneos= new JButton("Torneos");
		Torneos.setBounds(250, 300, 200, 50);
		add(Torneos);
		Torneos.setActionCommand("Torneos");
		
		
		
	}
	public JButton getPartida() {
		return Partida;
	}
	public void setPartida(JButton partida) {
		Partida = partida;
	}
	public JButton getJugador() {
		return Jugador;
	}
	public void setJugador(JButton jugador) {
		Jugador = jugador;
	}
	public JButton getJuegos() {
		return Juegos;
	}
	public void setJuegos(JButton juegos) {
		Juegos = juegos;
	}
	public JButton getTorneos() {
		return Torneos;
	}
	public void setTorneos(JButton torneos) {
		Torneos = torneos;
	}
		
	
}
