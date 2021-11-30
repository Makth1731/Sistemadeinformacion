package co.edu.unbosque.model;

import java.io.Serializable;

public class Proveedores implements Serializable {

    private String nit;

    private String nombre;

    private String direccion;

    private long telefono;

    private String ciudad;

    public Proveedores(String nit, String nombre, String direccion, long telefono, String ciudad) {
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.ciudad = ciudad;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

@Override
public String toString() {
    return "Proveedores{" +
            "NIT='" + nit + '\'' +
            ", nombre='" + nombre + '\'' +
            ", direccion='" + direccion + '\'' +
            ", telefono=" + telefono +
            ", ciudad='" + ciudad + '\'' +
            '}';
}
}
