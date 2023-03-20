package estruturas_de_Controle;

import java.util.Scanner;

public class Exercicio_07 {
	public static void main(String[]args) {
		/*
		 * Criar um programa que enquanto estiver recebendo números 
		 * positivos, imprime no console a soma dos números inseridos, 
		 * caso receba um número negativo, encerre o programa. Tente 
		 * utilizar a estrutura do while. 
		 *
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite alguns numeros: ");
		System.out.println("Para sair digite um numero negativo !!!");
		
		int numerosPositivos = 0; 
		int somadosNumeros = 0;
		int resultado = 0;
		while(numerosPositivos != - 1 ) {
			numerosPositivos = entrada.nextInt();
			somadosNumeros += numerosPositivos;
			resultado = numerosPositivos + somadosNumeros;	
		}
		if(numerosPositivos == -1) {
			resultado = resultado +2;
			System.out.println("O resultado é: "+ resultado);
		
		}	
		entrada.close();
	}
}
