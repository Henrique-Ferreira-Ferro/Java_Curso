package estruturas_de_Controle;

import java.util.Scanner;

public class Do_While {
	public static void main(String[]args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String texto ="";
		
		do {
			System.out.println("Digite as palavras m�gicas: ");
			System.out.println("Quer sair ?");
			texto = entrada.next();
		}while(!texto.equalsIgnoreCase("por favor"));
		
		
		System.out.println("Obrigado");
		
		entrada.close();
		
		
	}
}
