package co.edu.unbosque.view;

import javax.swing.*;

public class PanelCliente extends JPanel {

    private PanelAgregarCliente panelAgregarCliente;

    private PanelAgregarCliente panelModificarCliente;

    public PanelCliente() {
        setLayout(null);
        componentes();
        setVisible(true);
    }

    public void componentes() {
        panelAgregarCliente = new PanelAgregarCliente(false, "AGREGAR");
        panelAgregarCliente.setBounds(0,0,300,400);
        add(panelAgregarCliente);

        panelModificarCliente = new PanelAgregarCliente(true, "MODIFICAR");
        panelModificarCliente.setBounds(0,0,300,300);
        add(panelModificarCliente);
    }

    public PanelAgregarCliente getPanelAgregarCliente() {
        return panelAgregarCliente;
    }

    public void setPanelAgregarCliente(PanelAgregarCliente panelAgregarCliente) {
        this.panelAgregarCliente = panelAgregarCliente;
    }

    public PanelAgregarCliente getPanelModificarCliente() {
        return panelModificarCliente;
    }

    public void setPanelModificarCliente(PanelAgregarCliente panelModificarCliente) {
        this.panelModificarCliente = panelModificarCliente;
    }
}
