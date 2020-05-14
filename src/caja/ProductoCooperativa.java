package caja;

public class ProductoCooperativa extends Producto{
	
	public ProductoCooperativa(String nombre, double precio, int stock) {
		super(nombre, precio, stock);
	}
	
	public double getPrecio() {
		return precio * 0.9;
	}
}
