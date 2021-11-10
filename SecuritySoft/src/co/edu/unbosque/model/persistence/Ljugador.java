package co.edu.unbosque.model.persistence;

public class Ljugador {
	
	private String Nombre;
	private String Edad;
	private String Genero;
	
	public void Jugador (String Nombre, String Genero, String Edad) {
		
		this.Nombre = Nombre;
		this.Edad = Edad;
		this.Genero = Genero;
		
		
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getEdad() {
		return Edad;
	}

	public void setEdad(String edad) {
		Edad = edad;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}

	

}
