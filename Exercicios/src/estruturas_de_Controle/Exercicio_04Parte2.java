package estruturas_de_Controle;

import java.util.Scanner;
public class Exercicio_04Parte2 {

	public static void main(String[] args) {
		System.out.print("Digite um n�mero para checarmos se ele � ou n�o primo: ");
		
		int contador = 0;
		Scanner entrada = new Scanner(System.in);
		
		int NumPrimo = entrada.nextInt();
		
		
		
			for(int i = 2; i < NumPrimo; i ++ ) {
				if(NumPrimo % i == 0) {
					contador ++;
				}
			}
			switch(contador){
			case 0:
				System.out.println("� primo");
				break;
			default:
				System.out.println("N�o � primo");
			}
		
		entrada.close();

	}

}
