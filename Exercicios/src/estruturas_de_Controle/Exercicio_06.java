package estruturas_de_Controle;

import java.util.Scanner;
import java.util.Random;

public class Exercicio_06 {
	public static void main(String[]args) {
		
	Scanner entrada = new Scanner(System.in);
		
		Random aleatorio = new Random();
	
	int NumAleatorio = aleatorio.nextInt(100); 
	
	
	for(int i = 0; i < 10; i++) {
		System.out.print("Digite um numero para tentar acertar o valor: ");
		int tentativa = entrada.nextInt();
		
		if(tentativa == NumAleatorio) {
			System.out.println("Você conseguiu!!");
			break;
		}else if( tentativa > NumAleatorio) {
			System.out.println("Você digitou um numero maior");
		}else if(tentativa < NumAleatorio) {
			System.out.println("Você digitou um numero menor do que o aleatorio");
		}
		
	}
		System.out.println("O Numero aleatorio era: " + NumAleatorio);
		
	entrada.close();	
	}
}
