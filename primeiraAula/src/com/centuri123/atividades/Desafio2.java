package com.centuri123.atividades;

public class Desafio2 extends Desafio1{
	
	private Boolean ehPar;
	
	protected String verifEstranho(){
		
		this.setEhPar(this.verifParImpar());
		
		if(this.getEhPar()){
			if(this.getNumero() < 10){
				return "Não é estranho";
			}else if(this.getNumero() <= 20){
				return "Estranho";
			}else{
				return "Não é Estranho";
			}
		}
		return "estranho";
	}
	
	public void exibeEstranho(){
		System.out.println(this.verifEstranho());
	}
	public boolean getEhPar(){
		return this.ehPar;
	}
	
	public void setEhPar(boolean logico){
		this.ehPar = logico;
	}
	
}
