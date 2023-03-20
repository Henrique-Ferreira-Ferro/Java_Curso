package arrays;

import java.util.Scanner;



public class Desafio_Array {
	public static void main(String[]args) {

	Scanner entrada = new Scanner(System.in);
	
		System.out.println("Sistema de calculo de média do aluno");
		System.out.println("Digite quantas notas haverá: ");
		
		
		int quantidade = entrada.nextInt();
		
		int [] notasD = new int [quantidade];
		
		int notasAluno;
		for(int i = 0; i < quantidade; i++) {
			System.out.printf("Digite a nota %d : ", (i+1));
			 notasAluno = entrada.nextInt();
			 notasD[i] = notasAluno;
		}
	
		double media = 0;
		for(int soma: notasD) {
			media += soma;
		}
		System.out.println("A media do aluno é: " + media/quantidade);
		entrada.close();
	}
}
 