package caja;

import java.util.ArrayList;

public class Caja implements Agencia{
	
	private int numero;
	private ArrayList<Producto> productos = new	ArrayList<Producto>();
	private ArrayList<Factura> facturas = new ArrayList<Factura>();
	
	public Caja(int numero) {
		super();
		this.setNumero(numero);
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void registrarProducto(Producto producto) {
		this.productos.add(producto);
		producto.disminuirStock();
	}
	
	public void registrarPago(Factura factura) {
		this.facturas.add(factura);
		factura.notificarAgencia();
	}
	
	public int getCantidadDeProductos() {
		return this.productos.size();
	}
	
	public int getCantidadDeFacturas() {
		return this.facturas.size();
	}
	
	public int getCantidadDePagos() {
		return this.productos.size() + this.facturas.size();
	}
	
	public double getTotalAPagar() {
		double sumaPrecios = 0;
		for (Producto prod : this.productos) {
			 sumaPrecios += prod.getPrecio();
		}
		for (Factura fac : this.facturas) {
			 sumaPrecios += fac.montoAPagar();
		}
		return sumaPrecios;
	}
}
