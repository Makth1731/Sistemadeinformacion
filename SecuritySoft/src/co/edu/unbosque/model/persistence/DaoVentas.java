package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import co.edu.unbosque.model.Ventas;

public class DaoVentas {		
		
		private BinariosFile binariosFile;
		
		    
		public DaoVentas(BinariosFile binariosFile) {
			this.binariosFile = binariosFile;
		}
		
		 public boolean agregarVenta(ArrayList<Ventas> arrayVentas, File file, String cedula, int codigoVentas, int codigoProductos, int validarProducto, double validarProducto2, double validarVenta ) {
			 Ventas ventas = new Ventas(cedula, codigoVentas, codigoProductos, validarProducto2, validarProducto, validarVenta);

		        if (buscarVenta(arrayVentas, cedula) == null) {
		        	arrayVentas.add(ventas);
		            binariosFile.escribirArchivoVentas(arrayVentas, file);
		            return true;
		        } else {
		            return false;
		        }
		    }

		    public Ventas buscarVenta(ArrayList<Ventas> arrayVentas, String cedula) {
		    	Ventas clienteEncontrado = null;

		        if (!arrayVentas.isEmpty()) {
		            for (Ventas ventas : arrayVentas) {
		                if (ventas.getCedula().equals(cedula)) {
		                    clienteEncontrado = ventas;
		                }
		            }
		        }
		        return clienteEncontrado;
		    }

		    public boolean eliminarVentas(ArrayList<Ventas> arrayVentas, File file, String cedula) {
		        try {
		        	Ventas ventas = buscarVenta(arrayVentas, cedula);

		            if (ventas == null) {
		                return false;
		            } else {
		            	arrayVentas.remove(ventas);
		                file.delete();
		                file.createNewFile();
		                binariosFile.escribirArchivoVentas(arrayVentas, file);
		                return true;
		            }
		        } catch (IOException e) {
		            e.printStackTrace();
		            return false;
		        }
		    }

		    public boolean modificarVentas(ArrayList<Ventas> arrayVentas, File file, String cedula, int codigoVentas, int codigoProductos, int cantidadVenta, double validarProducto, double validarVenta) {
		        try {
		        	Ventas ventas = buscarVenta(arrayVentas, cedula);

		            if (ventas != null) {
		                eliminarVentas(arrayVentas, file, cedula);
		                ventas.setCodigoVentas(codigoVentas);
		                ventas.setCodigoProductos(codigoProductos);
		                ventas.setCantidadVentas(cantidadVenta);
		                ventas.setValidarVentas(validarVenta);
		                ventas.setValidarProducto(validarProducto);
		                arrayVentas.add(ventas);
		                file.delete();
		                file.createNewFile();
		                binariosFile.escribirArchivoVentas(arrayVentas, file);
		                return true;
		            } else {
		                return false;
		            }
		        } catch (IOException e) {
		            e.printStackTrace();
		            return false;
		        }
		    }
		}
