package lambdas;

/*
 * Criador: Henrique Ferreira Ferro
 * Desafio Proposto  
 * Status: Não resolvido da maneira correta
 * Data de inicio: 15/12/22 
 * Data de Termino: 19/12/22
 * 
 */

//import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Desafio_BinaryOperator {
	public static void main(String[] args) {
		
		
		Produto p = new Produto("Ipad", 4300.1, 0.20);

		UnaryOperator<Double> ProdutoDesconto = 
				precoFinal -> p.preco * (1 - p.desconto);
		
		UnaryOperator<Double> Imposto =
		precoFinal -> {
			
			if(precoFinal >= 2500.0) {
				precoFinal = precoFinal +(precoFinal * 0.085);
				//double desconto = p.desconto * 100;
				
				System.out.printf("O produto tinha como valor: %.2f", p.preco );
				
			}
			
			return precoFinal ;
		};
		
		UnaryOperator<Double> Frete = precoFinal ->
		{
			
			if(precoFinal >= 3000.0) {
				precoFinal += 100;
				System.out.printf(". Com os descontos e somado ao frete da entrega, o valor foi para: R$ %.2f\n\n", precoFinal);
	
			}
			return null;
		};
		
		
	System.out.println(ProdutoDesconto.andThen(Imposto).andThen(Frete).apply(p.preco));
		
		
		/*
	 * 1. A partir do produto calcular o preco real(com desconto)
	 * 2. Imposto municipal: >= 2500(8,5%)/ < 2500 (isento)
	 * 3. Frete: >= 3000 (100)/ < 3000 (50)
	 * 4. Arredondar: Deixar duas casas decimais
	 * 5. Formatar: R$ 1234,54
	 * 
	 */
		
		
	}
}
