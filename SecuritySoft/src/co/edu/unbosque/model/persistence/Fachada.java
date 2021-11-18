package co.edu.unbosque.model.persistence;

public class Fachada {

	Ljuego ljg = new Ljuego();
	Lpartida lp= new Lpartida();
	Ljugador lj = new Ljugador();
	
	public String printLjuego() {
		return ljg.getJuego1()+
		 ljg.getJuego2()+
		 ljg.getJuego3();
	}

	public String printLpartida() {
		return lp.getTipoPar()+
		 lp.getJugador1()+
		 lp.getJugador2()+
		lp.getPuntaje2()+
		lp.getPuntaje2();
	}
	public String printLJugador() {
		return 
		 lj.getNombre1()+
		 lj.getNombre2()+
		lj.getEdad1()+
		lj.getGenero1()+
		 lj.getGenero2()+
		lj.getEdad2();
	}
}
