package fatec.string;

import java.util.Scanner;
public class LerString_Letra {
public static void main(String[]args) {
		/*
		Escreva um programa que leia duas strings (dois nomes)
		e as imprima na tela. Imprima também a segunda letra
		de cada string.
				
		*/
	
	Scanner entrada = new Scanner(System.in);
	
	int i = 0;
	String[] nomes;
	nomes = new String[2];
	
	
	for( i = 0 ; i < 2; i++) {
		System.out.print("Digite dois nomes: ");
		
		nomes[i] = entrada.nextLine();
	
		
		
	}
	
	
	  for(int e = 0; e < 2; e ++) { 
		  System.out.println("Os nomes digitados são: " + nomes[e]);
		  
		  System.out.println("A segunda letra de cada nome é: " + nomes[e].charAt(1));
	  }
	 
	  
	
	
	
	entrada.close();
	
  }
}
