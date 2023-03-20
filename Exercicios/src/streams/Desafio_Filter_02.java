package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Desafio_Filter_02 {
	public static void main(String[]args) {
		
		Produtos p1 = new Produtos("Garrafa Termica", 80.2, 0.30, true);
		Produtos p2 = new Produtos("Faca inquebravel", 200.2, 0.40 ,true);
		Produtos p3 = new Produtos("Ak-47", 4000.4, 0.25, false);
		Produtos p4 = new Produtos("Chocolate de 5 kg", 200.2, 0.50 ,false);
		Produtos p5 = new Produtos("Pistola", 500.2, 0.35, false);
		Produtos p6 = new Produtos("Coração de Dragão", 9200.2, 0.80 , true);
		
		List<Produtos> produtos = Arrays.asList(p1,p2,p3,p4,p5,p6);
		
		Predicate<Produtos> desconto = d -> d.desconto >= 0.30 ;
		Predicate<Produtos> frete = f -> f.freteGratis == true;
		
		
		Function<Produtos, String> CalcFrase = cf -> cf.nome + " custanto : " + Double.parseDouble(String.format("%.2f",(cf.preco - (cf.desconto * cf.preco)) ))  +
				". Teve uma super promoção !!!!!!! "  ;
		
		
		produtos.stream()
		.filter(desconto)
		.filter(frete)
		.map(CalcFrase)
		.forEach(System.out::println);
	}
}
