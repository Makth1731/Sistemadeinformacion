package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;

public class Vista extends JFrame {

    private PanelModulos panelModulos;

    private PanelModuloDao clientesModuloDao;

    private PanelModuloDao productosModuloDao;

    private PanelModuloDao proveedoresModuloDao;

    private PanelCliente panelCliente;

    private PanelProveedores panelProveedores;
    
    private PanelProducto panelProducto;

    public Vista() {
        setTitle("Tienda generica");
        setSize(800,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setLocationRelativeTo(null);
        componentes();
        setResizable(false);
        setVisible(true);
    }

    public void componentes() {
        panelModulos = new PanelModulos();
        panelModulos.setBounds(0,0,800,80);
        getContentPane().add(panelModulos);

        clientesModuloDao = new PanelModuloDao("Agregar cliente", "Buscar cliente", "Modificar cliente", "Eliminar cliente", "CLIENTE");
        clientesModuloDao.setBounds(0,0,800,80);
        getContentPane().add(clientesModuloDao);

        productosModuloDao = new PanelModuloDao("Agregar producto", "Buscar producto", "Modificar producto", "Eliminar producto", "PRODUCTO");
        productosModuloDao.setBounds(0,0,800,80);
        getContentPane().add(productosModuloDao);

        proveedoresModuloDao = new PanelModuloDao("Agregar proveedor", "Buscar proveedor", "Modificar proveedor", "Eliminar proveedor", "PROVEEDOR");
        proveedoresModuloDao.setBounds(0,0,800,80);
        getContentPane().add(proveedoresModuloDao);

        panelCliente = new PanelCliente();
        panelCliente.setBounds(0,100,800,200);
        getContentPane().add(panelCliente);

        panelProveedores = new PanelProveedores();
        panelProveedores.setBounds(0,100,800,200);
        getContentPane().add(panelProveedores);
        
        panelProducto = new PanelProducto();
        panelProducto.setBounds(0,100,800,200);
        getContentPane().add(panelProducto);
    }

    public void info(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Tienda generica", JOptionPane.INFORMATION_MESSAGE);
    }

    public String datoString(String mensaje) {
        return JOptionPane.showInputDialog(null, mensaje, "Tienda generica", JOptionPane.INFORMATION_MESSAGE);
    }

    public PanelModulos getPanelModulos() {
        return panelModulos;
    }

    public void setPanelModulos(PanelModulos panelModulos) {
        this.panelModulos = panelModulos;
    }

    public PanelModuloDao getClientesModuloDao() {
        return clientesModuloDao;
    }

    public void setClientesModuloDao(PanelModuloDao clientesModuloDao) {
        this.clientesModuloDao = clientesModuloDao;
    }

    public PanelModuloDao getProductosModuloDao() {
        return productosModuloDao;
    }

    public void setProductosModuloDao(PanelModuloDao productosModuloDao) {
        this.productosModuloDao = productosModuloDao;
    }

    public PanelModuloDao getProveedoresModuloDao() {
        return proveedoresModuloDao;
    }

    public void setProveedoresModuloDao(PanelModuloDao proveedoresModuloDao) {
        this.proveedoresModuloDao = proveedoresModuloDao;
    }

    public PanelCliente getPanelCliente() {
        return panelCliente;
    }

    public void setPanelCliente(PanelCliente panelCliente) {
        this.panelCliente = panelCliente;
    }

    public PanelProveedores getPanelProveedores() {
        return panelProveedores;
    }

    public void setPanelProveedores(PanelProveedores panelProveedores) {
        this.panelProveedores = panelProveedores;
    }

	public PanelProducto getPanelProducto() {
		return panelProducto;
	}

	public void setPanelProducto(PanelProducto panelProducto) {
		this.panelProducto = panelProducto;
	}
    

}
