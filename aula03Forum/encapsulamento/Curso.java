package com.centuri123.encapsulamento;

public class Curso {
	private String nome; 
	private String professor;
	private String tema;
	private int valor;
	
	public Curso(String nome, String professor, String tema, int valor) throws Exception {
		this.setNome(nome);
		this.setProfessor(professor);
		this.setTema(tema);
		this.setValor(valor);
	}
	
	public void ExibeCurso(){
		System.out.printf("Curso: %s\n", this.getNome());
		System.out.printf("Professor: %s\n", this.getProfessor());
		System.out.printf("Tema: %s\n", this.getTema());
		System.out.printf("Valor: %d\n\n", this.getValor());
	}
	
	public String getNome() {
		return nome;
	}
	
	private void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getProfessor() {
		return professor;
	}
	
	private void setProfessor(String professor) {
		this.professor = professor;
	}
	
	public String getTema() {
		return tema;
	}
	
	private void setTema(String tema) {
		this.tema = tema;
	}
	
	public int getValor() {
		return valor;
	}
	
	private void setValor(int valor) throws Exception {
		if(valor > 0 && valor < 1000) {
			this.valor = valor;
		}
		else {
			throw new Exception("Objeto da Classe Curso não foi instânciado. "
							  + "Parâmetro 'Valor' deve estar entre 1 e 1000.");
		}
	}
	
}
