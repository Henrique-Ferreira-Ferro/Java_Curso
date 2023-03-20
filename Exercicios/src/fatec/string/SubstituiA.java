package fatec.string;


import java.util.Scanner;
public class SubstituiA {
	public static void main(String[]args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite algo: ");
		
		String algo = entrada.next().toUpperCase();
		
		System.out.println(algo.replace("A","*"));
		
		
		entrada.close();
	}
}
