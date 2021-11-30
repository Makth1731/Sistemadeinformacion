package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.BinariosFile;
import co.edu.unbosque.model.persistence.DaoClientes;
import co.edu.unbosque.model.persistence.DaoProductos;

import java.io.File;
import java.util.ArrayList;

public class Dto {

    private ArrayList<Clientes> arrayClientes;

    private DaoClientes daoClientes;

    private File fileClientes;

    private BinariosFile binariosFile;
    
    private ArrayList<Productos> arrayProductos;
    
    private DaoProductos daoProductos;
    
    private File fileProductos;
    

    public Dto() {
        fileClientes = new File("data/clientes.out");
        arrayClientes = new ArrayList<>();
        binariosFile = new BinariosFile(fileClientes);
        daoClientes = new DaoClientes(binariosFile);
        arrayClientes = binariosFile.leerArchivoClientes(fileClientes);
        fileProductos = new File("data/productos.out");
        arrayProductos = new ArrayList<>();
        daoProductos = new DaoProductos(binariosFile);
        arrayProductos = binariosFile.leerArchivoProductos(fileProductos);
    }

    public ArrayList<Clientes> getArrayClientes() {
        return arrayClientes;
    }

    public void setArrayClientes(ArrayList<Clientes> arrayClientes) {
        this.arrayClientes = arrayClientes;
    }

    public DaoClientes getDaoClientes() {
        return daoClientes;
    }

    public void setDaoClientes(DaoClientes daoClientes) {
        this.daoClientes = daoClientes;
    }

    public File getFileClientes() {
        return fileClientes;
    }

    public void setFileClientes(File fileClientes) {
        this.fileClientes = fileClientes;
    }

    public BinariosFile getBinariosFile() {
        return binariosFile;
    }

    public void setBinariosFile(BinariosFile binariosFile) {
        this.binariosFile = binariosFile;
    }

	public ArrayList<Productos> getArrayProductos() {
		return arrayProductos;
	}

	public void setArrayProductos(ArrayList<Productos> arrayProductos) {
		this.arrayProductos = arrayProductos;
	}

	public DaoProductos getDaoProductos() {
		return daoProductos;
	}

	public void setDaoProductos(DaoProductos daoProductos) {
		this.daoProductos = daoProductos;
	}

	public File getFileProductos() {
		return fileProductos;
	}

	public void setFileProductos(File fileProductos) {
		this.fileProductos = fileProductos;
	}
    
    
}
