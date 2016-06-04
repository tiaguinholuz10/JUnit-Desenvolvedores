package br.com.tt;

import static org.junit.Assert.*;

import org.junit.Test;

public class Teste01 {

	@Test
	public void primeiroTeste() {
		//fail("Não Implementado");
	}

	@Test
	public void aaa() {
		//fail();
	}

	@Test
	public void somar() {

		int soma = 4 + 4;
		if (soma == 8) {
			// System.out.println(" OK");
		} else {
		//	fail("Erro na soma ");
		}
	}

	@Test
	public void somarComCorretamente() {
		int soma = 4 + 4;
		assertEquals(8, soma);

	}

	@Test(expected = NullPointerException.class)
	public void passandoNull() {
		String nome = null;
		nome.length();

	}

}
