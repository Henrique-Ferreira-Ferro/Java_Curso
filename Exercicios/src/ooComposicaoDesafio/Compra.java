package ooComposicaoDesafio;

import java.util.ArrayList;

public class Compra {

	final ArrayList<Item> itens = new ArrayList<Item>();
	
	
	void adicionaritem(Produto p , int quantidade) {
		this.itens.add(new Item(p,quantidade));
	}
	
	void adicionaritem(String nome , int quantidade, double preco) {
		
		var Produto = new Produto(nome, preco);
		
		this.itens.add(new Item(Produto,quantidade));
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Item item: itens) {
			total += item.quantidade * item.produto.preco;
		}
		
		return total;
	}
}
