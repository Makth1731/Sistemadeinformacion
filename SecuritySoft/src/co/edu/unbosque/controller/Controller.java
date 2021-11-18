package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import co.edu.unbosque.view.Vista;

public class Controller implements ActionListener{
	
	private Vista gui;

	public Controller() {
		
		gui = new Vista(this);
		gui.setVisible(true);
	}

	public void actionPerformed(ActionEvent evento) {
	
		gui.getPanelResultado();
	
	}
	
}
