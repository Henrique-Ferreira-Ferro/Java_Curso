package lambdas;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioFinal {
	public static void main(String[]args) {
	
	

	Function<Produto,Double> precoFinal = 
			precoF -> precoF.preco * (1- precoF.desconto);
	
	UnaryOperator<Double> ImpostoMunicipal = 
			
			//preco Com imposto
		precoCI -> precoCI >= 2500 ? precoCI* 1.085 : precoCI;
		
	UnaryOperator<Double> Frete = 
			
		precoCIF -> precoCIF >= 3000 ? precoCIF + 100 : precoCIF + 50;
		
	UnaryOperator<Double> Arredondar = 
			
		precoCIFA -> Double.parseDouble(String.format("%.2f", precoCIFA)); 
		
	Function<Double, String> Formatar = 
			
			precoFinalFormatado -> ("R$ " + precoFinalFormatado).replace(".", ",");
			
	Produto p = new Produto("Ipad", 3000.1, 0.12);
	String preco = precoFinal
				.andThen(ImpostoMunicipal)
				.andThen(Frete)
				.andThen(Arredondar)
				.andThen(Formatar)
				.apply(p);
	
	System.out.println("O preco final é: " + preco);
	
	}	
}
