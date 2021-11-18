package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelTorneo extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JButton butTorneo;
	
	public PanelTorneo() {
		setLayout( new GridLayout(1,1) );
		TitledBorder border = BorderFactory.createTitledBorder("Datos del torneo");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		butTorneo = new JButton("Torneo");
		add(butTorneo);
	}

	public JButton getButTorneo() {
		return butTorneo;
	}

	public void setButTorneo(JButton butTorneo) {
		this.butTorneo = butTorneo;
	}

}

