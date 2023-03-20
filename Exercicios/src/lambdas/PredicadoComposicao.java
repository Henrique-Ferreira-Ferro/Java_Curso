package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {

	public static void main(String[]args) {
		Predicate<Integer> isPar = numero ->
		numero % 2 == 0;  
		
		System.out.println(isPar.test(55));
		
		Predicate<Integer> isTresDigitos = numero -> 
		numero >= 100 && numero <= 999;
		
		System.out.println(isTresDigitos.test(411));
		
		System.out.println(isPar.and(isTresDigitos).test(22));
		System.out.println(isPar.or(isTresDigitos).test(244));
		System.out.println(isPar.or(isTresDigitos).negate().test(244));
	
	}
	
}
