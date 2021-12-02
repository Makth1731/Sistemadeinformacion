package co.edu.unbosque.controller;

import co.edu.unbosque.model.Clientes;
import co.edu.unbosque.model.Dto;
import co.edu.unbosque.model.Productos;
import co.edu.unbosque.model.Proveedores;
import co.edu.unbosque.model.Ventas;
import co.edu.unbosque.view.Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

    private final Vista frame;

    private final Dto dto;

    public Controller() {
        frame = new Vista();
        dto = new Dto();
        oyentes();
    }

    public void oyentes() {
        frame.getPanelModulos().getModuloClientes().addActionListener(this);
        frame.getPanelModulos().getModuloProveedores().addActionListener(this);
        frame.getPanelModulos().getModuloProductos().addActionListener(this);

        frame.getProveedoresModuloDao().getAgregarBoton().addActionListener(this);
        frame.getProveedoresModuloDao().getBuscarBoton().addActionListener(this);
        frame.getProveedoresModuloDao().getModificarBoton().addActionListener(this);
        frame.getProveedoresModuloDao().getEliminarBoton().addActionListener(this);
        frame.getProveedoresModuloDao().getRegresarBoton().addActionListener(this);

        frame.getClientesModuloDao().getAgregarBoton().addActionListener(this);
        frame.getClientesModuloDao().getBuscarBoton().addActionListener(this);
        frame.getClientesModuloDao().getModificarBoton().addActionListener(this);
        frame.getClientesModuloDao().getEliminarBoton().addActionListener(this);
        frame.getClientesModuloDao().getRegresarBoton().addActionListener(this);

        frame.getProductosModuloDao().getAgregarBoton().addActionListener(this);
        frame.getProductosModuloDao().getBuscarBoton().addActionListener(this);
        frame.getProductosModuloDao().getModificarBoton().addActionListener(this);
        frame.getProductosModuloDao().getEliminarBoton().addActionListener(this);
        frame.getProductosModuloDao().getRegresarBoton().addActionListener(this);

        frame.getPanelCliente().getPanelAgregarCliente().getAceptarBoton().addActionListener(this);
        frame.getPanelCliente().getPanelModificarCliente().getAceptarBoton().addActionListener(this);
        frame.getPanelCliente().getPanelModificarCliente().getCedulaComboBox().addActionListener(this);
        
        frame.getPanelProveedores().getPanelAgregarProveedores().getAceptarBoton().addActionListener(this);
        frame.getPanelProveedores().getPanelModificarProveedores().getAceptarBoton().addActionListener(this);
        frame.getPanelProveedores().getPanelModificarProveedores().getNitComboBox().addActionListener(this);
        
        frame.getPanelProducto().getPanelAgregarProducto().getAceptarBoton().addActionListener(this);
        frame.getPanelProducto().getPanelModificarProducto().getAceptarBoton().addActionListener(this);
        frame.getPanelProducto().getPanelModificarProducto().getNombreProductoComboBox().addActionListener(this);
        
        frame.getPanelVentas().getPanelMostrarVenta().getAceptarBoton().addActionListener(this);
        frame.getPanelVentas().getPanelModificarVenta().getAceptarBoton().addActionListener(this);
        frame.getPanelVentas().getPanelModificarVenta().getCedulaComboBox().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        System.out.println(comando);

        String busqueda;
        String cedula;
        String nombre;
        String direccion;
        long telefono;
        String correo;
        String nit;
        String ciudad;
        String nombreProducto;
        String nitProveedor;
        long precioCompra;
        long precioVenta;
        int codigoVentas;
		int codigoProductos;
	    int cantidadVentas;
		double validarProducto;
	    double validarVentas;
        
        

        switch (comando) {
            case "MODULOCLIENTES":
                frame.getPanelModulos().setVisible(false);
                frame.getClientesModuloDao().setVisible(true);
                break;
            case "MODULOPRODUCTOS":
                frame.getPanelModulos().setVisible(false);
                frame.getProductosModuloDao().setVisible(true);
                break;
            case "MODULOPROVEEDORES":
                frame.getPanelModulos().setVisible(false);
                frame.getProveedoresModuloDao().setVisible(true);
                break;
            case "MODULOVENTAS":
                frame.getPanelModulos().setVisible(false);
                frame.getVentasModuloDao().setVisible(true);
                break;
            case "MODULOCONSULTAS":
                frame.getPanelModulos().setVisible(false);
                frame.getConsultasModuloDao().setVisible(true);
                break;
            case "AGREGARCLIENTE":
                frame.getPanelCliente().setVisible(true);
                frame.getPanelCliente().getPanelAgregarCliente().setVisible(true);
                frame.getPanelCliente().getPanelModificarCliente().setVisible(false);
                break;
            case "BUSCARCLIENTE":
                busqueda = frame.datoString("Ingrese la cédula del cliente que desea buscar: ");

                Clientes cliente = dto.getDaoClientes().buscarCliente(dto.getArrayClientes(), busqueda);

                if (cliente != null) {
                    frame.info(cliente.toString());
                } else {
                    frame.info("El cliente no existe.");
                }
                break;
            case "MODIFICARCLIENTE":
                frame.getPanelCliente().setVisible(true);
                frame.getPanelCliente().getPanelAgregarCliente().setVisible(false);
                frame.getPanelCliente().getPanelModificarCliente().setVisible(true);

                frame.getPanelCliente().getPanelModificarCliente().getCedulaComboBox().removeAllItems();
                for (Clientes clienteEncontrado : dto.getArrayClientes()) {
                    frame.getPanelCliente().getPanelModificarCliente().getCedulaComboBox().addItem(clienteEncontrado.getCedula());
                }
                break;
            case "ELIMINARCLIENTE":
                busqueda = frame.datoString("Ingrese la cédula del cliente que desea eliminar: ");

                if (dto.getDaoClientes().eliminarCliente(dto.getArrayClientes(), dto.getFileClientes(), busqueda)) {
                    frame.info("El cliente se eliminó correctamente.");
                } else {
                    frame.info("No se pudo eliminar al cliente. Posiblemente no existe.");
                }
                break;
            case "CLIENTESACEPTARAGREGAR":
                try {
                    cedula = frame.getPanelCliente().getPanelAgregarCliente().getCedulaField().getText();
                    nombre = frame.getPanelCliente().getPanelAgregarCliente().getNombreField().getText();
                    direccion = frame.getPanelCliente().getPanelAgregarCliente().getDireccionField().getText();
                    telefono = Long.parseLong(frame.getPanelCliente().getPanelAgregarCliente().getTelefonoField().getText());
                    correo = frame.getPanelCliente().getPanelAgregarCliente().getCorreoField().getText();

                    if (cedula.equals("") || nombre.equals("") || direccion.equals("") || String.valueOf(telefono).equals("") || correo.equals("")) {
                        frame.info("Llene todos los campos");
                    } else {
                        if (dto.getDaoClientes().agregarCliente(dto.getArrayClientes(), dto.getFileClientes(), cedula, nombre, direccion, telefono, correo)) {
                            frame.info("El cliente se agregó correctamente.");
                        } else {
                            frame.info("Ya existe un cliente con la misma cédula.");
                        }

                    }
                } catch (NumberFormatException ex) {
                    frame.info("Recuerde que la cédula y el teléfono deben contener únicamente números.");
                }
                break;
            case "CLIENTESACEPTARMODIFICAR":
                cedula = (String) frame.getPanelCliente().getPanelModificarCliente().getCedulaComboBox().getSelectedItem();
                nombre = frame.getPanelCliente().getPanelModificarCliente().getNombreField().getText();
                direccion = frame.getPanelCliente().getPanelModificarCliente().getDireccionField().getText();
                telefono = Long.parseLong(frame.getPanelCliente().getPanelModificarCliente().getTelefonoField().getText());
                correo = frame.getPanelCliente().getPanelModificarCliente().getCorreoField().getText();

                if (dto.getDaoClientes().modificarCliente(dto.getArrayClientes(), dto.getFileClientes(), cedula, nombre, direccion, telefono, correo)) {
                    frame.info("El cliente se modificó correctamente.");
                } else {
                    frame.info("El cliente ya se cambió.");
                }
                break;
            case "CLIENTEMODIFICARCOMBO":
                try {
                    String cedulaCombo = (String) frame.getPanelCliente().getPanelModificarCliente().getCedulaComboBox().getSelectedItem();

                    Clientes clientes = dto.getDaoClientes().buscarCliente(dto.getArrayClientes(), cedulaCombo);

                    frame.getPanelCliente().getPanelModificarCliente().getNombreField().setText(clientes.getNombre());
                    frame.getPanelCliente().getPanelModificarCliente().getDireccionField().setText(clientes.getDireccion());
                    frame.getPanelCliente().getPanelModificarCliente().getTelefonoField().setText(String.valueOf(clientes.getTelefono()));
                    frame.getPanelCliente().getPanelModificarCliente().getCorreoField().setText(clientes.getCorreo());
                } catch (NullPointerException ex) {
                    frame.getPanelCliente().getPanelModificarCliente().getNombreField().setText("");
                    frame.getPanelCliente().getPanelModificarCliente().getDireccionField().setText("");
                    frame.getPanelCliente().getPanelModificarCliente().getTelefonoField().setText("");
                    frame.getPanelCliente().getPanelModificarCliente().getCorreoField().setText("");
                }
                break;
            case "AGREGARPRODUCTO":
            	frame.getPanelProducto().setVisible(true);
            	frame.getPanelProducto().getPanelAgregarProducto().setVisible(true);
                frame.getPanelProducto().getPanelModificarProducto().setVisible(false);
                break;
            case "BUSCARPRODUCTO":
            	busqueda = frame.datoString("Ingrese el nombre del producto que desea buscar: ");

                Productos producto = dto.getDaoProductos().buscarProducto(dto.getArrayProductos(), busqueda);

                if (producto != null) {
                    frame.info(producto.toString());
                } else {
                    frame.info("El producto no existe.");
                }
                break;
            case "MODIFICARPRODUCTO":
            	frame.getPanelProducto().setVisible(true);
            	frame.getPanelProducto().getPanelAgregarProducto().setVisible(false);
                frame.getPanelProducto().getPanelModificarProducto().setVisible(true);

                frame.getPanelProducto().getPanelModificarProducto().getNombreProductoComboBox().removeAllItems();
                for (Productos productoEncontrado : dto.getArrayProductos()) {
                    frame.getPanelProducto().getPanelModificarProducto().getNombreProductoComboBox().addItem(productoEncontrado.getNombreProducto());
                }
                break;
            case "ELIMINARPRODUCTO":
            	busqueda = frame.datoString("Ingrese el nombre del producto que desea eliminar: ");

                if (dto.getDaoProductos().eliminarProducto(dto.getArrayProductos(), dto.getFileProductos(), busqueda)) {
                    frame.info("El producto se elimino correctamente.");
                } else {
                    frame.info("No se pudo eliminar el producto. Posiblemente no existe.");
                }
            	
                break;   
            case "PRODUCTOSACEPTARAGREGAR":
            	try {
                    nombreProducto = frame.getPanelProducto().getPanelAgregarProducto().getNombreProductoField().getText();
                    nitProveedor = frame.getPanelProducto().getPanelAgregarProducto().getNitProveedorField().getText();
                    precioCompra = Long.parseLong(frame.getPanelProducto().getPanelAgregarProducto().getPrecioCompraField().getText());
                    precioVenta = Long.parseLong(frame.getPanelProducto().getPanelAgregarProducto().getPrecioCompraField().getText());

                    if (nombreProducto.equals("") || nitProveedor.equals("") || String.valueOf(precioCompra).equals("") || String.valueOf(precioVenta).equals("")) {
                        frame.info("Llene todos los campos");
                    } else {
                        if (dto.getDaoProductos().agregarProducto(dto.getArrayProductos(), dto.getFileProductos(), nombreProducto, nitProveedor, precioCompra, precioVenta)) {
                            frame.info("El producto se agregó correctamente.");
                        } else {
                            frame.info("Ya existe un producto con el misma nombre.");
                        }
                        
                    }
                } catch (NumberFormatException ex) {
                    frame.info("Recuerde que el NIT del producto y los precios deben contener únicamente números.");
                }
            	break;
            case "PRODUCTOACEPTARMODIFICAR ":
            	nombreProducto = (String) frame.getPanelProducto().getPanelModificarProducto().getNombreProductoComboBox().getSelectedItem();
            	nitProveedor = frame.getPanelProducto().getPanelAgregarProducto().getNitProveedorField().getText();
            	precioCompra = Long.parseLong(frame.getPanelProducto().getPanelAgregarProducto().getPrecioCompraField().getText());
            	precioVenta = Long.parseLong(frame.getPanelProducto().getPanelAgregarProducto().getPrecioCompraField().getText());

                 if (dto.getDaoProductos().modificarProducto(dto.getArrayProductos(), dto.getFileProductos(), nombreProducto, nitProveedor, precioCompra, precioVenta)) {
                     frame.info("El Producto se modificó correctamente.");
                 } else {
                     frame.info("El Producto no existe.");
                 }
                 break;
            case "PRODUCTOMODIFICARCOMBO":
            	 try {
                     String nombreProductoCombo = (String) frame.getPanelProducto().getPanelModificarProducto().getNombreProductoComboBox().getSelectedItem();

                     Productos productos = dto.getDaoProductos().buscarProducto(dto.getArrayProductos(), nombreProductoCombo);

                     frame.getPanelProducto().getPanelModificarProducto().getNitProveedorField().setText(productos.getNitProveedor());
                     frame.getPanelProducto().getPanelModificarProducto().getPrecioCompraField().setText(String.valueOf(productos.getPrecioCompra()));
                     frame.getPanelProducto().getPanelModificarProducto().getPrecioVentaField().setText(String.valueOf(productos.getPrecioVenta()));
                 } catch (NullPointerException ex) {
                     frame.getPanelProducto().getPanelModificarProducto().getNombreProductoField().setText("");
                     frame.getPanelProducto().getPanelModificarProducto().getPrecioCompraField().setText("");
                     frame.getPanelProducto().getPanelModificarProducto().getPrecioVentaField().setText("");
                 }

            break;
            case "AGREGARPROVEEDOR":
                frame.getPanelProveedores().setVisible(true);
            	frame.getPanelProveedores().getPanelAgregarProveedores().setVisible(true);
                frame.getPanelProveedores().getPanelModificarProveedores().setVisible(false);
                break;
            case "BUSCARPROVEEDOR":
            	 busqueda = frame.datoString("Ingrese el NIT del proveedor que desea buscar: ");

                 Proveedores proveedores = dto.getDaoProveedores().buscarProveedores(dto.getArrayProveedores(), busqueda);

                 if (proveedores != null) {
                     frame.info(proveedores.toString());
                 } else {
                     frame.info("El proveedor no existe.");
                 }
                break;
            case "MODIFICARPROVEEDOR":
                frame.getPanelProveedores().setVisible(true);
            	frame.getPanelProveedores().getPanelAgregarProveedores().setVisible(false);
                frame.getPanelProveedores().getPanelModificarProveedores().setVisible(true);

                frame.getPanelProveedores().getPanelModificarProveedores().getNitComboBox().removeAllItems();

                for (Proveedores proveedoresEncontrado : dto.getArrayProveedores()) {
                    frame.getPanelProveedores().getPanelModificarProveedores().getNitComboBox().addItem(proveedoresEncontrado.getNit());
                }
                break;
            case "ELIMINARPROVEEDOR":
            	 busqueda = frame.datoString("Ingrese el Nit del proveedor que desea eliminar: ");

                 if (dto.getDaoProveedores().eliminarProveedores(dto.getArrayProveedores(), dto.getFileProveedores(), busqueda)) {
                     frame.info("El proveedor se eliminï¿½ correctamente.");
                 } else {
                     frame.info("No se pudo eliminar al proveedor. Posiblemente no existe.");
                 }
                break;
            case "PROVEEDORESACEPTARAGREGAR":
                try {
                    nit = frame.getPanelProveedores().getPanelAgregarProveedores().getNitField().getText();
                    nombre = frame.getPanelProveedores().getPanelAgregarProveedores().getNombreField().getText();
                    direccion = frame.getPanelProveedores().getPanelAgregarProveedores().getDireccionField().getText();
                    telefono = Long.parseLong(frame.getPanelProveedores().getPanelAgregarProveedores().getTelefonoField().getText());
                    ciudad = frame.getPanelProveedores().getPanelAgregarProveedores().getCiudadField().getText();

                    if (nit.equals("") || nombre.equals("") || direccion.equals("") || String.valueOf(telefono).equals("") || ciudad.equals("")) {
                        frame.info("Llene todos los campos");
                    } else {
                        if (dto.getDaoProveedores().agregarProveedor(dto.getArrayProveedores(), dto.getFileProveedores(), nit, nombre, direccion, telefono, ciudad)) {
                            frame.info("El proveedor se agregó correctamente.");
                        } else {
                            frame.info("Ya existe un proveedor con el mismo NIT.");
                        }

                    }
                } catch (NumberFormatException ex) {
                    frame.info("Recuerde que la Nit y el teléfono deben contener únicamnete números.");
                }
                break;
            case "PROVEEDORESACEPTARMODIFICAR":
            	 nit = frame.getPanelProveedores().getPanelAgregarProveedores().getNitField().getText();
                 nombre = frame.getPanelProveedores().getPanelAgregarProveedores().getNombreField().getText();
                 direccion = frame.getPanelProveedores().getPanelAgregarProveedores().getDireccionField().getText();
                 telefono = Long.parseLong(frame.getPanelProveedores().getPanelAgregarProveedores().getTelefonoField().getText());
                 ciudad = frame.getPanelProveedores().getPanelAgregarProveedores().getCiudadField().getText();

                if (dto.getDaoProveedores().agregarProveedor(dto.getArrayProveedores(), dto.getFileProveedores(), nit, nombre, direccion, telefono, ciudad)) {
                    frame.info("El proveedor se modificó correctamente.");
                } else {
                    frame.info("El proveedor no existe.");
                }
                break;
            case "PROVEEDORESMODIFICARCOMBO":
                try {
                    String nitCombo = (String) frame.getPanelProveedores().getPanelModificarProveedores().getNitComboBox().getSelectedItem();

                    Proveedores proveedor = dto.getDaoProveedores().buscarProveedores(dto.getArrayProveedores(), nitCombo);

                    frame.getPanelProveedores().getPanelModificarProveedores().getNombreField().setText(proveedor.getNombre());
                    frame.getPanelProveedores().getPanelModificarProveedores().getDireccionField().setText(proveedor.getDireccion());
                    frame.getPanelProveedores().getPanelModificarProveedores().getTelefonoField().setText(String.valueOf(proveedor.getTelefono()));
                    frame.getPanelProveedores().getPanelModificarProveedores().getCiudadField().setText(proveedor.getCiudad());
                } catch (NullPointerException ex) {
                    frame.getPanelProveedores().getPanelModificarProveedores().getNombreField().setText("");
                    frame.getPanelProveedores().getPanelModificarProveedores().getDireccionField().setText("");
                    frame.getPanelProveedores().getPanelModificarProveedores().getTelefonoField().setText("");
                    frame.getPanelProveedores().getPanelModificarProveedores().getCiudadField().setText("");
                }
                break;
            case "AGREGARVENTAS":
                frame.getPanelVentas().setVisible(true);
                frame.getPanelVentas().getPanelMostrarVenta().setVisible(true);
                frame.getPanelVentas().getPanelModificarVenta().setVisible(false);
                break;
            case "BUSCARVENTAS":
                busqueda = frame.datoString("Ingrese las ventas del cliente que desea buscar: ");

                Ventas ventas = dto.getDaoVentas().buscarVenta(dto.getArrayVentas(), busqueda);

                if (ventas != null) {
                    frame.info(ventas.toString());
                } else {
                    frame.info("Las ventas no existen.");
                }
                break;
            case "MODIFICARVENTAS":
                frame.getPanelVentas().setVisible(true);
                frame.getPanelVentas().getPanelMostrarVenta().setVisible(false);
                frame.getPanelVentas().getPanelModificarVenta().setVisible(true);

                frame.getPanelVentas().getPanelMostrarVenta().getCedulaComboBox().removeAllItems();
                for (Ventas ventasEncontrado : dto.getArrayVentas()) {
                    frame.getPanelVentas().getPanelMostrarVenta().getCedulaComboBox().addItem(ventasEncontrado.getCedula());
                }
                break;
            case "ELIMINARVENTAS":
                busqueda = frame.datoString("Ingrese la cédula del cliente que desea eliminar: ");

                if (dto.getDaoVentas().eliminarVentas(dto.getArrayVentas(), dto.getFileVentas(), busqueda)) {
                    frame.info("Las ventas se eliminaron correctamente.");
                } else {
                    frame.info("No se pudo eliminar las ventas. Posiblemente no existe.");
                }
                break;
            case "VENTASACEPTARAGREGAR":
                try {
                	  cedula = frame.getPanelVentas().getPanelMostrarVenta().getCedulaField().getText();
                	  codigoVentas = (int) Long.parseLong(frame.getPanelVentas().getPanelMostrarVenta().getCedulaField().getText());
                      codigoProductos = (int) Long.parseLong(frame.getPanelVentas().getPanelMostrarVenta().getNombreField().getText());
                      cantidadVentas = (int) Long.parseLong(frame.getPanelVentas().getPanelMostrarVenta().getNombreField().getText());
                      validarProducto = Long.parseLong(frame.getPanelVentas().getPanelMostrarVenta().getTelefonoField().getText());
                      validarVentas = Long.parseLong(frame.getPanelVentas().getPanelMostrarVenta().getCorreoField().getText());

                      if (cedula.equals("") || String.valueOf(codigoVentas).equals("") || String.valueOf(codigoVentas).equals("") || String.valueOf(cantidadVentas).equals("") || String.valueOf(validarProducto).equals("")|| String.valueOf(validarVentas).equals("") ) {
                          frame.info("Llene todos los campos");
                      } else {
                          if (dto.getDaoVentas().agregarVenta(dto.getArrayVentas(), dto.getFileVentas(), cedula, codigoVentas, codigoProductos, cantidadVentas, validarProducto, validarVentas)) {
                              frame.info("Las ventas se agregaron correctamente.");
                          } else {
                              frame.info("Ya existe ventas con esa cedula.");
                          }

                      }
                  } catch (NumberFormatException ex) {
                      frame.info("Recuerde que la cedula y los codigos deben contener únicamnete números.");
                  }
                break;
            case "VENTASACEPTARMODIFICAR":
            	cedula = frame.getPanelVentas().getPanelMostrarVenta().getCedulaField().getText();
          	  codigoVentas = (int) Long.parseLong(frame.getPanelVentas().getPanelMostrarVenta().getCedulaField().getText());
                codigoProductos = (int) Long.parseLong(frame.getPanelVentas().getPanelMostrarVenta().getNombreField().getText());
                cantidadVentas = (int) Long.parseLong(frame.getPanelVentas().getPanelMostrarVenta().getNombreField().getText());
                validarProducto = Long.parseLong(frame.getPanelVentas().getPanelMostrarVenta().getTelefonoField().getText());
                validarVentas = Long.parseLong(frame.getPanelVentas().getPanelMostrarVenta().getCorreoField().getText());

                if (dto.getDaoVentas().modificarVentas(dto.getArrayVentas(), dto.getFileVentas(), cedula, codigoVentas, codigoProductos, cantidadVentas, validarProducto, validarVentas)) {
                    frame.info("El cliente se modificó correctamente.");
                } else {
                    frame.info("El cliente ya se cambió.");
                }
                break;
           case "VENTASMODIFICARCOMBO":
                try {
                    String cedulaCombo = (String) frame.getPanelVentas().getPanelMostrarVenta().getCedulaComboBox().getSelectedItem();

                    Ventas ventas1 = dto.getDaoVentas().buscarVenta(dto.getArrayVentas(), cedulaCombo);

                    frame.getPanelVentas().getPanelMostrarVenta().getNombreField().setText(String.valueOf(ventas1.getCantidadVentas()));
                    frame.getPanelVentas().getPanelMostrarVenta().getDireccionField().setText(String.valueOf(ventas1.getCodigoProductos()));
                    frame.getPanelVentas().getPanelMostrarVenta().getTelefonoField().setText(String.valueOf(ventas1.getCantidadVentas()));
                    frame.getPanelVentas().getPanelMostrarVenta().getCorreoField().setText(String.valueOf(ventas1.getValidarProducto()));
                    frame.getPanelVentas().getPanelMostrarVenta().getCorreoField().setText(String.valueOf(ventas1.getValidarVentas()));
                } catch (NullPointerException ex) {
                    frame.getPanelVentas().getPanelMostrarVenta().getNombreField().setText("");
                    frame.getPanelVentas().getPanelMostrarVenta().getDireccionField().setText("");
                    frame.getPanelVentas().getPanelMostrarVenta().getTelefonoField().setText("");
                    frame.getPanelVentas().getPanelMostrarVenta().getCorreoField().setText("");
                    frame.getPanelVentas().getPanelMostrarVenta().getCorreoField().setText("");
                }
                break;
        }

        if (comando.equals("REGRESARPRODUCTO") || comando.equals("REGRESARCLIENTE") || comando.equals("REGRESARPROVEEDOR") || comando.equals("REGRESARVENTAS") || comando.equals("REGRESARCONSULTAS")) {
            frame.getClientesModuloDao().setVisible(false);
            frame.getProveedoresModuloDao().setVisible(false);
            frame.getProductosModuloDao().setVisible(false);
            frame.getPanelCliente().setVisible(false);
            frame.getPanelProveedores().setVisible(false);
            frame.getPanelProducto().setVisible(false);
            frame.getPanelVentas().setVisible(false);
            frame.getPanelModulos().setVisible(true);
        }
    }
}
