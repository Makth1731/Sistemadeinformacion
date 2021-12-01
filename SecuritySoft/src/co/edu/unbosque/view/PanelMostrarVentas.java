package co.edu.unbosque.view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PanelMostrarVentas extends JPanel{
	  private JLabel labelAux;

	    private JTextField cedulaField;

	    private JComboBox<String> cedulaComboBox;

	    private JTextField nombreField;

	    private JTextField direccionField;

	    private JTextField telefonoField;

	    private JTextField correoField;

	    private JButton aceptarBoton;

	    private String comando;

	    private boolean edicion;

	    public PanelMostrarVentas(boolean edicion, String comando) {
	        this.edicion = edicion;
	        this.comando = comando;
	        setLayout(null);
	        componentes();
	        setVisible(false);
	    }

	    public void componentes() {
	        labelAux = new JLabel("Cedula: ");
	        labelAux.setBounds(0,0,100,20);
	        add(labelAux);

	        if (edicion) {
	            cedulaComboBox = new JComboBox<>();
	            cedulaComboBox.setBounds(110,0,100,20);
	            cedulaComboBox.setActionCommand("VENTAMODIFICARCOMBO");
	            add(cedulaComboBox);
	        } else {
	            cedulaField = new JTextField();
	            cedulaField.setBounds(110, 0, 100, 20);
	            add(cedulaField);
	        }

	        labelAux = new JLabel("codigoVentas: ");
	        labelAux.setBounds(0,30,100,20);
	        add(labelAux);

	        nombreField = new JTextField();
	        nombreField.setBounds(110,30,100,20);
	        add(nombreField);

	        labelAux = new JLabel("codigoProductos: ");
	        labelAux.setBounds(0,60,100,20);
	        add(labelAux);

	        direccionField = new JTextField();
	        direccionField.setBounds(110,60,100,20);
	        add(direccionField);

	        labelAux = new JLabel("validarProducto: ");
	        labelAux.setBounds(0,90,100,20);
	        add(labelAux);

	        telefonoField = new JTextField();
	        telefonoField.setBounds(110,90,100,20);
	        add(telefonoField);
	        
	        labelAux = new JLabel("cantidadVentas: ");
	        labelAux.setBounds(0,90,100,20);
	        add(labelAux);

	        telefonoField = new JTextField();
	        telefonoField.setBounds(110,90,100,20);
	        add(telefonoField);

	        labelAux = new JLabel("validarVentas: ");
	        labelAux.setBounds(0,120,100,20);
	        add(labelAux);

	        correoField = new JTextField();
	        correoField.setBounds(110,120,100,20);
	        add(correoField);

	        aceptarBoton = new JButton("Aceptar");
	        aceptarBoton.setBounds(0,130,100,20);
	        aceptarBoton.setActionCommand("VENTASACEPTAR" + comando);
	        add(aceptarBoton);
	    }

		public JLabel getLabelAux() {
			return labelAux;
		}

		public void setLabelAux(JLabel labelAux) {
			this.labelAux = labelAux;
		}

		public JTextField getCedulaField() {
			return cedulaField;
		}

		public void setCedulaField(JTextField cedulaField) {
			this.cedulaField = cedulaField;
		}

		public JComboBox<String> getCedulaComboBox() {
			return cedulaComboBox;
		}

		public void setCedulaComboBox(JComboBox<String> cedulaComboBox) {
			this.cedulaComboBox = cedulaComboBox;
		}

		public JTextField getNombreField() {
			return nombreField;
		}

		public void setNombreField(JTextField nombreField) {
			this.nombreField = nombreField;
		}

		public JTextField getDireccionField() {
			return direccionField;
		}

		public void setDireccionField(JTextField direccionField) {
			this.direccionField = direccionField;
		}

		public JTextField getTelefonoField() {
			return telefonoField;
		}

		public void setTelefonoField(JTextField telefonoField) {
			this.telefonoField = telefonoField;
		}

		public JTextField getCorreoField() {
			return correoField;
		}

		public void setCorreoField(JTextField correoField) {
			this.correoField = correoField;
		}

		public JButton getAceptarBoton() {
			return aceptarBoton;
		}

		public void setAceptarBoton(JButton aceptarBoton) {
			this.aceptarBoton = aceptarBoton;
		}

		public String getComando() {
			return comando;
		}

		public void setComando(String comando) {
			this.comando = comando;
		}

		public boolean isEdicion() {
			return edicion;
		}

		public void setEdicion(boolean edicion) {
			this.edicion = edicion;
		}
	    
}
