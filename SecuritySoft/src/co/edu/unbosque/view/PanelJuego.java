package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelJuego extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JLabel labNombre;
	private JLabel labTJ;
	private JTextField txtNombre;
	private JTextField txtTJ;
	private JButton butEscribir;
	private JButton butLeer;
	
	public PanelJuego() {
		setLayout( new GridLayout(3,1) );
		TitledBorder border = BorderFactory.createTitledBorder("Datos del juego");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		labNombre = new JLabel("Digite el nombre del juego");
		txtNombre = new JTextField("");
		txtNombre.setForeground(Color.BLACK);
		txtNombre.setBackground(Color.WHITE);
		labTJ = new JLabel("Digite el tipo de juego");
		txtTJ = new JTextField("");
		txtTJ.setForeground(Color.BLACK);
		txtTJ.setBackground(Color.WHITE);
		butEscribir = new JButton("Escribir");
		butLeer = new JButton("Leer");
		add(labNombre);
		add(txtNombre);
		add(labTJ);
		add(txtTJ);
		add(butLeer);
		add(butEscribir);
	}

	public JLabel getLabNombre() {
		return labNombre;
	}

	public void setLabNombre(JLabel labNombre) {
		this.labNombre = labNombre;
	}

	public JLabel getLabTJ() {
		return labTJ;
	}

	public void setLabTJ(JLabel labTJ) {
		this.labTJ = labTJ;
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextField getTxtTJ() {
		return txtTJ;
	}

	public void setTxtTJ(JTextField txtTJ) {
		this.txtTJ = txtTJ;
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
