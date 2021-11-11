package co.edu.unbosque.model.persistence;

import java.io.Serializable;

public class Ljugador implements Serializable {
	
	private String Nombre1 ="";
	private int Edad1 = 0;
	private String Genero1 = "" ;
	private String Nombre2 = "";
	private int Edad2 = 0;
	private String Genero2 = "";
	
	public void Jugador (String Nombre1, String Genero1, int Edad1, String Nombre2, String Genero2, int Edad2) {
		
		this.Nombre1 = Nombre1;
		this.Edad1 = Edad1;
		this.Genero1 = Genero1;	
		this.Nombre2 = Nombre2;
		this.Edad2 = Edad2;
		this.Genero2 = Genero2;	
	}


	public String toString () {
		return "Jugador(" + "Nombre = " + Nombre1 + ", Edad = " + Edad1 + ", Genero = " + Genero1
				          + "Nombre = " + Nombre2 + ", Edad = " + Edad2 + ", Genero = " + Genero2;
	}


	public String getNombre1() {
		return Nombre1;
	}


	public void setNombre1(String nombre1) {
		Nombre1 = nombre1;
	}


	public int getEdad1() {
		return Edad1;
	}


	public void setEdad1(int edad1) {
		Edad1 = edad1;
	}


	public String getGenero1() {
		return Genero1;
	}


	public void setGenero1(String genero1) {
		Genero1 = genero1;
	}


	public String getNombre2() {
		return Nombre2;
	}


	public void setNombre2(String nombre2) {
		Nombre2 = nombre2;
	}


	public int getEdad2() {
		return Edad2;
	}


	public void setEdad2(int edad2) {
		Edad2 = edad2;
	}


	public String getGenero2() {
		return Genero2;
	}


	public void setGenero2(String genero2) {
		Genero2 = genero2;
	}
}

