package ooComposicao;

public class CompraTeste {
	public static void main(String[]args) {
		
		Compra compra1 = new Compra();
		
		compra1.cliente = "Laura";
		
		compra1.adicionarItem("Caneca", 2 , 23.1);
		compra1.adicionarItem("Borracha",4,1.12);
		compra1.adicionarItem("Lapis", 5 , 2.2);
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.obterValorTotal());
	
		//Rela��o bidirecional na pr�tica
		
		double total = compra1.itens.get(0).compra.itens.get(1).compra.obterValorTotal();
		
		System.out.println("O total � R$" + total);
	
		
	}
	
	
}
