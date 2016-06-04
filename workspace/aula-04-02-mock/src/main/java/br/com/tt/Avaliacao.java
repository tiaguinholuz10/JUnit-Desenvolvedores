package br.com.tt;

public class Avaliacao {
	
	
	public static final String APROVADO ="Aprovado";
	public static final String REPROVADO = "Reprovado";
	public static final String	RECUPERACAO = "Recuperação";	
	
	String retorno = "";

	public String avaliar(Estudante aluno){
		
		
		
		if(aluno.getNotaProva() >= 7){
			if(aluno.getNotaTrabalho() >= 7){
				retorno = APROVADO;
			}
		retorno = RECUPERACAO;
			
		}else{
			retorno = REPROVADO;
		}
		
		return null;
	}

}
