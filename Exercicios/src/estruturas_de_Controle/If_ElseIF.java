package estruturas_de_Controle;

import java.util.Scanner;

public class If_ElseIF {
	public static void main(String[]args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a nota: ");
		double nota = entrada.nextDouble();
		
		if(nota > 10 || nota < 0) {
			System.out.println("Digite uma nota de verdade!!!");
		}else if(nota >= 8.1) {
				System.out.println("Conceito A");
		}else if(nota >= 6.1) {
				System.out.println("Conceitp B");
		}else {
				System.out.println("Conceito C, vão fazer um trabalho");
		}
		
		
		entrada.close();
		
	}
}
