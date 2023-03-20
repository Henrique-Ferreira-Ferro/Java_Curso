package ooComposicao;

import java.util.ArrayList;

public class Compra {

	
	String cliente;
	ArrayList<Item> itens = new ArrayList<Item>();
	
	void adicionarItem(Item item) {
		this.itens.add(item); //adiciona o item a lista e tambem faz o contrario 
		item.compra = this;	// onde adiciona a compra associada ao item passando o objeto 
							//atual (this)
	}
	
	void adicionarItem(String nome, int quantidade, double preco) {
		this.adicionarItem(new Item(nome, quantidade, preco));
		
		//por meio desse metodo podemos receber os atributos
		//Assim em compra teste não precisamos criar uma 
		//nova instancia com o new item por exemplo
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Item item: itens) {
			total += item.quantidade * item.preco;
		}
		
		return total;
		
	}
	
}
