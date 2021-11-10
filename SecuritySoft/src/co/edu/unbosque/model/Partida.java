package co.edu.unbosque.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import co.edu.unbosque.model.persistence.Lpartida;


public class Partida {
	
	File Archivo;
	
	public void crearArchivoDatosP() {
		try {
			Archivo = new File ("Datos de la partida" );
			if (Archivo.createNewFile()) {
				JOptionPane.showMessageDialog(null, "Archivo Creado");
				
			}
		}catch(IOException e) {
			System.out.println(e);
			
		}
	}
	public void EscribirArchivo (Lpartida Lpartida) {
		try {
			FileWriter Escribir = new FileWriter (Archivo, true);
			Escribir.write(Lpartida.getTipoPar() + "%" + Lpartida.getJugador1() + "%" + Lpartida.getJugador2() + "%" + Lpartida.getPuntaje1() + "%" + Lpartida.getPuntaje2() ); 
		    Escribir.close();
		    
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}