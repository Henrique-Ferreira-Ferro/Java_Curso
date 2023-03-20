package fatec.string;


import java.util.Scanner;

public class Histograma {
	public static void main(String[]args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um texto: ");
	
		String texto = entrada.nextLine();
		
		int contA = 0, contE = 0, contI = 0, contO = 0, contU = 0;
		
		
			
		char frequencia[] = new char[5];
		for(int i = 0; i < texto.length(); i++) {
			char converte = texto.toUpperCase().charAt(i);
			
			switch(converte) {
			case 'A':
				contA ++;
			
			break;
			case 'B':
				contE++;
			break;
			case 'C':
				contI++;
			break;
			case 'O':
				contO++;
			break;
			case 'U':
				contU++;
			break;
			
			}
			
			
		}
		
		System.out.println("a: " + contA);
		System.out.println("e: " + contE);
		System.out.println("i: " + contI);
		System.out.println("o: " + contO);
		System.out.println("u: " + contU);

		
		entrada.close();
	}
}
