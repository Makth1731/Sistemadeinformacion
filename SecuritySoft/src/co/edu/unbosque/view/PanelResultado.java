package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelResultado extends JPanel{
	private static final long serialVersionUID = 1L;
	private JTextArea txtLectura;
	private JTextArea txtEscritura;
	
	public JTextArea getTxtValores() {
		return txtEscritura;
	}

	public void setTxtValores(JTextArea txtValores) {
		this.txtEscritura = txtValores;
	}

	public PanelResultado() {
		
		setLayout( new GridLayout(1,2) );
		TitledBorder border = BorderFactory.createTitledBorder("Resultados Archivos Binarios");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		txtEscritura = new JTextArea("");
		txtEscritura.setForeground(Color.BLACK);
		txtEscritura.setBackground(Color.WHITE);
	
		txtLectura = new JTextArea("");
		txtLectura.setForeground(Color.BLACK);
		txtLectura.setBackground(Color.WHITE);
		add(txtEscritura);
		add(txtLectura);
	}


	public JTextArea getTxtMonto() {
		return txtLectura;
	}

	public void setTxtMonto(JTextArea txtMonto) {
		this.txtLectura = txtMonto;
	}}
