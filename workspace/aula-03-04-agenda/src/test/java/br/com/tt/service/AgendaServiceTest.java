package br.com.tt.service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.com.tt.dao.Crud;
import br.com.tt.model.Agenda;


public class AgendaServiceTest {

	@Test
	public void testVerificaColega() {
		Agenda agenda = new Agenda();
		agenda.setNome("Camila");
		agenda.setSexo('F');
		agenda.setNomefake("Camilo");
		
		assertEquals("Camilo", new AgendaService().verificaColega(agenda).getNome());
		
		
		
	}
	@Test
	public void testColegasImportantes() {
		
		AgendaService agendaService = new AgendaService();
		Crud<Agenda> agendaCrud = mock(Crud.class);
		
	List<Agenda> resultado = new ArrayList<Agenda>();
	List<Agenda> colegas = crud.consultar();
		
		
		
		
	}

}
