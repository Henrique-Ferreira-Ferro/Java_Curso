package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
	public static void main(String[]args) {
		
		Aluno a1 = new Aluno("Ana", 5.1);
		Aluno a2 = new Aluno("Bia", 8.1);
		Aluno a3 = new Aluno("Lia", 6.0);
		Aluno a4 = new Aluno("jack", 7.7);
		Aluno a5 = new Aluno("Erick", 7.8);
		Aluno a6 = new Aluno("Pedro", 5.5);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6);
		
		Predicate<Aluno> estaAprovado = a -> a.nota >= 7 ;
		
		Function<Aluno, String> frase = a -> "Parabens " + a.nome + " ! Você foi aprovado(a)" ;
		
		alunos.stream()
		.filter(estaAprovado)
		.map(frase)
		.forEach(System.out::println);
		
	}
}
