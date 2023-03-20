package estruturas_de_Controle;

import java.util.Scanner;

public class Exercicio_04 {
	public static void main(String[]args) {

		//Numero primo divisivel por 2 numeros 1 e ele mesmo
		
		Scanner entrada = new  Scanner(System.in);
		
		System.out.println("Digite um numero: "); 
		
		
		int numeroPrimo = entrada.nextInt();
		int numDivisores = 0;
		
		
		for( int i = 1; i <= numeroPrimo; i++) {
			if(numeroPrimo % i == 0) {
				numDivisores++;
		}
	}
		if(numDivisores == 2) {
			System.out.println("O número é primo");
		}else {
			System.out.println("O número não é primo");
		}
		entrada.close();
		
	}
}
