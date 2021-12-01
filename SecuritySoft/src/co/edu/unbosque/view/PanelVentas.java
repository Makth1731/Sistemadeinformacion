package co.edu.unbosque.view;

import javax.swing.JPanel;

public class PanelVentas extends JPanel {
	 private PanelMostrarVentas panelMostrarVenta;

	   private PanelMostrarVentas panelModificarVenta;

	    public PanelVentas() {
	        setLayout(null);
	        componentes();
	        setVisible(true);
	    }

	    public void componentes() {
	    	panelMostrarVenta = new PanelMostrarVentas(false, "AGREGAR");
	    	panelMostrarVenta.setBounds(0,0,300,400);
	        add(panelMostrarVenta);

	        panelModificarVenta = new PanelMostrarVentas(true, "MODIFICAR");
	        panelModificarVenta.setBounds(0,0,300,300);
	        add(panelModificarVenta);
	    }

		public PanelMostrarVentas getPanelMostrarVenta() {
			return panelMostrarVenta;
		}

		public void setPanelMostrarVenta(PanelMostrarVentas panelMostrarVenta) {
			this.panelMostrarVenta = panelMostrarVenta;
		}

		public PanelMostrarVentas getPanelModificarVenta() {
			return panelModificarVenta;
		}

		public void setPanelModificarVenta(PanelMostrarVentas panelModificarVenta) {
			this.panelModificarVenta = panelModificarVenta;
		}
	    
}
