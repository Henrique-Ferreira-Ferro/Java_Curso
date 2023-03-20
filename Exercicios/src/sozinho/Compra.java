package sozinho;

import java.util.ArrayList;

public class Compra {
	final ArrayList<Item> Itens = new ArrayList<Item>();

	void adicionarItem(Produto p,int quantidade) {
		this.Itens.add(new Item(p,quantidade));
		
	}
	
	void adicionarItem(String nome, double preco, int quantidade) {
		var Produto = new Produto(nome, preco);
		this.Itens.add(new Item(Produto, quantidade));
	}

	double ObterValorTotal() {
		double total = 0;
		
		for(Item item: Itens ) {
			total += item.quantidade * item.produto.preco ;
		}
		
		return total; 
	}
	
}
