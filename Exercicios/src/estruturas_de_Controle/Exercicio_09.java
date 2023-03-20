package estruturas_de_Controle;

import java.util.Scanner;

public class Exercicio_09 {
	public static void main(String[]args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite 10 numeros: ");
		
		int contador = 0;
		int maiorValor = 0;
	do {
		int valor = entrada.nextInt();
		if(valor > contador) {
			maiorValor = valor;
		}
		contador ++;
	}while (contador != 10);
			System.out.println(" O maior valor é: "+ maiorValor);
		
		entrada.close();
	}
}
