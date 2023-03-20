package estruturas_de_Controle;

import java.util.Scanner;

public class Desafio_While {
	public static void main(String[]args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int quantidadedeNotas =0;
		double nota =0;
		double total = 0;
		
		while(nota != -1) {
			System.out.print("Informe a nota: ");
			nota = entrada.nextDouble();
			
			if(nota <= 10 && nota >=0) {
			 
			 total = total +nota;
			 quantidadedeNotas++;
			}else if ( nota != -1) {
				System.out.println("Informe uma nota valida");
			}
			 
		}
		
		//Calcular a média
		
		double media = total/ quantidadedeNotas;
		
		System.out.println("Media = " +media);
		
		entrada.close();
	}
}
