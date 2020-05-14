package caja;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ImpuestoTest {
	
	private Impuesto iva;
	
	@BeforeEach
	public void setUp() {
		iva = new Impuesto("iva", 20d);
	}
	
	@Test
	public void testConstructor() {
		assertEquals("iva", iva.getConcepto());
		assertEquals(20, iva.getPrecio());
	}
		
	@Test
	public void testMontoAPagar() {
		assertEquals(20, iva.montoAPagar());
	}

}
