package classe;

public class Produto_Teste {
	public static void main(String[]args) {
		
		Produto p1 = new Produto("Xbox One");
	
			p1.preco = 2000.0;
			Produto.desconto = 0.45;
		
			double precoFinal1 = p1.precoComDesconto();
			System.out.println("Oferta de natal: "+ precoFinal1);
		
		var p2 = new Produto("Celular");
		
		p2.preco = 3000.0;
		
		double precoFinal2 = p2.precoComDesconto();
		
		System.out.println(precoFinal2);
	}
}
