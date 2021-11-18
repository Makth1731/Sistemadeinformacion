package co.edu.unbosque.view;

import java.awt.GridLayout;
import javax.swing.JFrame;
import co.edu.unbosque.controller.Controller;

public class Vista extends JFrame{

	private static final long serialVersionUID = 1L;

	private PanelJuego panelJuego;
	private PanelResultado panelResultado;
	private PanelPartida panelpartida;
	private PanelJugador panelJugador;
	private PanelTorneo panelTorneo;

	public Vista(Controller control) {
		
		setSize(800,800);
		setResizable(false);
		setTitle("Sistema de Informacion de juegos");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout( new GridLayout(5,1) );
		panelJugador = new PanelJugador();
		add(panelJugador);
		panelJuego = new PanelJuego();
		add(panelJuego);
		panelpartida = new PanelPartida();
		add(panelpartida);
		panelTorneo = new PanelTorneo();
		add(panelTorneo);
		panelResultado = new PanelResultado();
		add(panelResultado);
		panelJuego.getButEscribir().addActionListener(control);
	}

	public PanelJuego getPanelJuego() {
		return panelJuego;
	}

	public void setPanelJuego(PanelJuego panelJuego) {
		this.panelJuego = panelJuego;
	}

	public PanelResultado getPanelResultado() {
		return panelResultado;
	}

	public void setPanelResultado(PanelResultado panelResultado) {
		this.panelResultado = panelResultado;
	}

	public PanelPartida getPanelpartida() {
		return panelpartida;
	}

	public void setPanelpartida(PanelPartida panelpartida) {
		this.panelpartida = panelpartida;
	}

	public PanelJugador getPanelJugador() {
		return panelJugador;
	}

	public void setPanelJugador(PanelJugador panelJugador) {
		this.panelJugador = panelJugador;
	}

	public PanelTorneo getPanelTorneo() {
		return panelTorneo;
	}

	public void setPanelTorneo(PanelTorneo panelTorneo) {
		this.panelTorneo = panelTorneo;
	}
	
}
