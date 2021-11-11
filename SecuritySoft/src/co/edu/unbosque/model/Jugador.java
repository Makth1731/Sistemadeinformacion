package co.edu.unbosque.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;
import co.edu.unbosque.model.persistence.Ljugador;



public class Jugador {
	
	File Archivo;
	
	public static void EscribirArchivo() {
		
	    Ljugador J = new Ljugador();
	    
	    File Archivo = new File("Jugadores.info");
	    
	    try {
	    	FileOutputStream fos = new FileOutputStream(Archivo, true);
	    	ObjectOutputStream oos = new ObjectOutputStream(fos);
	    	oos.writeObject(J);
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

}
