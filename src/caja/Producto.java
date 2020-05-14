package caja;

public class Producto{

	protected double precio;
	protected String nombre;
	protected int stock;
	
	public Producto(String nombre, double precio, int stock) {
		setPrecio(precio);
		this.setNombre(nombre);
		this.setStock(stock);
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getStock() {
		return stock;
	}
	
	public void disminuirStock() {
		this.setStock(this.getStock()-1);
	}
}

