package lambdas;

import java.util.function.Function;

public class Funcão {
	public static void main(String []args) {
		
		Function<Integer, String> parOuImpar = 
				numero -> numero % 2 == 0 ? "Par": "impar";

		System.out.println(parOuImpar.apply(33));
	
		Function<String, String> OResultadoE = 
				valor -> "O resultado é: " + valor;
				
		Function<String,String> empolgado =
				valor -> "!!!!!!";
		
				
		String resultadoFinal = parOuImpar
				.andThen(OResultadoE)
				.andThen(empolgado)
				.apply(33);
		
		
		System.out.println(resultadoFinal);
		
		
		
	}
}
