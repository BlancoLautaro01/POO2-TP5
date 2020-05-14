package caja;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CajaTest {
	
	private Servicio luz;
	private Impuesto iva;
	private ProductoCooperativa teclado;
	private ProductoTradicional mouse;
	private Caja caja;
	
	@BeforeEach
	public void setUp() {
		teclado = new ProductoCooperativa("Teclado", 700d, 20);
		mouse = new ProductoTradicional("Mouse", 400d, 20);
		iva = new Impuesto("iva", 20d);
		luz = new Servicio("luz", 75d, 4);
		caja = new Caja(1);
	}
	
	@Test
	public void testConstructor() {
		assertEquals(1, caja.getNumero());
		assertEquals(0, caja.getCantidadDeProductos());
		assertEquals(0, caja.getCantidadDePagos());
		assertEquals(0, caja.getCantidadDeFacturas());
	}
		
	@Test
	public void testRegistrarXYCantidadX() {
		caja.registrarProducto(mouse);
		caja.registrarProducto(teclado);
		caja.registrarPago(iva);
		caja.registrarPago(luz);
		assertEquals(4, caja.getCantidadDePagos());
		assertEquals(2, caja.getCantidadDeProductos());
		assertEquals(2, caja.getCantidadDeFacturas());
	}
	
	@Test
	public void testGetTotalAPagar() {
		caja.registrarProducto(teclado);
		caja.registrarPago(iva);
		assertEquals(650d, caja.getTotalAPagar());
		caja.registrarPago(luz);
		caja.registrarProducto(mouse);
		assertEquals(1350, caja.getTotalAPagar());
	}
}
