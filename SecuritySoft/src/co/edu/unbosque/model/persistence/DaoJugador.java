package co.edu.unbosque.model.persistence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class DaoJugador {
	private ArrayList<Ljugador> jugador;
	private String NombreArchivo = "Datos_jugador.Dat";
	
	public DaoJugador() {
		jugador = new ArrayList<Ljugador>();
	}
	public Ljugador BuscarNombre1(String Nombre1) {
		leerArchivoJugadores();
		for(Ljugador jugadores : jugador) {
			if(jugadores.getNombre1().equals(Nombre1) );
			return jugadores;
		}
		return null;
		
	}
	public Ljugador BuscarGenero1(String Genero1) {
		leerArchivoJugadores();
		for(Ljugador jugadores : jugador  ) {
			if(jugadores.getGenero1().equals(Genero1) );
			return jugadores;
		}
		return null;
	}
	public Ljugador BuscarNombre2(String Nombre2) {
		leerArchivoJugadores();
		for(Ljugador jugadores : jugador) {
			if(jugadores.getNombre2().equals(Nombre2) );
			return jugadores;
		}
		return null;
	}
	public Ljugador BuscarGenero2(String Genero2) {
		leerArchivoJugadores();
		for(Ljugador jugadores : jugador  ) {
			if(jugadores.getGenero2().equals(Genero2) );
			return jugadores;
		}
		return null;
}
	public void AgregarJugadores(Ljugador jugadores) {
		leerArchivoJugadores();
		jugador.add(jugadores);
		escribirArchivoJugador();
		
	}
	public ArrayList<Ljugador>getJugador(){
		return jugador;
		
	}
	public void setJugador(ArrayList<Ljugador>jugador) {
		this.jugador = jugador;
}
	private int escribirArchivoJugador() {
		try {
			ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(NombreArchivo));
			salida.writeObject(jugador);
			salida.close();
			
		}catch(IOException e) {
			return -1;	
		}
		return 0;
	}
	private int leerArchivoJugadores() {
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(NombreArchivo));
			jugador = (ArrayList<Ljugador>)in.readObject(); 
			in.close();
			
		}catch (IOException | ClassNotFoundException e) {		
			return -1;
		}
		return 0;
	}


}