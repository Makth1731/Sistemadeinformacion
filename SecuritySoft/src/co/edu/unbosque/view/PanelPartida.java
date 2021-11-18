package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelPartida extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JLabel labJ1;
	private JLabel labJ2;
	private JLabel labP1;
	private JLabel labP2;
	private JLabel labTP;
	private JTextField txtJ1;
	private JTextField txtJ2;
	private JTextField txtP1;
	private JTextField txtP2;
	private JTextField txtTP;
	private JButton butEscribir;
	private JButton butLeer;
	
	public PanelPartida() {
		setLayout( new GridLayout(6,1) );
		TitledBorder border = BorderFactory.createTitledBorder("Datos de la Partida");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		labJ1 = new JLabel("Digite el nombre del jugador 1");
		txtJ1 = new JTextField("");
		txtJ1.setForeground(Color.BLACK);
		txtJ1.setBackground(Color.WHITE);
		labJ2 = new JLabel("Digite el nombre del jugador 2");
		txtJ2 = new JTextField("");
		txtJ2.setForeground(Color.BLACK);
		txtJ2.setBackground(Color.WHITE);
		labP1 = new JLabel("Digite el puntaje del jugador 1");
		txtP1 = new JTextField("");
		txtP1.setForeground(Color.BLACK);
		txtP1.setBackground(Color.WHITE);
		labP2 = new JLabel("Digite el puntaje del jugador 2");
		txtP2 = new JTextField("");
		txtP2.setForeground(Color.BLACK);
		txtP2.setBackground(Color.WHITE);
		labTP = new JLabel("Digite el tipo de partida");
		txtTP = new JTextField("");
		txtTP.setForeground(Color.BLACK);
		txtTP.setBackground(Color.WHITE);
		butEscribir = new JButton("Escribir");
		butLeer = new JButton("Leer");
		add(labJ1);
		add(txtJ1);
		add(labJ2);
		add(txtJ2);
		add(labP1);
		add(txtP1);
		add(labP2);
		add(txtP2);
		add(labTP);
		add(txtTP);
		add(butLeer);
		add(butEscribir);
	}

	public JLabel getLabJ1() {
		return labJ1;
	}

	public void setLabJ1(JLabel labJ1) {
		this.labJ1 = labJ1;
	}

	public JLabel getLabJ2() {
		return labJ2;
	}

	public void setLabJ2(JLabel labJ2) {
		this.labJ2 = labJ2;
	}

	public JLabel getLabP1() {
		return labP1;
	}

	public void setLabP1(JLabel labP1) {
		this.labP1 = labP1;
	}

	public JLabel getLabP2() {
		return labP2;
	}

	public void setLabP2(JLabel labP2) {
		this.labP2 = labP2;
	}

	public JLabel getLabTP() {
		return labTP;
	}

	public void setLabTP(JLabel labTP) {
		this.labTP = labTP;
	}

	public JTextField getTxtJ1() {
		return txtJ1;
	}

	public void setTxtJ1(JTextField txtJ1) {
		this.txtJ1 = txtJ1;
	}

	public JTextField getTxtJ2() {
		return txtJ2;
	}

	public void setTxtJ2(JTextField txtJ2) {
		this.txtJ2 = txtJ2;
	}

	public JTextField getTxtP1() {
		return txtP1;
	}

	public void setTxtP1(JTextField txtP1) {
		this.txtP1 = txtP1;
	}

	public JTextField getTxtP2() {
		return txtP2;
	}

	public void setTxtP2(JTextField txtP2) {
		this.txtP2 = txtP2;
	}

	public JTextField getTxtTP() {
		return txtTP;
	}

	public void setTxtTP(JTextField txtTP) {
		this.txtTP = txtTP;
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
