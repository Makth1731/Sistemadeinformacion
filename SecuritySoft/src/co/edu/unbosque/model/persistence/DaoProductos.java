package co.edu.unbosque.model.persistence;



import co.edu.unbosque.model.Productos;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class DaoProductos {

private final BinariosFile binariosFile;

public DaoProductos(BinariosFile binariosFile) {
    this.binariosFile = binariosFile;
}

public boolean agregarCliente(ArrayList<Productos> arrayProductos, File file, String nombreProducto, int nitProveedor, long precioCompra, long precioVenta) {
    Productos producto = new Productos(nombreProducto, nitProveedor, precioCompra, precioVenta);

    if (buscarProducto(arrayProductos, nombreProducto) == null) {
        arrayProductos.add(producto);
        binariosFile.escribirArchivoProducto(arrayProductos, file);
        return true;
    } else {
        return false;
    }
}
public Productos buscarProducto(ArrayList<Productos> arrayProductos, String nombreProducto) {
    Productos productoEncontrado = null;

    if (!arrayProductos.isEmpty()) {
        for (Productos producto : arrayProductos) {
            if (producto.getNombreProducto().equals(nombreProducto)) {
                productoEncontrado = producto;
            }
        }
    }
    return productoEncontrado;

}

public boolean eliminarProducto(ArrayList<Productos> arrayProductos, File file, String nombreProducto) {
    try {
        Productos producto = buscarProducto(arrayProductos, nombreProducto);

        if (producto == null) {
            return false;
        } else {
            arrayProductos.remove(producto);
            file.delete();
            file.createNewFile();
            binariosFile.escribirArchivoProducto(arrayProductos, file);
            return true;
        }
    } catch (IOException e) {
        e.printStackTrace();
        return false;
    }
}


public boolean modificarProducto(ArrayList<Productos> arrayProductos, File file, String nombreProducto, int nitProveedor, long precioCompra, long precioVenta) {
    try {
        Productos producto = buscarProducto(arrayProductos, nombreProducto);

        if (nombreProducto != null) {
            eliminarProducto(arrayProductos, file, nombreProducto);
            producto.setNitProveedor(nitProveedor);
            producto.setPrecioCompra(precioCompra);
            producto.setPrecioVenta(precioVenta);
            arrayProductos.add(producto);
            file.delete();
            file.createNewFile();
            binariosFile.escribirArchivoProducto(arrayProductos, file);
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