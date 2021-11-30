package co.edu.unbosque.model.persistence;

import co.edu.unbosque.model.Clientes;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class DaoClientes {

    private final BinariosFile binariosFile;

    public DaoClientes(BinariosFile binariosFile) {
        this.binariosFile = binariosFile;
    }

    public boolean agregarCliente(ArrayList<Clientes> arrayClientes, File file, String cedula, String nombre, String direccion, long telefono, String correo) {
        Clientes cliente = new Clientes(cedula, nombre, direccion, telefono, correo);

        if (buscarCliente(arrayClientes, cedula) == null) {
            arrayClientes.add(cliente);
            binariosFile.escribirArchivoCliente(arrayClientes, file);
            return true;
        } else {
            return false;
        }
    }

    public Clientes buscarCliente(ArrayList<Clientes> arrayClientes, String cedula) {
        Clientes clienteEncontrado = null;

        if (!arrayClientes.isEmpty()) {
            for (Clientes cliente : arrayClientes) {
                if (cliente.getCedula().equals(cedula)) {
                    clienteEncontrado = cliente;
                }
            }
        }
        return clienteEncontrado;
    }

    public boolean eliminarCliente(ArrayList<Clientes> arrayClientes, File file, String cedula) {
        try {
            Clientes cliente = buscarCliente(arrayClientes, cedula);

            if (cliente == null) {
                return false;
            } else {
                arrayClientes.remove(cliente);
                file.delete();
                file.createNewFile();
                binariosFile.escribirArchivoCliente(arrayClientes, file);
                return true;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean modificarCliente(ArrayList<Clientes> arrayClientes, File file, String cedula, String nombre, String direccion, long telefono, String correo) {
        try {
            Clientes cliente = buscarCliente(arrayClientes, cedula);

            if (cliente != null) {
                eliminarCliente(arrayClientes, file, cedula);
                cliente.setNombre(nombre);
                cliente.setDireccion(direccion);
                cliente.setTelefono(telefono);
                cliente.setCorreo(correo);
                arrayClientes.add(cliente);
                file.delete();
                file.createNewFile();
                binariosFile.escribirArchivoCliente(arrayClientes, file);
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
