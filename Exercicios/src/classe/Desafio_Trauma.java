package classe;


public class Desafio_Trauma {

	int a = 3;  //n�o pode mexer aqui
	static int b = 4;
	
	public static void main(String[]args) {
	
		
		
		Desafio_Trauma a = new Desafio_Trauma();
	
		
		
		System.out.println(a.a);
		System.out.println(b);
		
		
		/*
		 * Acessar uma v�riavel de inst�ncia transformando em estatico
		 * como est� na variavel b. Algo estatico pode acessar algo estatico.
		 * 
		 * No caso se voc� n�o quer transformar em um membro estatico uma 
		 * variavel de instancia, ter� que criar uma estancia, como feito
		 * na linha 13
		 */
	}
	
}
