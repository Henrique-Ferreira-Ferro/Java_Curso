package colecoes;

import java.util.HashSet;


public class Hash {
	public static void main(String[]args) {

		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		

		usuarios.add(new Usuario("Pedro"));
		usuarios.add(new Usuario("Bruna"));
		usuarios.add(new Usuario("Laura"));
		usuarios.add(new Usuario("Leticia"));
		
		boolean resultado = usuarios.contains( new Usuario("Bruna"));
	
		System.out.println(resultado);
	
	}
}
