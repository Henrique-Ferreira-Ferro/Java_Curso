package estruturas_de_Controle;

import java.util.Scanner;

public class Exercicio_08 {
	public static void main(String[]args) {
		/*
		 *  Criar um programa que receba uma palavra e imprime no console letra por letra.
		 * 
		 */
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite uma palavra: ");
		
		String palavra = entrada.next();
		
		char letra [] = palavra.toCharArray();
		
		for(int i = 0; i < letra.length; i ++) {
			
			System.out.println(letra[i]);
		}
		
		entrada.close();
	}
}
