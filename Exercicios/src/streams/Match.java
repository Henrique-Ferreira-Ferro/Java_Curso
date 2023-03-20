package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
	public static void main(String[]args) {
		

		Aluno a1 = new Aluno("Alonso", 9.5);
		Aluno a2 = new Aluno("Steve", 7.8);
		Aluno a3 = new Aluno("Luana", 7.5);
		Aluno a4 = new Aluno("Laura", 9.8);

		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);
		
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7.0;
		
		System.out.println(alunos.stream().allMatch(aprovado));
		System.out.println(alunos.stream().anyMatch(aprovado));
		System.out.println(alunos.stream().noneMatch(aprovado));
		
	
	}
}
