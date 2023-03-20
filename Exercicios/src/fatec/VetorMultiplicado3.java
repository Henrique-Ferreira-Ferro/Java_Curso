package fatec;

import java.util.Scanner;

public class VetorMultiplicado3 {
	public static void main(String[]args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		int i = 5;
		int[] armazenado = new int[i];
		
		
		for(int e = 0; e < 5; e ++ ) {
			System.out.print("Digite os numeros: ");
			armazenado[e] = entrada.nextInt() * 3;
			
		}
		
		for(int o = 0; o < 5; o ++) {
			System.out.println(armazenado[o]);
		}
		
		
		entrada.close();
		
		
	}
	
}
