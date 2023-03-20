package estruturas_de_Controle;

import java.util.Scanner;

public class While {
	public static void main(String[]args) {
		
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("Olá seja bem-vindo!!");
		System.out.println("Digite um texto ou qualquer coisa");
		System.out.println("Escreva 'sair' para sair");
		
	
		String valor = "";
		
		while(!valor.equalsIgnoreCase("sair")){
			
			System.out.println("Digite algo: ");
			valor = entrada.nextLine();
		}
		entrada.close();
		
	}

}
