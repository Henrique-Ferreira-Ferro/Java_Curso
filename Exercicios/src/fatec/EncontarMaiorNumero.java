package fatec;

import java.util.Scanner;

public class EncontarMaiorNumero {
	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		
		int i = 5;
		int maior = 0;
		int[] armazenado = new int[i];
		
		for(int e = 0; e < i; e ++) {
			
			System.out.print("Digite 5 valores: ");
			armazenado[e] = entrada.nextInt();
		}
		maior = armazenado[0];
		for(int o = 0; o < i; o ++) {
			if(armazenado[o] > maior) {
				maior = armazenado[0];
			}
		}
		
		System.out.println("O maior numero é: " + maior);
		
		entrada.close();
	}
}
