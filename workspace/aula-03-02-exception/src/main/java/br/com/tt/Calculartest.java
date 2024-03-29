package br.com.tt;

import static org.junit.Assert.*;

import org.junit.Test;

public class Calculartest {

	@Test(expected = ArithmeticException.class, timeout = 1000)
	public void testDividir() {
		new Calcular().dividir();

	}

	@Test
	public void testSomarPositivos() throws SistemaException {
		new Calcular().somarPositivos(1l, 2l, 3l, 4l);
	}

	@Test(expected = SistemaException.class)
	public void testSomarPositivosPassandoNegativo() throws SistemaException {
		new Calcular().somarPositivos(1l, -2l, 3l, 4l);

	}
	@Test
	public void testSomarPositivosPassandoSemValores() throws SistemaException {
		new Calcular().somarPositivos();
		
	}

	@Test(expected = SistemaException.class)
	public void testSomarPositivosPassandoNull() throws SistemaException {
		new Calcular().somarPositivos(1l, null, 3l, 4l);
	
}

}
