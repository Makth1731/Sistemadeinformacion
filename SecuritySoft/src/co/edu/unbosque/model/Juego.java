package co.edu.unbosque.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import co.edu.unbosque.model.persistence.Ljuego;


public class Juego {
	
	File Archivo;
	
	public void crearArchivoDatosS() {
		try {
			Archivo = new File ("Datos de los Juegos" );
			if (Archivo.createNewFile()) {
				JOptionPane.showMessageDialog(null, "Archivo Creado");
				
			}
		}catch(IOException e) {
			System.out.println(e);
			
		}
	}
	public void EscribirArchivo (Ljuego Ljuego) {
		try {
			FileWriter Escribir = new FileWriter (Archivo, true);
			Escribir.write(Ljuego.getJuego1() + "%" + Ljuego.getJuego2() + "%" + Ljuego.getJuego3() ); 
		    Escribir.close();
		    
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}