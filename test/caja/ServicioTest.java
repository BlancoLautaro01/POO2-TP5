package caja;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ServicioTest {
	
	private Servicio luz;
	
	@BeforeEach
	public void setUp() {
		luz = new Servicio("luz", 75d, 4);
	}
	
	@Test
	public void testConstructor() {
		assertEquals("luz", luz.getConcepto());
		assertEquals(75, luz.getPrecio());
		assertEquals(4, luz.getCantidad());
	}
		
	@Test
	public void testMontoAPagar() {
		assertEquals(300, luz.montoAPagar());
	}
}
