package estruturas_de_Controle;

import java.util.Scanner;

public class Switch_2_Break {
	public static void main(String[]args) {

	Scanner entrada = new Scanner(System.in);
	
		String conceito = "";
		System.out.println("Informe a nota: ");
		int nota = entrada.nextInt();
	
		switch(nota){
			case 10:
				conceito = "A";
				break;
			case 9:
				conceito = "B";
				break;
			default:
				conceito = "c";
				break;
		}
			System.out.println("Conceito é: " + conceito);
	
	}
}
