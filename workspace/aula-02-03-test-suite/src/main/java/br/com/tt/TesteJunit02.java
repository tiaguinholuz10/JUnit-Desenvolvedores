package br.com.tt;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteJunit02 {
	
String nome = "Marcia Maria dos Santos";
	
	
	MensagemUtil mensagemUtil = new MensagemUtil(nome);
	
	
	@Test
	public void testMostraMensagem(){
		
		assertEquals("Teste Mostra Mensagem", "Ola " + nome, mensagemUtil.saudacaoMensagem());
	}
	
	
	

}
