package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import co.edu.unbosque.model.Proveedores;

public class DaoProveedores {
	
	private BinariosFile binariosFile;
	
	 public DaoProveedores(BinariosFile binariosFile) {
	        this.binariosFile = binariosFile;
	    }

	    public boolean agregarProveedor(ArrayList<Proveedores> arrayProveedores, File file, String nit, String nombre, String direccion, long telefono, String ciudad) {
	        Proveedores proveedores = new Proveedores(nit, nombre, direccion, telefono, ciudad);

	        if (buscarProveedores(arrayProveedores, nit) == null) {
	            arrayProveedores.add(proveedores);
	            binariosFile.escribirArchivoProveedores(arrayProveedores, file);
	            return true;
	        } else {
	            return false;
	        }
	    }

	    public Proveedores buscarProveedores(ArrayList<Proveedores> arrayProveedores, String nit) {
	    	Proveedores proveedorEncontrado = null;

	        if (!arrayProveedores.isEmpty()) {
	            for (Proveedores proveedores : arrayProveedores) {
	                if (proveedores.getNit().equals(nit)) {
	                	proveedorEncontrado = proveedores;
	                }
	            }
	        }
	        return proveedorEncontrado;
	    }

	    public boolean eliminarProveedores(ArrayList<Proveedores> arrayProveedores, File file, String nit) {
	        try {
	        	Proveedores proveedores = buscarProveedores(arrayProveedores, nit);

	            if (proveedores == null) {
	                return false;
	            } else {
	            	arrayProveedores.remove(proveedores);
	                file.delete();
	                file.createNewFile();
	                binariosFile.escribirArchivoProveedores(arrayProveedores, file);
	                return true;
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	            return false;
	        }
	    }

	    public boolean modificarProveedores(ArrayList<Proveedores> arrayProveedores, File file, String nit, String nombre, String direccion, long telefono, String ciudad) {
	        try {
	        	Proveedores proveedores = buscarProveedores(arrayProveedores, nit);

	            if (proveedores != null) {
	                eliminarProveedores(arrayProveedores, file, nit);
	                proveedores.setNombre(nombre);
	                proveedores.setDireccion(direccion);
	                proveedores.setTelefono(telefono);
	                proveedores.setCiudad(ciudad);
	                arrayProveedores.add(proveedores);
	                file.delete();
	                file.createNewFile();
	                binariosFile.escribirArchivoProveedores(arrayProveedores, file);
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

