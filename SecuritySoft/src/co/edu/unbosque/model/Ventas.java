package co.edu.unbosque.model;

import java.io.Serializable;

public class Ventas implements Serializable {
		
		private static final long serialVersionUID = 1L;
		
		private String cedula;
		private int codigoVentas;
		private int codigoProductos;
		private int cantidadVentas;
		private double validarProducto;
		private double validarVentas;
		
		public Ventas(String cedula, int codigoVentas, int codigoProductos, double validarProducto2, int cantidadVentas, double validarVentas) {
			
			this.cedula = cedula;
			this.codigoVentas = codigoVentas;
			this.codigoProductos = codigoProductos;
			this.validarProducto = validarProducto2;
			this.cantidadVentas = cantidadVentas;
			this.validarVentas = validarVentas;
		
 }
		

		public String getCedula() {
			return cedula;
		}


		public void setCedula(String cedula) {
			this.cedula = cedula;
		}


		public int getCodigoVentas() {
			return codigoVentas;
		}

		public void setCodigoVentas(int codigoVentas) {
			this.codigoVentas = codigoVentas;
		}

		public int getCodigoProductos() {
			return codigoProductos;
		}

		public void setCodigoProductos(int codigoProductos) {
			this.codigoProductos = codigoProductos;
		}

		public int getCantidadVentas() {
			return cantidadVentas;
		}

		public void setCantidadVentas(int cantidadVentas) {
			this.cantidadVentas = cantidadVentas;
		}

		public double getValidarProducto() {
			return validarProducto;
		}

		public void setValidarProducto(double validarProducto) {
			this.validarProducto = validarProducto;
		}

		public double getValidarVentas() {
			return validarVentas;
		}

		public void setValidarVentas(double validarVentas) {
			this.validarVentas = validarVentas;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		
}