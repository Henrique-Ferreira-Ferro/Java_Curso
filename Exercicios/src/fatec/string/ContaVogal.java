package fatec.string;

import java.util.Scanner;

public class ContaVogal {
public static void main(String[]args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um texto: ");
	
		String texto = entrada.nextLine();
		
		int contador = 0;
		
		
		char[] vogais = {'A','E','I','O','U'};		
		
		for(int i = 0; i < texto.length(); i++) {
			
			char letra = texto.toUpperCase().charAt(i);

			for(int e = 0; e < vogais.length; e++) {
				if(letra == vogais[e]) {
					contador++;
				}
			}
			
		}
		
		System.out.println("o texto possui: " + contador + " vogais");
		
		entrada.close();
	}
}
