package ooComposicaoDesafio;

public class Sistema {
	public static void main(String[]args) {
		
		Cliente cliente = new Cliente("Henrique Ferreira  Ferro");
		
		
		Compra compra1 = new Compra();
		compra1.adicionaritem("Lapis", 3, 1);
		compra1.adicionaritem("notebook", 5, 1);
		compra1.adicionaritem("camera", 2, 1);
		

		Compra compra2 = new Compra();
		compra2.adicionaritem("borracha", 3, 1);
		compra2.adicionaritem("celular", 5, 1 );
		compra2.adicionaritem("Micro-ondas", 2, 1);
		
		
		cliente.adicionarCompra(compra1);
		cliente.compras.add(compra2);
		
		System.out.println(cliente.obterValorTotal());
		
	}
}
