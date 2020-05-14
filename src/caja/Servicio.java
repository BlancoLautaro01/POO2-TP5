package caja;

public class Servicio extends Factura {
	
	private int cantidad;

	public Servicio(String concepto, double precio, int cantidad) {
		super(concepto, precio);
		this.setCantidad(cantidad);
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public double montoAPagar() {
		return this.getCantidad() * this.getPrecio(); 
	}
}
