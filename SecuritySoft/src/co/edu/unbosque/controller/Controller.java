package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Jugador;
import co.edu.unbosque.view.Msg;
import co.edu.unbosque.view.PanelA;
import co.edu.unbosque.view.PanelB;
import co.edu.unbosque.view.PanelC;
import co.edu.unbosque.view.PanelD;
import co.edu.unbosque.view.vistajuegos;
import co.edu.unbosque.view.vistajugador;
import co.edu.unbosque.view.vistapartida;
import co.edu.unbosque.view.vistaprincipal;

public class Controller implements ActionListener {
	
    private Jugador J;
	private vistaprincipal vp;
	private vistajugador vjg;
	private vistapartida vpp;
	private vistajuegos vj;
	private PanelA pa;
	private PanelB pb;
	private PanelC pc;
	private PanelD pd;
	private Msg msg;
	
	public Controller() {
		
		J = new Jugador();
		vp = new vistaprincipal();
		vjg = new vistajugador();
		vpp = new vistapartida();
		vj = new vistajuegos();
		pa = new PanelA();
		pb = new PanelB();
		pc = new PanelC();
		pd = new PanelD();
		msg = new Msg();
		vp.setVisible(true);
		vjg.setVisible(false);
		vj.setVisible(false);
		vpp.setVisible(false);
		asignarOyentes();
	}
	public void asignarOyentes() {
		vp.getPbotones().getJuegos().addActionListener(this);
		vp.getPbotones().getJugador().addActionListener(this);
		vp.getPbotones().getPartida().addActionListener(this);
		vp.getPbotones().getTorneos().addActionListener(this);
		vjg.getPb().getBatras().addActionListener(this);
		vpp.getPc().getBatras().addActionListener(this);
		vj.getPd().getBatras().addActionListener(this);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String comando = e.getActionCommand();
    	if (comando.equals("Partida")) {
    			vp.setVisible(false);
				vpp.setVisible(true);
			}
    		else if(comando.equals("ATRAS")) {
    			vp.setVisible(true);
				vpp.setVisible(false);
				vj.setVisible(false);
				vjg.setVisible(false);
				
			}
    		else if(comando.equals("Jugador")) {
    			vp.setVisible(false);
				vjg.setVisible(true);
				
			}
    		else if(comando.equals("Juegos")) {
    			vp.setVisible(false);
				vj.setVisible(true);
				
			}
		
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
