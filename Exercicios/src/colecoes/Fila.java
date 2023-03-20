package colecoes;

import java.util.Queue;
import java.util.LinkedList ;

public class Fila {
	public static void main(String[]args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Ana");
		fila.offer("Lia"); //Adiciona o elemento porem não retorna erro caso passe do limite 
		fila.offer("Mel");
		fila.offer("Mia");
	
		System.out.println(fila.peek()); //retorna null quando a fila estiver vazia
		System.out.println(fila.element());//retorna um erro quando a fila estiver vazia
		
		System.out.println(fila.poll()); //Pega o elemento e ja remove da lista
		System.out.println(fila.poll());
		System.out.println(fila.remove()); //Faz o mesmo que o poll mas retorna um erro quando não tem
		
		
	}
}
