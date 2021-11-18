package co.edu.unbosque.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import co.edu.unbosque.model.persistence.Ljugador;



public class Jugador {
	
	File Archivo;
	
	public static void EscribirArchivo() {
		
	    Ljugador S = new Ljugador();
	    
	    File Archivo = new File("Jugadores.info");
	    
	    try {
	    	FileOutputStream fos = new FileOutputStream(Archivo, true);
	    	ObjectOutputStream oos = new ObjectOutputStream(fos);
	    	oos.writeObject(S);
	    	fos.close();
	    	oos.close();
	    	
	    }catch (IOException e) {
	    	System.out.println("error papito/mamita .");
	    	e.printStackTrace();
	    }    
		}
		public void LeerArrchivo() {
			File Archivo = new File ("Jugadores.info");
			try {
				FileInputStream fis = new FileInputStream(Archivo);
				ObjectInputStream ois; 
				while (fis.available()>0) {
					ois = new ObjectInputStream(fis);
					Ljugador J = (Ljugador) ois.readObject();
				    System.out.println(J);
				    fis.close();
				    ois.close();
				}
				
				
			} catch (Exception e) {
				System.out.println("Error");
			     e.printStackTrace();
			}
			
		}
		
		private int escribirArchivoJugador() {
			try {
				ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(Archivo));
				Object jugador = true;
				salida.writeObject(jugador);
				salida.close();
				
			}catch(IOException e) {
				return -1;	
			}
			return 0;
		}
		private int leerArchivoJugadores() {
			try {
				ObjectInputStream in = new ObjectInputStream(new FileInputStream(Archivo));
				ArrayList<Ljugador> jugador = (ArrayList<Ljugador>)in.readObject(); 
				in.close();
				
			}catch (IOException | ClassNotFoundException e) {		
				return -1;
			}
			return 0;
			
		}

}
