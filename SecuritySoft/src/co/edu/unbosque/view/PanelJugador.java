package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelJugador extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JLabel labNombre;
	private JLabel labEdad;
	private JLabel labGenero;
	private JLabel labPuntaje;
	private JTextField txtNombre;
	private JTextField txtEdad;
	private JTextField txtGenero;
	private JTextField txtPuntaje;
	private JButton butEscribir;
	private JButton butLeer;
	
	public PanelJugador() {
		setLayout( new GridLayout(5,1) );
		TitledBorder border = BorderFactory.createTitledBorder("Datos del jugador");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		labNombre = new JLabel("Digite el nombre del jugador");
		txtNombre = new JTextField("");
		txtNombre.setForeground(Color.BLACK);
		txtNombre.setBackground(Color.WHITE);
		labEdad = new JLabel("Digite la edad");
		txtEdad = new JTextField("");
		txtEdad.setForeground(Color.BLACK);
		txtEdad.setBackground(Color.WHITE);
		labGenero = new JLabel("Digite el genero");
		txtGenero = new JTextField("");
		txtGenero.setForeground(Color.BLACK);
		txtGenero.setBackground(Color.WHITE);
		labPuntaje = new JLabel("Digite el puntaje");
		txtPuntaje = new JTextField("");
		txtPuntaje.setForeground(Color.BLACK);
		txtPuntaje.setBackground(Color.WHITE);
		butEscribir = new JButton("Escribir");
		butLeer = new JButton("Leer");
		add(labNombre);
		add(txtNombre);
		add(labEdad);
		add(txtEdad);
		add(labGenero);
		add(txtGenero);
		add(labPuntaje);
		add(txtPuntaje);
		add(butLeer);
		add(butEscribir);
	}

	public JLabel getLabNombre() {
		return labNombre;
	}

	public void setLabNombre(JLabel labNombre) {
		this.labNombre = labNombre;
	}

	public JLabel getLabEdad() {
		return labEdad;
	}

	public void setLabEdad(JLabel labEdad) {
		this.labEdad = labEdad;
	}

	public JLabel getLabGenero() {
		return labGenero;
	}

	public void setLabGenero(JLabel labGenero) {
		this.labGenero = labGenero;
	}

	public JLabel getLabPuntaje() {
		return labPuntaje;
	}

	public void setLabPuntaje(JLabel labPuntaje) {
		this.labPuntaje = labPuntaje;
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextField getTxtEdad() {
		return txtEdad;
	}

	public void setTxtEdad(JTextField txtEdad) {
		this.txtEdad = txtEdad;
	}

	public JTextField getTxtGenero() {
		return txtGenero;
	}

	public void setTxtGenero(JTextField txtGenero) {
		this.txtGenero = txtGenero;
	}

	public JTextField getTxtPuntaje() {
		return txtPuntaje;
	}

	public void setTxtPuntaje(JTextField txtPuntaje) {
		this.txtPuntaje = txtPuntaje;
	}

	public JButton getButEscribir() {
		return butEscribir;
	}

	public void setButEscribir(JButton butEscribir) {
		this.butEscribir = butEscribir;
	}

	public JButton getButLeer() {
		return butLeer;
	}

	public void setButLeer(JButton butLeer) {
		this.butLeer = butLeer;
	}
	
}
