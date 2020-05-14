package caja;

public class Factura{
	
	protected double precio;
	protected String concepto;
	
	public Factura(String concepto, double precio) {
		this.setPrecio(precio);
		this.setConcepto(concepto);
	}

	public double getPrecio() {
		return this.precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public String getConcepto() {
		return this.concepto;
	}
	
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	
	protected double montoAPagar() {
		return this.precio;
	}
	
	public void notificarAgencia() {
		//Las facturas deberian tener una variable agencia y esta se pasaria en la funcion.
	}
}
