package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	public static void main(String[]args) {
		
		List<Usuario> lista = new ArrayList<Usuario>();
		
		Usuario u1 = new Usuario("Ana"); //Criar o usuario
		lista.add(u1); //Adicionar a coleção
		
		Usuario u2 = new Usuario("Guilherme Silva"); //Criar o usuario
		lista.add(u2); //Adicionar a coleção
		
		
		lista.add(new Usuario("Alucard")); //Criar e já adicionar
		lista.add(new Usuario("Azevedo")); //Criar e já adicionar
		lista.add(new Usuario("Brandão")); //Criar e já adicionar
		lista.add(new Usuario("João Pereira")); //Criar e já adicionar
		lista.add(new Usuario("João Vitor")); //Criar e já adicionar
		lista.add(new Usuario("Marcelo Bruno")); //Criar e já adicionar
		
		System.out.println(lista.get(3));
		//lista.remove(3); remove porem mostra quem removeu
		System.out.println(lista.remove(new Usuario("Ana")));
		System.out.println(lista.contains(new Usuario("Ana")));
		
		for(Usuario u: lista) {
			System.out.println(u);
		}
		
		
	}
}
