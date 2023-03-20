package colecoes;

import java.util.Deque;
import java.util.ArrayDeque;

public class Pilha {
	
	public static void main(String[]args) {

	Deque<String> livros = new ArrayDeque<String>();
	
	
	livros.push ("As tranças do rei careca");
	livros.push("A lenda da mula com cabeça");
	livros.push("A menina que roubava livros");
	livros.push("O Pequeno Príncipe");
	
	System.out.println(livros.poll());
	System.out.println(livros.pop());

	
	}
}
