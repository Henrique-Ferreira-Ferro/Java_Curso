package colecoes;

import java.util.Deque;
import java.util.ArrayDeque;

public class Pilha {
	
	public static void main(String[]args) {

	Deque<String> livros = new ArrayDeque<String>();
	
	
	livros.push ("As tran�as do rei careca");
	livros.push("A lenda da mula com cabe�a");
	livros.push("A menina que roubava livros");
	livros.push("O Pequeno Pr�ncipe");
	
	System.out.println(livros.poll());
	System.out.println(livros.pop());

	
	}
}
