package br.com.tt.model;

public class Agenda {
	
	private String nome;
	private String telefone;
	private String email;
	private String nomeFake;
	private char sexo;
	private Double nota;
	private Boolean colega;
	
	
	public Agenda(String nome, String telefone, String email, String nomeFake, char sexo, Double nota, Boolean colega) {
		super();
	}
	public Agenda(String nome,char sexo, String nomeFake, Double nota) { 
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.nomeFake = nomeFake;
		this.nota = nota;
	}
	
	
	

	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNomeFake() {
		return nomeFake;
	}
	public void setNomeFake(String nomeFake) {
		this.nomeFake = nomeFake;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public Double getNota() {
		return nota;
	}
	public void setNota(Double nota) {
		this.nota = nota;
	}
	public Boolean getColega() {
		return colega;
	}
	public void setColega(Boolean colega) {
		this.colega = colega;
	}
	
	

}
