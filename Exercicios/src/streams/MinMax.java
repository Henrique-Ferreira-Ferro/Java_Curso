package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
	public static void main(String[]args) {
		
		Aluno a1 = new Aluno("Alonso", 9.5);
		Aluno a2 = new Aluno("Steve", 7.8);
		Aluno a3 = new Aluno("Luana", 6.5);
		Aluno a4 = new Aluno("Laura", 10.0);

		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);
		
		Comparator<Aluno> melhorNota = (Aluno1, Aluno2) -> {
			if(Aluno1.nota > Aluno2.nota) return 1;
			if(Aluno1.nota > Aluno2.nota) return -1;
			return 0;
		};
		
		System.out.println(alunos.stream().max(melhorNota).get());
		System.out.println(alunos.stream().min(melhorNota).get());

		
	}
}
