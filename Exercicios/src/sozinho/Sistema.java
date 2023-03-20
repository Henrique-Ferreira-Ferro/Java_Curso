package sozinho;

public class Sistema {
	public static void main(String[]args) {
		
		
		Cliente cliente = new Cliente("Icaro Ferreira Ferro");
		
		Compra compra1 = new Compra();
		
		compra1.adicionarItem("Caneta", 9.14, 12);
		compra1.adicionarItem("Celular", 1223, 1);
	
		Compra compra2 = new Compra();
		

		compra2.adicionarItem("Câmera", 1223.1, 1);
		compra2.adicionarItem("luz", 1223.1, 1);
		compra2.adicionarItem("Caixa de Ferramenta", 1223.1, 1);
		
		
		cliente.adicionarCompra(compra1);
		cliente.Compras.add(compra2);
		
		System.out.println(cliente.ObterValorTotal());
	}
}
