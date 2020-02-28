package com.centuri123.atividades;

public class Bhaskara {
	private Integer valorA;
	private Integer valorB;
	private Integer valorC;
	
	public Bhaskara(int numA, int numB, int numC){
		this.setValorA(numA);
		this.setValorB(numB);
		this.setValorC(numC);
		this.calcDelta();
	}
	public int calcDelta(){
		int delta;
		
		delta = (int)(Math.pow(this.getValorB(),2))-(4*this.getValorA()*this.getValorC());
		if(delta > 0){
			return delta;
		}
		return 0;
	}
	
	public void calculaBhask(){
		int delta = this.calcDelta();
		int x1 = 0;
		int x2 = 0;
		
		x1 = (int)(((this.getValorB()*(-1)) + Math.sqrt(delta))/(2*this.getValorA()));
		x2 = (int)(((this.getValorB()*(-1)) - Math.sqrt(delta))/(2*this.getValorA()));
		
		System.out.printf("Valor de x1 = %d \n Valor de x2 = %d", x1, x2);
	}
	
	public int getValorA(){
		return valorA;
	}
	
	public int getValorB(){
		return valorB;
	}
	
	public int getValorC(){
		return valorC;
	}
	
	public void setValorA(int numA){
		this.valorA = numA;
	}
	
	public void setValorB(int numB){
		this.valorB = numB;	
	}
	
	public void setValorC(int numC){
		this.valorC = numC;
	}

}
