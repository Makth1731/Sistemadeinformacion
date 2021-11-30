package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.BinariosFile;
import co.edu.unbosque.model.persistence.DaoClientes;

import java.io.File;
import java.util.ArrayList;

public class Dto {

    private ArrayList<Clientes> arrayClientes;

    private DaoClientes daoClientes;

    private File fileClientes;

    private BinariosFile binariosFile;

    public Dto() {
        fileClientes = new File("data/clientes.out");
        arrayClientes = new ArrayList<>();
        binariosFile = new BinariosFile(fileClientes);
        daoClientes = new DaoClientes(binariosFile);
        arrayClientes = binariosFile.leerArchivoClientes(fileClientes);
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
}
