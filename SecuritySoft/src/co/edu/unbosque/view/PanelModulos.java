package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;

public class PanelModulos extends JPanel {

    private JButton moduloClientes;

    private JButton moduloProductos;

    private JButton moduloProveedores;
    
    private JButton moduloVentas;
    
    private JButton moduloConsultas;
    
    public PanelModulos() {
        setLayout(new FlowLayout());
        
        componentes();
        setVisible(true);
    }
   

    public void componentes() {
        moduloClientes = new JButton("Modulo Clientes");
        moduloClientes.setActionCommand("MODULOCLIENTES");
        add(moduloClientes);

        moduloProductos = new JButton("Modulo Productos");
        moduloProductos.setActionCommand("MODULOPRODUCTOS");
        add(moduloProductos);

        moduloProveedores = new JButton("Modulo Proveedores");
        moduloProveedores.setActionCommand("MODULOPROVEEDORES");
        add(moduloProveedores);
        
        moduloVentas = new JButton("Modulo Ventas");
        moduloVentas.setActionCommand("MODULOVENTAS");
        add(moduloVentas);
        
        moduloConsultas = new JButton("Modulo Consultas");
        moduloConsultas.setActionCommand("MODULOCONSULTAS");
        add(moduloConsultas);
    }

    public JButton getModuloClientes() {
        return moduloClientes;
    }

    public JButton getModuloProductos() {
        return moduloProductos;
    }

    public JButton getModuloProveedores() {
        return moduloProveedores;
    }

	public JButton getModuloVentas() {
		return moduloVentas;
	}

	public void setModuloVentas(JButton moduloVentas) {
		this.moduloVentas = moduloVentas;
	}

	public void setModuloProveedores(JButton moduloProveedores) {
		this.moduloProveedores = moduloProveedores;
	}
    
}
