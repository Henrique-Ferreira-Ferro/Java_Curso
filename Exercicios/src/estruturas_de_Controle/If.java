package estruturas_de_Controle;

import java.util.Scanner;

public class If {
	public static void main(String[]args) {

	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite a nota do aluno: ");
	double nota1 = entrada.nextDouble();
		if(nota1 <= 10 && nota1 >= 7.0) {
			System.out.println("Aluno aprovado!!!");
			System.out.println("Pr�xima prova em um m�s");
		}
		
		if(nota1 <= 7.0 && nota1 >= 4.5 ) {
			System.out.println("Em recupera��o");
			System.out.println("Proxima prova em uma semana");
		}
		if(nota1 <4.5 && nota1 >= 0) {
			System.out.println("Abaixo da linha de recupera��o");
			System.out.println("Far� trabalhos e duas provas em duas semanas");
		}
		
		entrada.close();
	}
}
