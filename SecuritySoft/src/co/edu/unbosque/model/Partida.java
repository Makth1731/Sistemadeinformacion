package co.edu.unbosque.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import co.edu.unbosque.model.persistence.Lpartida;

public class Partida{

	private File f; 

	public static void escribirBinario() {
		
		Lpartida P = new Lpartida();
		
		File f = new File("Partida.info");
		
		try{ 
			FileOutputStream fos = new FileOutputStream(f, true);
			ObjectOutputStream oos = new ObjectOutputStream(fos);  
			oos.writeObject(P);
			oos.close();
			fos.close();
		} 
		catch(FileNotFoundException e){     
			System.out.println("Error; no se encuentra el archivo"); 
			e.printStackTrace(); 
		} 
		catch(IOException e){     
			System.out.println("Error"); 
			e.printStackTrace(); 
		}
	}
	
	public void leerArchivoBinariol() {
		File f = new File("Partida.info");
		try {
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois;
			while(fis.available()>0) {
				ois = new ObjectInputStream(fis);
				Lpartida P = (Lpartida) ois.readObject();
				System.out.println(P);
				ois.close();
				fis.close();
			}
		}
		catch(ClassNotFoundException e){     
			System.out.println("Error; no se encuentra el archivo"); 
			e.printStackTrace(); 
		} 
		catch(IOException e){  
			System.out.println("Error"); 
			e.printStackTrace(); 
		} 
	}
	
	private int escribirArchivoPartida() {
		try {
			ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(f));
			Object partida = true;
			salida.writeObject(partida);
			salida.close();
			
		}catch(IOException e) {
			return -1;	
		}
		return 0;
	}
	private int leerArchivoPartida() {
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
			ArrayList<Lpartida> partida = (ArrayList<Lpartida>)in.readObject(); 
			in.close();
			
		}catch (IOException | ClassNotFoundException e) {		
			return -1;
		}
		return 0;
	}
}