package ooComposicao;

public class AlunoTeste {
	public static void main(String[]args) {
		
		
		Aluno aluno1 = new Aluno("Henrique");
		Aluno aluno2 = new Aluno("Icaro Ferro");
		Aluno aluno3 = new Aluno("Emilia Ferro");
	
		Curso curso1 = new Curso("Programação em Java");
		Curso curso2 = new Curso("Algoritimos");
		Curso curso3 = new Curso("Redes");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		curso1.adicionarAluno(aluno3);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		curso3.adicionarAluno(aluno2);
		
		
		aluno1.adicionarCurso(curso1);
		aluno1.adicionarCurso(curso2);
		
		for(Aluno aluno: curso1.Alunos) {
			System.out.println("Estou matriculado no " + curso1.nome);
			System.out.println("...e o meu nome é " + aluno.nome);
			System.out.println();
		}
		System.out.println(aluno1.cursos.get(0).Alunos);
		
		Curso cursoEncontrado  = aluno1.obterCursoPorNome("Programação em Java");
		
		if(cursoEncontrado != null) {
			
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.Alunos);
		}
		
	}
}
