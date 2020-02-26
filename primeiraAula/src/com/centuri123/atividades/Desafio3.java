package com.centuri123.atividades;

import java.util.Scanner;

public class Desafio3 {
	
	private Integer fatorial;
	
	private int calcFatorial(){
		
		int i = 0, resultadoFat = this.getFatorial();
		
		for(i=1;i<this.getFatorial();i++){
			resultadoFat *= i;
		}
		
		return resultadoFat;
	}
	
	public void exibeFatorial(){
		
		Scanner valorDigitado = new Scanner(System.in);
		
		System.out.println("Digite o valor que deseja calcular: ");
		
		this.setFatorial(valorDigitado.nextInt());
		
		valorDigitado.close();
		
		System.out.printf("!%d = %d", this.getFatorial(), this.calcFatorial());
	}
	
	public int getFatorial(){
		return this.fatorial;
	}
	
	public void setFatorial(int valorDigitado){
		this.fatorial = valorDigitado;
	}
}
