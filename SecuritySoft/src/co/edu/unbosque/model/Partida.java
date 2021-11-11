package co.edu.unbosque.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import co.edu.unbosque.model.persistence.Lpartida;


// En esta clase se implementan los métodos básicos de lectura y escritura
// de los dos ejemplos de clase, por esta razón, van aquí.

public class Partida{

	
	private String ruta = "./data/Partida.info";

	private File f; 
	private FileOutputStream fos;     
	private ObjectOutputStream oos;
	private FileInputStream fis;     
	private ObjectInputStream ois;
	
	private Lpartida par;
	
	public Partida() {
		
		par = new Lpartida();
	
	}
	
	public String escribirArchivoBinario(Lpartida Lpartida) {
		String mensaje="Archivo Generado Exitosamente!";
		f = new File(ruta);
		try{     
			fos = new FileOutputStream(f);     
			oos = new ObjectOutputStream(fos);  
			oos.writeObject(par);
			oos.close();
			fos.close();
			System.out.println(par);
		} 
		catch(FileNotFoundException e){     
			mensaje= "No se encontro el archivo"; 
		} 
		catch(IOException e){     
			mensaje = "Error al escribir"; 
		}
		return mensaje;
	}
	
	public void leerArchivoBinariol() {
		f = new File(ruta);
		try {
			fis = new FileInputStream(f);
			ois = new ObjectInputStream(fis);
			par = (Lpartida) ois.readObject();
			ois.close();
		}
		catch(IOException e){     
			e.printStackTrace(); 
		} 
	}
}