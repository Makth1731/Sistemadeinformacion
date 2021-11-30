package co.edu.unbosque.view;

import javax.swing.*;

public class PanelProducto extends JPanel {
	
	 private PanelAgregarProducto panelAgregarProducto;

	   private PanelAgregarProducto panelModificarProducto;

	    public PanelProducto() {
	        setLayout(null);
	        componentes();
	        setVisible(true);
	    }

	    public void componentes() {
	        panelAgregarProducto = new PanelAgregarProducto(false, "AGREGAR");
	        panelAgregarProducto.setBounds(0,0,300,400);
	        add(panelAgregarProducto);

	        panelModificarProducto = new PanelAgregarProducto(true, "MODIFICAR");
	        panelModificarProducto.setBounds(0,0,300,300);
	        add(panelModificarProducto);
	    }

		public PanelAgregarProducto getPanelAgregarProducto() {
			return panelAgregarProducto;
		}

		public void setPanelAgregarProducto(PanelAgregarProducto panelAgregarProducto) {
			this.panelAgregarProducto = panelAgregarProducto;
		}

		public PanelAgregarProducto getPanelModificarProducto() {
			return panelModificarProducto;
		}

		public void setPanelModificarProducto(PanelAgregarProducto panelModificarProducto) {
			this.panelModificarProducto = panelModificarProducto;
		}

}