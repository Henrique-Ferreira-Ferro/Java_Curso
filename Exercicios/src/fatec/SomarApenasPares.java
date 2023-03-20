package fatec;

import java.util.Scanner;
public class SomarApenasPares {
	public static void main(String[]args) {
		//Ler 100 numeros inteiros e somar apenas os numeros pares. Ao final mostrar a soma
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		System.out.println("Digite 100 numeros");
		int valorD;
		int soma = 0;
		while(numero < 5) {
			for(int x = 5; numero < x ; numero ++) {
				System.out.print("Digite o próximo: ");
				valorD = entrada.nextInt();
				
				if(valorD % 2 == 0) {
					soma += valorD ;
				}
				
			}
		}
		System.out.println("A soma dos valores pares é: " + soma);
		
		entrada.close();
	}
}
