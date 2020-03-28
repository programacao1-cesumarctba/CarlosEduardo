package com.centuri123.encapsulamento;

public class Main {

	public static void main(String[] args) {
		try{
			Curso curso = new Curso("ADS", "Maycon", "Encapsulamento e Tratamento de Exceções", 590);
			curso.ExibeCurso();
			Curso curso2 = new Curso("ENG", "Dionísio", "Lei de Ohm", 0);
			curso2.ExibeCurso();
			Curso curso3 = new Curso("MED", "Jonathan", "Patologia", 900);
			curso3.ExibeCurso();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}