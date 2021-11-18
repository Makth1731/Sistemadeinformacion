package co.edu.unbosque.model.persistence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class DaoJuego {
	
	private ArrayList<Ljuego> juego;
	private String NombreArchivo = "Datos_juego.Dat";
	
	public DaoJuego() {
		juego = new ArrayList<Ljuego>();
	}
	public Ljuego BuscarJuego1(String Ajedrez) {
		leerArchivoJuego();
		for(Ljuego juegos : juego ) {
			if(juegos.getJuego1().equals(Ajedrez) );
			return juegos;
		}
		return null;
		
	}
	public Ljuego BuscarJuego2(String Domino) {
		leerArchivoJuego();
		for(Ljuego juegos : juego ) {
			if(juegos.getJuego1().equals(Domino) );
			return juegos;
		}
		return null;
	}
	public Ljuego BuscarJuego3(String Parchis) {
		leerArchivoJuego();
		for(Ljuego juegos : juego ) {
			if(juegos.getJuego1().equals(Parchis) );
			return juegos;
		}
		return null;
}
	public void AgregarJuegos(Ljuego juegos) {
		leerArchivoJuego();
		juego.add(juegos);
		escribirArchivoJuego();
		
	}
	public ArrayList<Ljuego>getJuego(){
		return juego;
		
	}
	public void setJuego(ArrayList<Ljuego>juego) {
		this.juego = juego;
}
	private int escribirArchivoJuego() {
		try {
			ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(NombreArchivo));
			salida.writeObject(juego);
			salida.close();
			
		}catch(IOException e) {
			return -1;	
		}
		return 0;
	}
	private int leerArchivoJuego() {
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(NombreArchivo));
			juego = (ArrayList<Ljuego>)in.readObject(); 
			in.close();
			
		}catch (IOException | ClassNotFoundException e) {		
			return -1;
		}
		return 0;
	}

}
