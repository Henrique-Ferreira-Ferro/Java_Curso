package sozinho;

import java.util.ArrayList;

public class Cliente {

	final String nome;
	
	Cliente(String nome){
		
		this.nome = nome;
	}
	
	
	void adicionarCompra(Compra compra) {
		this.Compras.add(compra);
	}
	
	final ArrayList<Compra> Compras = new ArrayList<Compra>();
	
	double ObterValorTotal() {
		double total = 0;
	
		for(Compra comprado : Compras) {
			
			total += comprado.ObterValorTotal();
			
		}
		
		return total;
	}
	
}
