package estruturas_de_Controle;

import java.util.Scanner;

public class Exercicio_01 {
	public static void main(String[]args) {
		
	Scanner entrada = new Scanner(System.in);
	
	double numero = entrada.nextDouble();
	
		if(numero <= 10 && numero >= 0 && numero % 2 == 0 ) {
			System.out.println("Est� no intervalo e � par");
		}else {
			System.out.println("O numero digitado n�o esta"
					+ " no intervalo ou n�o e par");
		}
	
	
	entrada.close();
	}
}
