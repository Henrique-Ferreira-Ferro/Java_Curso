package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.lang.StringBuilder;

public class DesafioMap {
	public static void main(String[]args) {
		
		Consumer<Object> print = System.out::println;
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		UnaryOperator<String> inverter =
				i -> new StringBuilder(i).reverse().toString();
		
				
		
	nums.stream().map(n -> Integer.toBinaryString(n)).map(inverter).
	map(c -> Integer.parseInt(c, 2)).forEach(print);
		 
	
		
	
		
		
		/*
		 * 1.Número para String binária... 6 => "110" -----> map(n -> Integer.toBinaryString(n))
		 * 2. inverter a string... "110" => "011" 	------>	map(i -> new StringBuilder(i).reverse().toString())
		 * 3. Converter de volta para inteiro => "011" => 3
		 *	
		 *dica: use integer.
		 */
		
		
	}
}
