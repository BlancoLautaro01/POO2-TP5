package caja;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductoTradicionalTest {
	
	private ProductoTradicional mouse;
	
	@BeforeEach
	public void setUp() {
		mouse = new ProductoTradicional("Mouse", 400d, 20);
	}
	
	@Test
	public void testConstructor() {
		assertEquals("Mouse", mouse.getNombre());
		assertEquals(400, mouse.getPrecio());
		assertEquals(20, mouse.getStock());
	}
}
