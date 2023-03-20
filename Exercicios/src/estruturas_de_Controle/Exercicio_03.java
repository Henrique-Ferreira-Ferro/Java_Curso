package estruturas_de_Controle;

import java.util.Scanner;

public class Exercicio_03 {
	public static void main(String[]args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a nota do aluno: ");
		
		double nota = entrada.nextDouble();
		
		
		
		if(nota >= 7 || nota >= 10) {
			System.out.println("O aluno foi aprovado :)");
		}else if(nota >= 4 || nota >= 7) {
			System.out.println("O aluno está em recuperação :/");
		}else {
			System.out.println("O aluno está reprovado :(");
		}
		
		
		
		entrada.close();		
	}
}
