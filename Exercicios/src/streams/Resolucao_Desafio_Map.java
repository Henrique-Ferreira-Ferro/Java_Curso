package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Resolucao_Desafio_Map {
	public static void main(String[]args) {
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

		
		UnaryOperator<String> inverter =
				texto -> new StringBuilder(texto).reverse().toString();
				
		Function<String, Integer> binarioParaInt =
				s -> Integer.parseInt(s,2);
		
		nums.stream()
		.map(Integer::toBinaryString)
		.map(inverter)
		.map(binarioParaInt)
		.forEach(System.out::println);
		
	}
}
