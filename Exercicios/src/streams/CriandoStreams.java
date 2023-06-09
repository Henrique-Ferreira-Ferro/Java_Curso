package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	public static void main(String[]args) {
		
		Consumer<Object> print = System.out::print;
		
		Stream<String> langs = Stream.of("Java ", " Python ", " JS\n");
		langs.forEach(print);
		
		String[] maisLangs = {"Go ", "Lisp ", " PHP\n " };
		
		Stream.of(maisLangs).forEach(print);
		
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs,0,1).forEach(print);
		
		
		List<String> OutrasLangs = Arrays.asList("C", " Kotlin", " Ruby\n");
 		
		OutrasLangs.stream().forEach(print);
		OutrasLangs.parallelStream().forEach(print);		
		
		//Stream.generate(() -> "a").forEach(print); Infinito
		Stream.iterate(0, n -> n +1).forEach(print);
		
	}
}
