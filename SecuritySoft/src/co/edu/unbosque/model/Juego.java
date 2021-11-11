package co.edu.unbosque.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;
import co.edu.unbosque.model.persistence.Ljuego;

public class Juego {
	
	File Archivo;
	
	public static void EscribirArchivo() {
		
	    Ljuego J = new Ljuego();
	    
	    File Archivo = new File("Juego.info");
	    
	    try {
	    	FileOutputStream fos = new FileOutputStream(Archivo, true);
	    	ObjectOutputStream oos = new ObjectOutputStream(fos);
	    	oos.writeObject(J);
	    	fos.close();
	    	oos.close();
	    	
	    }catch (IOException e) {
	    	System.out.println("error juego no encontrado .");
	    	e.printStackTrace();
	    }    
		}
		public void LeerArrchivo() {
			File Archivo = new File ("Juego.info");
			try {
				FileInputStream fis = new FileInputStream(Archivo);
				ObjectInputStream ois; 
				while (fis.available()>0) {
					ois = new ObjectInputStream(fis);
					Ljuego J = (Ljuego) ois.readObject();
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