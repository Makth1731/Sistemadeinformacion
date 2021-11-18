package co.edu.unbosque.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import co.edu.unbosque.model.persistence.Ljuego;
import co.edu.unbosque.model.persistence.Ljugador;
import co.edu.unbosque.model.persistence.Lpartida;

public class BinarioFile {

		private String rjuego = ".data/Juego.dat";
		private String rpartida = ".data/Partida.dat";
		private String rjugador = ".data/Jugador.dat";
		private Lpartida  p;
		private Ljugador  j;
		private Ljuego  jg;
		private File f;	
		
		public String escribirJuego() {
			String mensaje = "Archivo generado gg";
			f = new File(rjuego);
			Juego stream = new Juego ();
			try {
				ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));
				out.writeObject(stream);
				out.close();
			}
			catch(FileNotFoundException e) {
				mensaje = "No hay archivos f";
			}
			catch(IOException e) {
				mensaje = "No pai, error...";
			}
			return mensaje;
			
		}
		public String leerJuego (String i) {
			f = new File (rjuego);
			String mensaje = "";
			try {
				ObjectInputStream in  = new ObjectInputStream(new FileInputStream(f));
				jg = (Ljuego) in.readObject();
				if (i.equals("LEER")) {
					mensaje = jg.getJuego1();
				}
				in.close();			
				}
			catch(ClassNotFoundException e){
				mensaje = "No hay clase, F...";
				
			}
			catch(IOException e){
				e.printStackTrace();
				mensaje = "Hay error";
			}
			return mensaje;
		}
		
		public String escribirPartida() {
			String mensaje = "Archivo generado gg";
			f = new File(rpartida);
			Partida stream = new Partida ();
			try {
				ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));
				out.writeObject(stream);
				out.close();
			}
			catch(FileNotFoundException e) {
				mensaje = "No hay archivos f";
			}
			catch(IOException e) {
				mensaje = "No pai, error...";
			}
			return mensaje;
			
		}
		public String leerPartida (String i) {
			f = new File (rpartida);
			String mensaje = "";
			try {
				ObjectInputStream in  = new ObjectInputStream(new FileInputStream(f));
				p = (Lpartida) in.readObject();
				if (i.equals("LEER")) {
					mensaje = p.getTipoPar();
				}
				in.close();			
				}
			catch(ClassNotFoundException e){
				mensaje = "No hay clase, F...";
				
			}
			catch(IOException e){
				e.printStackTrace();
				mensaje = "Hay error";
			}
			return mensaje;
		}
		
		public String escribirJugador() {
			String mensaje = "Archivo generado gg";
			f = new File(rjugador);
			Jugador stream = new Jugador ();
			try {
				ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));
				out.writeObject(stream);
				out.close();
			}
			catch(FileNotFoundException e) {
				mensaje = "No hay archivos f";
			}
			catch(IOException e) {
				mensaje = "No pai, error...";
			}
			return mensaje;
			
		}
		public String leerJugador(String i) {
			f = new File (rjugador);
			String mensaje = "";
			try {
				ObjectInputStream in  = new ObjectInputStream(new FileInputStream(f));
				j = (Ljugador) in.readObject();
				if (i.equals("LEER")) {
					mensaje = j.getNombre1();
				}
				in.close();			
				}
			catch(ClassNotFoundException e){
				mensaje = "No hay clase, F...";
				
			}
			catch(IOException e){
				e.printStackTrace();
				mensaje = "Hay error";
			}
			return mensaje;
		}
		public String getRjuego() {
			return rjuego;
		}
		public void setRjuego(String rjuego) {
			this.rjuego = rjuego;
		}
		public String getRpartida() {
			return rpartida;
		}
		public void setRpartida(String rpartida) {
			this.rpartida = rpartida;
		}
		public String getRjugador() {
			return rjugador;
		}
		public void setRjugador(String rjugador) {
			this.rjugador = rjugador;
		}
		public Lpartida getP() {
			return p;
		}
		public void setP(Lpartida p) {
			this.p = p;
		}
		public Ljugador getJ() {
			return j;
		}
		public void setJ(Ljugador j) {
			this.j = j;
		}
		public Ljuego getJg() {
			return jg;
		}
		public void setJg(Ljuego jg) {
			this.jg = jg;
		}
		public File getF() {
			return f;
		}
		public void setF(File f) {
			this.f = f;
		}
	
}
