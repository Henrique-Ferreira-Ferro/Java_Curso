package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[]args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe seu primeiro sal�rio: ");
		String valor1 = entrada.nextLine().replace("," , ".");
		
		System.out.println("Informe seu segundo sal�rio: ");
		String valor2 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Informe seu terceiro sal�rio: ");
		String valor3 = entrada.nextLine().replace(", ", ".");
		
		double traducao1 = Double.parseDouble(valor1);
		double traducao2 = Double.parseDouble(valor2);
		double traducao3 = Double.parseDouble(valor3);
		
		double media = (traducao1+traducao2+traducao3)/3;
		
		System.out.println("A m�dia dos salarios �: "+ media);
	
		entrada.close();
	}
}
