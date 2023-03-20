package classe;


public class Desafio_Trauma {

	int a = 3;  //não pode mexer aqui
	static int b = 4;
	
	public static void main(String[]args) {
	
		
		
		Desafio_Trauma a = new Desafio_Trauma();
	
		
		
		System.out.println(a.a);
		System.out.println(b);
		
		
		/*
		 * Acessar uma váriavel de instância transformando em estatico
		 * como está na variavel b. Algo estatico pode acessar algo estatico.
		 * 
		 * No caso se você não quer transformar em um membro estatico uma 
		 * variavel de instancia, terá que criar uma estancia, como feito
		 * na linha 13
		 */
	}
	
}
