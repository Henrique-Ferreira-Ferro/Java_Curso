package fundamentos;

public class Tipos_primitivos {
	public static void main(String[]args) {
	
		
		
		
		byte vida = 19;
		short numeroVoos = 900;
		long pontos = 11_299_2122L;
		
		
		
		float salario = 1222.12F;
		int id = 30;
		double vendas = 2;
		
		
		
		boolean estadeFerias = true;
		
		char status = 'A';
		
		
		System.out.println(vida * 365);
		
		
		System.out.println(numeroVoos/2);
		
		System.out.println(pontos/vendas);
		
		System.out.println(id + ": ganha ->" + salario);
		
		System.out.println("Está de ferias? " + estadeFerias);
		
		System.out.println(status);
	}
}
