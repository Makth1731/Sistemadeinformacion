package co.edu.unbosque.model;

import java.io.Serializable;

public class Clientes implements Serializable {

    private String cedula;

    private String nombre;

    private String direccion;

    private long telefono;

    private String correo;

    public Clientes(String cedula, String nombre, String direccion, long telefono, String correo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Clientes{" +
                "Cedula='" + cedula + '\'' +
                ", Nombre='" + nombre + '\'' +
                ", Dirreción='" + direccion + '\'' +
                ", Telefono=" + telefono +
                ", Correo='" + correo + '\'' +
                '}';
    }
}
