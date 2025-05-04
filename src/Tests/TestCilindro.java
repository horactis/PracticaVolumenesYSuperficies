package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Clases.Cilindro;

class TestCilindro {

	@Test
	void testSuperficie() {
		Cilindro c = new Cilindro();
		double valorEsperado = 12.56;
		double valoObtenido = c.superficie();
		assertEquals(valorEsperado, valoObtenido);
	}

	@Test
	void testVolumen() {
		Cilindro c = new Cilindro();
		double valorEsperado = 3.14;
		double valoObtenido = c.volumen();
		assertEquals(valorEsperado, valoObtenido);	
	}

}
