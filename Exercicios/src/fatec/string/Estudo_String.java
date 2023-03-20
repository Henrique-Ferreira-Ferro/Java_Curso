package fatec.string;

import java.util.Scanner;

public class Estudo_String {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		String java = entrada.next();
		
		for(int i = 0; i < java.length(); i++) {
			
			System.out.println(java.charAt(i));
			
		}
		
	}

}
