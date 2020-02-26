package com.centuri123.atividades;

import java.util.Scanner;

public class Desafio1 {
	public Integer numero;
	
	protected boolean verifParImpar(){
		
		Scanner valorDigitado = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		
		this.setNumero(valorDigitado.nextInt());
		valorDigitado.close();
		
		if(this.getNumero()%2 == 0){
			return true;
		}
		return false;
	}
	
	public void exibeResultado(){
		
		 if(this.verifParImpar()){
		 	System.out.println("O número digitado é PAR !!");
		 }else{
		 	System.out.println("O número digitado é IMPAR !!");
		 }
	}
	
	public int getNumero(){
		return this.numero;
	}
	
	public void setNumero(int valorDigitado){
		this.numero = valorDigitado;
	}
}
