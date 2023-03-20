package estruturas_de_Controle;

import java.util.Scanner;

public class Exercicio_02 {
	public static void main(String[]args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int ano = entrada.nextInt();
		
		System.out.println("Digite um ano para checar se é bissexto: ");
		
	
		
		
		if(ano % 4 == 0 || ano % 100 == 0 || ano % 400 == 0) {
			System.out.println("Ano bissexto");
		}else {
			System.out.println("Não é um ano bissexto");
		}
	
		entrada.close();
	}
}
