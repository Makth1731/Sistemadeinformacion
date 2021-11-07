package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.Msg;
import co.edu.unbosque.view.PanelA;
import co.edu.unbosque.view.PanelB;
import co.edu.unbosque.view.PanelC;
import co.edu.unbosque.view.vistajugador;
import co.edu.unbosque.view.vistapartida;
import co.edu.unbosque.view.vistaprincipal;

public class Controller implements ActionListener {

	private vistaprincipal vp;
	private vistajugador vj;
	private vistapartida vpp;
	private PanelA pa;
	private PanelB pb;
	private PanelC pc;
	private Msg msg;
	
	public Controller() {
		vp = new vistaprincipal();
		vj = new vistajugador();
		vpp = new vistapartida();
		pa = new PanelA();
		pb = new PanelB();
		pc = new PanelC();
		msg = new Msg();
		vp.setVisible(true);
		vj.setVisible(true);
		vpp.setVisible(true);
		asignarOyentes();
	}
	public void asignarOyentes() {
		vp.getPbotones().getJuegos().addActionListener(this);
		vp.getPbotones().getJugador().addActionListener(this);
		vp.getPbotones().getPartida().addActionListener(this);
		vp.getPbotones().getTorneos().addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
	}
	
	
	
	
	public vistaprincipal getVp() {
		return vp;
	}
	public void setVp(vistaprincipal vp) {
		this.vp = vp;
	}
	public PanelA getPa() {
		return pa;
	}
	public void setPa(PanelA pa) {
		this.pa = pa;
	}
	public Msg getMsg() {
		return msg;
	}
	public void setMsg(Msg msg) {
		this.msg = msg;
	}
	
	
}
