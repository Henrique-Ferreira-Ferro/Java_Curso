package fatec;

import java.util.Scanner;

public class NumerosAoContrario {
	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);			
		
		int i = 5;
		int[] armazenado = new int[i];

		
		for(int e = 0; e < 5; e++) {
			System.out.print("Digite "+(e+1)+" numeros: ");
			
			armazenado[e] = entrada.nextInt();
			
		}
			
		for(int o = armazenado.length - 1  ; o >= 0; o --) {
			System.out.println("Numeros ao contrario: " + armazenado[o]);
		}
		
		
		
		
		entrada.close();
	}
			
}
