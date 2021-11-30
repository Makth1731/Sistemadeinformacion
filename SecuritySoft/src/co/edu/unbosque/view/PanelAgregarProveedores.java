package co.edu.unbosque.view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelAgregarProveedores extends JPanel{

	 private JLabel labelAux;

	    private JTextField nitField;

	    private JComboBox<String> nitComboBox;

	    private JTextField nombreField;

	    private JTextField direccionField;

	    private JTextField telefonoField;

	    private JTextField ciudadField;

	    private JButton aceptarBoton;

	    private String comando;

	    private boolean edicion;

	    public PanelAgregarProveedores(boolean edicion, String comando) {
	        this.edicion = edicion;
	        this.comando = comando;
	        setLayout(null);
	        componentes();
	        setVisible(false);
	    }

	    public void componentes() {
	        labelAux = new JLabel("NIT: ");
	        labelAux.setBounds(0,0,100,20);
	        add(labelAux);

	        if (edicion) {
	            nitComboBox = new JComboBox<>();
	            nitComboBox.setBounds(110,0,100,20);
	            nitComboBox.setActionCommand("PROVEEDORMODIFICARCOMBO");
	            add(nitComboBox);
	        } else {
	            nitField = new JTextField();
	            nitField.setBounds(110, 0, 100, 20);
	            add(nitField);
	        }

	        labelAux = new JLabel("Nombre: ");
	        labelAux.setBounds(0,30,100,20);
	        add(labelAux);

	        nombreField = new JTextField();
	        nombreField.setBounds(110,30,100,20);
	        add(nombreField);

	        labelAux = new JLabel("Direcci�n: ");
	        labelAux.setBounds(0,60,100,20);
	        add(labelAux);

	        direccionField = new JTextField();
	        direccionField.setBounds(110,60,100,20);
	        add(direccionField);

	        labelAux = new JLabel("Tel�fono: ");
	        labelAux.setBounds(0,90,100,20);
	        add(labelAux);

	        telefonoField = new JTextField();
	        telefonoField.setBounds(110,90,100,20);
	        add(telefonoField);

	        labelAux = new JLabel("Ciudad: ");
	        labelAux.setBounds(0,120,100,20);
	        add(labelAux);

	        ciudadField = new JTextField();
	        ciudadField.setBounds(110,120,100,20);
	        add(ciudadField);

	        aceptarBoton = new JButton("Aceptar");
	        aceptarBoton.setBounds(0,130,100,20);
	        aceptarBoton.setActionCommand("PROVEEDORESACEPTAR" + comando);
	        add(aceptarBoton);
	    }

		public JLabel getLabelAux() {
			return labelAux;
		}

		public void setLabelAux(JLabel labelAux) {
			this.labelAux = labelAux;
		}

		public JTextField getNitField() {
			return nitField;
		}

		public void setNitField(JTextField nitField) {
			this.nitField = nitField;
		}

		public JComboBox<String> getNitComboBox() {
			return nitComboBox;
		}

		public void setNitComboBox(JComboBox<String> nitComboBox) {
			this.nitComboBox = nitComboBox;
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

		public JTextField getCiudadField() {
			return ciudadField;
		}

		public void setCiudadField(JTextField ciudadField) {
			this.ciudadField = ciudadField;
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


