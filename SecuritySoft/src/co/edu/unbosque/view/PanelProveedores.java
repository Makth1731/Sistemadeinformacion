package co.edu.unbosque.view;

import javax.swing.JPanel;

public class PanelProveedores extends JPanel {

    private PanelAgregarProveedores panelAgregarProveedores;

    private PanelAgregarProveedores panelModificarProveedores;

    public PanelProveedores() {
        setLayout(null);
        componentes();
        setVisible(true);
    }

    public void componentes() {
        panelAgregarProveedores = new PanelAgregarProveedores(false, "AGREGAR");
        panelAgregarProveedores.setBounds(0,0,300,400);
        add(panelAgregarProveedores);

        panelModificarProveedores = new PanelAgregarProveedores(true, "MODIFICAR");
        panelModificarProveedores.setBounds(0,0,300,300);
        add(panelModificarProveedores);
    }

    public PanelAgregarProveedores getPanelAgregarProveedores() {
        return panelAgregarProveedores;
    }

    public void setPanelAgregarProveedores(PanelAgregarProveedores panelAgregarProveedores) {
        this.panelAgregarProveedores = panelAgregarProveedores;
    }

    public PanelAgregarProveedores getPanelModificarProveedores() {
        return panelModificarProveedores;
    }

    public void setPanelModificarProveedores(PanelAgregarProveedores panelModificarProveedores) {
        this.panelModificarProveedores = panelModificarProveedores;
    }


}
