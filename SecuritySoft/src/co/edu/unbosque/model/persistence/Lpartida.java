package co.edu.unbosque.model.persistence;

public class Lpartida {
	
	private String TipoPar;
	private String Jugador1;
	private String Jugador2;
	private double Puntaje1;
	private double Puntaje2;
	
	
	public void Jugador (String TipoPar, String Jugador1, String Jugador2, double Puntaje1, double Puntaje2) {
		
		this.TipoPar = TipoPar;
		this.Jugador1 = Jugador1;
		this.Jugador2 = Jugador2;
		this.Puntaje1 = Puntaje1;
		this.Puntaje2 = Puntaje2;
		
		
	}


	public String getTipoPar() {
		return TipoPar;
	}


	public void setTipoPar(String tipoPar) {
		TipoPar = tipoPar;
	}


	public String getJugador1() {
		return Jugador1;
	}


	public void setJugador1(String jugador1) {
		Jugador1 = jugador1;
	}


	public String getJugador2() {
		return Jugador2;
	}


	public void setJugador2(String jugador2) {
		Jugador2 = jugador2;
	}


	public double getPuntaje1() {
		return Puntaje1;
	}


	public void setPuntaje1(double puntaje1) {
		Puntaje1 = puntaje1;
	}


	public double getPuntaje2() {
		return Puntaje2;
	}


	public void setPuntaje2(double puntaje2) {
		Puntaje2 = puntaje2;
	}

	
}