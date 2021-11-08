package co.edu.unbosque.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import co.edu.unbosque.model.persistence.Ljugador;


public class Jugador {
	
	File Archivo;
	
	public void crearArchivoDatosJ() {
		try {
			Archivo = new File ("Datos de los Jugadores" );
			if (Archivo.createNewFile()) {
				JOptionPane.showMessageDialog(null, "Archivo Creado");
				
			}
		}catch(IOException e) {
			System.out.println(e);
			
		}
	}
	public void EscribirArchivo (Ljugador Ljugador) {
		try {
			FileWriter Escribir = new FileWriter (Archivo, true);
			Escribir.write(Ljugador.getNombre() + "%" + Ljugador.getEdad() + "%" + Ljugador.getGenero() ); 
		    Escribir.close();
		    
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}
