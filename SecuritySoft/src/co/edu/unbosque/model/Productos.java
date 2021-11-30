package co.edu.unbosque.model;

import java.io.Serializable;

public class Productos implements Serializable {

    private String nombreProducto;

    private int nitProveedor;

    private long precioCompra;

    private long precioVenta;

    public Productos(String nombreProducto, int nitProveedor, long precioCompra, long precioVenta) {
        this.nombreProducto = nombreProducto;
        this.nitProveedor = nitProveedor;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getNitProveedor() {
        return nitProveedor;
    }

    public void setNitProveedor(int nitProveedor) {
        this.nitProveedor = nitProveedor;
    }

    public long getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(long precioCompra) {
        this.precioCompra = precioCompra;
    }

    public long getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(long precioVenta) {
        this.precioVenta = precioVenta;
    }
}
