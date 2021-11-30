package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;

public class PanelModuloDao extends JPanel {

    private JButton agregarBoton;

    private JButton buscarBoton;

    private JButton modificarBoton;

    private JButton eliminarBoton;

    private JButton regresarBoton;

    private final String agregarTexto;

    private final String buscarTexto;

    private final String modificarTexto;

    private final String eliminarTexto;

    private final String comando;

    public PanelModuloDao(String agregarTexto, String buscarTexto, String modificarTexto, String eliminarTexto, String comando) {
        this.agregarTexto = agregarTexto;
        this.buscarTexto = buscarTexto;
        this.modificarTexto = modificarTexto;
        this.eliminarTexto = eliminarTexto;
        this.comando = comando;
        setLayout(new FlowLayout());
        componentes();
        setVisible(false);
    }

    public void componentes() {
        agregarBoton = new JButton(agregarTexto);
        agregarBoton.setActionCommand("AGREGAR" + comando.toUpperCase());
        add(agregarBoton);

        buscarBoton = new JButton(buscarTexto);
        buscarBoton.setActionCommand("BUSCAR" + comando.toUpperCase());
        add(buscarBoton);

        modificarBoton = new JButton(modificarTexto);
        modificarBoton.setActionCommand("MODIFICAR" + comando.toUpperCase());
        add(modificarBoton);

        eliminarBoton = new JButton(eliminarTexto);
        eliminarBoton.setActionCommand("ELIMINAR" + comando.toUpperCase());
        add(eliminarBoton);

        regresarBoton = new JButton("Regresar");
        regresarBoton.setActionCommand("REGRESAR" + comando.toUpperCase());
        add(regresarBoton);
    }

    public JButton getAgregarBoton() {
        return agregarBoton;
    }

    public void setAgregarBoton(JButton agregarBoton) {
        this.agregarBoton = agregarBoton;
    }

    public JButton getBuscarBoton() {
        return buscarBoton;
    }

    public void setBuscarBoton(JButton buscarBoton) {
        this.buscarBoton = buscarBoton;
    }

    public JButton getModificarBoton() {
        return modificarBoton;
    }

    public void setModificarBoton(JButton modificarBoton) {
        this.modificarBoton = modificarBoton;
    }

    public JButton getEliminarBoton() {
        return eliminarBoton;
    }

    public void setEliminarBoton(JButton eliminarBoton) {
        this.eliminarBoton = eliminarBoton;
    }

    public JButton getRegresarBoton() {
        return regresarBoton;
    }

    public void setRegresarBoton(JButton regresarBoton) {
        this.regresarBoton = regresarBoton;
    }
}
