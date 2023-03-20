package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);	
	
	System.out.println("Digite um número");
	double valor1 = entrada.nextDouble();
	System.out.println("Digite o segundo valor: ");		
	double valor2 = entrada.nextDouble();
	System.out.println("Digite a operação: ");
	String operacao = entrada.next();
	
	//Lógica
	
	double resultado = "+".equals(operacao) ? valor1 + valor2 : 0;
	resultado = "-".equals(operacao) ? valor1 - valor2: resultado ;
	resultado = "*".equals(operacao) ? valor1 * valor2: resultado;
	resultado = "/".equals(operacao) ? valor1 / valor2: resultado;
	resultado = "%".equals(operacao) ? valor1 % valor2: resultado;
	
	
	System.out.printf("%.2f %s %.2f = %.2f",valor1 , operacao, valor2 , resultado );
	entrada.close();
	}
}
