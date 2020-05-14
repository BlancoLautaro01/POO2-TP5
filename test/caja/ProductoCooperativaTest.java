package caja;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductoCooperativaTest {
	
	private ProductoCooperativa teclado;
	
	@BeforeEach
	public void setUp() {
		teclado = new ProductoCooperativa("Teclado", 700d, 20);
	}
	
	@Test
	public void testConstructor() {
		assertEquals("Teclado", teclado.getNombre());
		assertEquals(630, teclado.getPrecio());
		assertEquals(20, teclado.getStock());
	}
}