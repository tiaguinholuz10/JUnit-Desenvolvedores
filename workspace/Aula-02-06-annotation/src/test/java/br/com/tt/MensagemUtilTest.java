package br.com.tt;

import static org.junit.Assert.*;

import org.junit.Test;

public class MensagemUtilTest {

	@Test
	public void testMostraMensagem() {
		MensagemUtil mensagemUtil = new MensagemUtil("Ver Tempo execução");
		try {
			mensagemUtil.mostraMensagem();
		} catch (InterruptedException e) {
			e.printStackTrace();
			assertTrue(false);
		}

	}

}
