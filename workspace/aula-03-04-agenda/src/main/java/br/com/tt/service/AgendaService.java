package br.com.tt.service;

import java.util.ArrayList;
import java.util.List;

import br.com.tt.dao.Crud;
import br.com.tt.model.Agenda;

public class AgendaService {
	
	private Crud<Agenda> crud;
	
	public Agenda verificaColega(Agenda agenda){
		
		if(agenda.getColega()){			
			agenda.setNome(agenda.getNomefake());
			
		}
		return agenda;
	}
	
	public List<Agenda> colegasImportantes(double nota){
		List<Agenda> resultado = new ArrayList<Agenda>();
		List<Agenda> colegas = crud.consultar();
		for (Agenda agenda : colegas) {
			if(agenda.getSexo() == 'F' && agenda.getNota() >= nota){
			resultado.add(verificaColega(agenda));
			}
		}
		
		
		
		
	}
	
	private List<Agenda> colegasImportan() {
		// TODO Auto-generated method stub

	}

}
