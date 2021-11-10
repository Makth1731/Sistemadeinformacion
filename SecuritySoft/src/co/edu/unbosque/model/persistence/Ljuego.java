package co.edu.unbosque.model.persistence;

public class Ljuego {
	
	private String Juego1;
	private String Juego2;
	private String Juego3;
	
	public void Juego (String Juego1, String Juego2, String Juego3) {
		
		this.Juego1 = Juego1;
		this.Juego2 = Juego2;
		this.Juego3 = Juego3;
		
		
	}

	public String getJuego1() {
		return Juego1;
	}

	public void setJuego1(String juego1) {
		Juego1 = juego1;
	}

	public String getJuego2() {
		return Juego2;
	}

	public void setJuego2(String juego2) {
		Juego2 = juego2;
	}

	public String getJuego3() {
		return Juego3;
	}

	public void setJuego3(String juego3) {
		Juego3 = juego3;
	}

	

}
