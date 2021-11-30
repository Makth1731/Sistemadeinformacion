package co.edu.unbosque.model.persistence;

import co.edu.unbosque.model.Clientes;
import co.edu.unbosque.model.Productos;

import java.io.*;
import java.util.ArrayList;

public class BinariosFile {

    private ObjectInputStream entrada;

    private ObjectOutputStream salida;

    public void BinariosFileC(File fileClientes) {
        if (!fileClientes.exists()) {
            try {
                fileClientes.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void BinariosFileP(File fileProveedores) {
        if (!fileProveedores.exists()) {
            try {
            	fileProveedores.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void escribirArchivoCliente(ArrayList<Clientes> array, File file) {
        try {
            salida = new ObjectOutputStream(new FileOutputStream(file));
            salida.writeObject(array);
            salida.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public ArrayList<Clientes> leerArchivoClientes(File file) {
        ArrayList<Clientes> array = new ArrayList<>();
        if (file.length() != 0) {
            try {
                entrada = new ObjectInputStream(new FileInputStream(file));
                array = (ArrayList<Clientes>) entrada.readObject();
                entrada.close();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return array;
    }


public void escribirArchivoProducto(ArrayList<Productos> array, File file) {
    try {
        salida = new ObjectOutputStream(new FileOutputStream(file));
        salida.writeObject(array);
        salida.close();
    } catch (IOException e) {
        e.printStackTrace();

    }
}

public ArrayList<Productos> leerArchivoProductos(File file) {
    ArrayList<Productos> array = new ArrayList<>();
    if (file.length() != 0) {
        try {
            entrada = new ObjectInputStream(new FileInputStream(file));
            array = (ArrayList<Productos>) entrada.readObject();
            entrada.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    return array;
}
}
