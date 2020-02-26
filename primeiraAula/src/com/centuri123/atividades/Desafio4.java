package com.centuri123.atividades;

import java.util.Scanner;

public class Desafio4 {
	
	public void exibeTab(){
		Scanner valorDigitado = new Scanner(System.in);
		int i = 0, num;
		System.out.println("Digite o número que deseja exibir a Tabuada: ");
		num = valorDigitado.nextInt();

		valorDigitado.close();
		
		System.out.println("*-- Tabuada ----*");
		for(i=0;i<10;i++){
			System.out.printf("* %d  x  %d  = %d *\n", i+1, num, num*(i+1));
		}
		System.out.println("*----------------*");
	}
	
}
