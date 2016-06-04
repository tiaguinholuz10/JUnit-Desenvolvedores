package br.com.tt;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSomar() {
		int val1 = 2;
		int val2 = 2;
		Calculadora calculadora = new Calculadora();
		int soma = calculadora.somar(val1, val2);
		Assert.assertEquals(4, soma);
	}

	@Test
	public void testDividirInteirosIguais() {
		Calculadora calculadora = new Calculadora();
		Double result = calculadora.dividir(2D, 2D);
		assertEquals(new Double(1), new Double(result));
	}

	@Test
	public void testDividirPrimeiroValorMenor() {
		Calculadora calculadora = new Calculadora();
		assertEquals(new Double(0.25), calculadora.dividir(1D, 4D));

	}

	@Test
	public void testDividirSegundoValorMenor() {
		assertEquals(new Double(2.5), new Calculadora().dividir(5D, 2D));
	}

	@Test
	public void testDividirSegundoValorZero() {
		assertTrue(new Calculadora().dividir(5D, 0D).isInfinite());
	}

	@Test
	public void testDividirPrimeiroValorZero() {
		assertEquals(new Double(0), new Calculadora().dividir(0D, 5D));
	}

	@Test
	public void testDividirPrimeiroValorNull() {
		assertEquals(new Double(0), new Calculadora().dividir(null, 0D));
	}

	@Test
	public void testDividirSegundoValorNull() {
		assertTrue(new Calculadora().dividir(5D, null).isInfinite());
	}

	@Test
	public void testDividirDoisValorNull() {
		assertEquals(new Double(0), new Calculadora().dividir(null, null));
	}

	@Test(expected = NumberFormatException.class)
	public void testDividirPrimeiroValorString() {
		assertEquals(new Double(0), new Calculadora().dividir(new Double("AAA"), null));
	}

	@Test(expected = NumberFormatException.class)
	public void testDividirSegundoValorString() {
		assertEquals(new Double(0), new Calculadora().dividir(null, new Double("AAA")));
	}

	@Test(expected = NumberFormatException.class)
	public void testDividirDoisValorString() {
		assertEquals(new Double(0), new Calculadora().dividir(new Double("AAA"), new Double("AAA")));
	}
}
