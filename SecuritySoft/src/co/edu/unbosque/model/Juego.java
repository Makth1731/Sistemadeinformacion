package co.edu.unbosque.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

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
		private int escribirArchivoJuego() {
			try {
				ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(Archivo));
				Object juego = true;
				salida.writeObject(juego);
				salida.close();
				
			}catch(IOException e) {
				return -1;	
			}
			return 0;
		}
		private int leerArchivoJuego() {
			try {
				ObjectInputStream in = new ObjectInputStream(new FileInputStream(Archivo));
				ArrayList<Ljuego> juego = (ArrayList<Ljuego>)in.readObject(); 
				in.close();
				
			}catch (IOException | ClassNotFoundException e) {		
				return -1;
			}
			return 0;
		}
}