package estruturas_de_Controle;

import java.util.Scanner;

public class Desafio_Dia_semana {

	public static void main(String[]args) {

		//Domingo = 1
		//Segunda = 2
		//...
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ola seja bem-vindo :)");
		System.out.println("Digite um dia da semana: ");
		String semana = entrada.next();
		
		
		if("Domingo".equals(semana) ) {
			System.out.println("1");
			}else if("Segunda".equalsIgnoreCase(semana)) {
				System.out.println("2");
			}else if("Terça".equalsIgnoreCase(semana) || "Terca".equalsIgnoreCase(semana)) {
				System.out.println("3");
			}else if("Quarta".equalsIgnoreCase(semana)) {
				System.out.println("4");
			}else if("Quinta".equalsIgnoreCase(semana)) {
				System.out.println("5");
			}else if("Sexta".equalsIgnoreCase(semana)) {
				System.out.println("6");
			}else if("Sabado".equalsIgnoreCase(semana) || "Sábado".equalsIgnoreCase(semana)) {
			System.out.println("7");
		}else {
			System.out.println("Atento as recomendações:");
			System.out.println("Digite apenas os dias da semana!!!!!");
			System.out.println("Não escreva '-feira ', pois não é necessario!!! ");
		}
		
		entrada.close();
		
	}
	
}
