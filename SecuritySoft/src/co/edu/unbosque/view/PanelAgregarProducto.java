package co.edu.unbosque.view;

import javax.swing.*;

public class PanelAgregarProducto extends JPanel {
	
	private JLabel labelAux;

    private JTextField nombreProductoField;

    private JComboBox<String> nombreProductoComboBox;

    private JTextField nitProveedorField;

    private JTextField precioCompraField;

    private JTextField precioVentaField;

    private JButton aceptarBoton;

    private String comando;

    private boolean edicion;
    
    public PanelAgregarProducto(boolean edicion, String comando) {
        this.edicion = edicion;
        this.comando = comando;
        setLayout(null);
        componentes();
        setVisible(false);
}

	private void componentes() {
		labelAux = new JLabel("Nombre Producto: ");
        labelAux.setBounds(0,0,100,20);
        add(labelAux);

        if (edicion) {
        	nombreProductoComboBox = new JComboBox<>();
        	nombreProductoComboBox.setBounds(110,0,100,20);
        	nombreProductoComboBox.setActionCommand("PRODUCTOMODIFICARCOMBO");
            add(nombreProductoComboBox);
        } else {
        	nombreProductoField = new JTextField();
        	nombreProductoField.setBounds(110, 0, 100, 20);
            add(nombreProductoField);
        }

        labelAux = new JLabel("Nit Proveedor: ");
        labelAux.setBounds(0,30,100,20);
        add(labelAux);

        nitProveedorField = new JTextField();
        nitProveedorField.setBounds(110,30,100,20);
        add(nitProveedorField);

        labelAux = new JLabel("Precio Compra: ");
        labelAux.setBounds(0,60,100,20);
        add(labelAux);

        precioCompraField = new JTextField();
        precioCompraField.setBounds(110,60,100,20);
        add(precioCompraField);

        labelAux = new JLabel("Precio Venta: ");
        labelAux.setBounds(0,90,100,20);
        add(labelAux);

        precioVentaField = new JTextField();
        precioVentaField.setBounds(110,90,100,20);
        add(precioVentaField);



        aceptarBoton = new JButton("Aceptar");
        aceptarBoton.setBounds(0,130,100,20);
        aceptarBoton.setActionCommand("CLIENTESACEPTAR" + comando);
        add(aceptarBoton);
		
	}

	public JTextField getNombreProductoField() {
		return nombreProductoField;
	}

	public void setNombreProductoField(JTextField nombreProductoField) {
		this.nombreProductoField = nombreProductoField;
	}

	public JComboBox<String> getNombreProductoComboBox() {
		return nombreProductoComboBox;
	}

	public void setNombreProductoComboBox(JComboBox<String> nombreProductoComboBox) {
		this.nombreProductoComboBox = nombreProductoComboBox;
	}

	public JTextField getNitProveedorField() {
		return nitProveedorField;
	}

	public void setNitProveedorField(JTextField nitProveedorField) {
		this.nitProveedorField = nitProveedorField;
	}

	public JTextField getPrecioCompraField() {
		return precioCompraField;
	}

	public void setPrecioCompraField(JTextField precioCompraField) {
		this.precioCompraField = precioCompraField;
	}

	public JTextField getPrecioVentaField() {
		return precioVentaField;
	}

	public void setPrecioVentaField(JTextField precioVentaField) {
		this.precioVentaField = precioVentaField;
	}

	public JButton getAceptarBoton() {
		return aceptarBoton;
	}

	public void setAceptarBoton(JButton aceptarBoton) {
		this.aceptarBoton = aceptarBoton;
	}
	
	
}
