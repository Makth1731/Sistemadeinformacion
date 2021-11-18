package co.edu.unbosque.model.persistence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class DaoPartida {
	
	private ArrayList<Lpartida> partida;
	private String NombreArchivo = "Datos_partida.Dat";
	
	public DaoPartida() {
		partida = new ArrayList<Lpartida>();
	}
	public Lpartida BuscarTipoPar(String TipoPar) {
		leerArchivoPartida();
		for(Lpartida partidas  : partida) {
			if(partidas.getTipoPar().equals(TipoPar) );
			return partidas;
		}
		return null;
		
	}
	public Lpartida BuscarJuador1(String jugador1) {
		leerArchivoPartida();
		for(Lpartida partidas  : partida) {
			if(partidas.getJugador1().equals(jugador1) );
			return partidas;
		}
		return null;
	}
	public Lpartida BuscarJuador2(String jugador2) {
		leerArchivoPartida();
		for(Lpartida partidas  : partida) {
			if(partidas.getJugador2().equals(jugador2) );
			return partidas;
		}
		return null;
	}
	public void AgregarPartida(Lpartida partidas) {
		leerArchivoPartida();
		partida.add(partidas);
		escribirArchivoPartida();
		
	}
	public ArrayList<Lpartida>getpartida(){
		return partida;
		
	}
	public void setPartida(ArrayList<Lpartida>partida) {
		this.partida = partida;
}
	private int escribirArchivoPartida() {
		try {
			ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(NombreArchivo));
			salida.writeObject(partida);
			salida.close();
			
		}catch(IOException e) {
			return -1;	
		}
		return 0;
	}
	private int leerArchivoPartida() {
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(NombreArchivo));
			partida = (ArrayList<Lpartida>)in.readObject(); 
			in.close();
			
		}catch (IOException | ClassNotFoundException e) {		
			return -1;
		}
		return 0;
	}

}
