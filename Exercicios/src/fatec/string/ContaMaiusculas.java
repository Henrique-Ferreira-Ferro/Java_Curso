package fatec.string;

import java.util.Scanner;
public class ContaMaiusculas {
	public static void main(String[]args) {
	
		Scanner entrada = new Scanner(System.in);
		
		String frase;
		
		int ContMaius = 0;
		
		System.out.print("Digite uma frase: ");
		
		frase = entrada.nextLine();
		
		for(int i = 0; i < frase.length(); i++) {
			
			Character letra = frase.charAt(i);
			
			if(Character.isUpperCase(letra)) {
				ContMaius++;
			}
			
		}
		
		System.out.println("A quantidade de letras maiusculas é: " + ContMaius);
		
		entrada.close();
	}
}
