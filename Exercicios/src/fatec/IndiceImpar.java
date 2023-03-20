package fatec;

import java.util.Scanner;

public class IndiceImpar {

	public static void main(String[] args) {


		Scanner entrada = new Scanner(System.in);
		
		int[] armazenado;
		int i;
		int positivo;
		
		armazenado = new int[5];
		
		for(i = 0; i < 5; i++ ) {
			System.out.print("Digite os valores que serão armazenados: ");
			armazenado[i] = entrada.nextInt();
			
			
			
		}
		
		for(i = 0; i < 5; i++) {
			if(armazenado[i] > 0) {
				positivo = armazenado[i];
				System.out.println("Numeros positivos: " + positivo);
			}
	}
		
		
		entrada.close();
		
	}

}
