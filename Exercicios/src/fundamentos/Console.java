package fundamentos;
import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
	
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Digite seu nome: ");
	String nome = teclado.nextLine();
	System.out.println("Digite o número do seu celular");
	int idade = teclado.nextInt();
	teclado.nextLine(); //Pega o valor do enter e joga para baixo
	System.out.println("Digite abaixo o porque de nos escolher");
	var motivo = teclado.nextLine();
	
	teclado.close();
	
	
	System.out.println("Bom dia".charAt(1));
	
	}
}