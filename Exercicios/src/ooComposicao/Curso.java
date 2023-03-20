package ooComposicao;

import java.util.ArrayList;

public class Curso {
	final String nome;
	
	final  ArrayList<Aluno> Alunos = new ArrayList<Aluno>();
	
	Curso(String nome){
		this.nome = nome;
	}
	
	void adicionarAluno(Aluno aluno) {
		this.Alunos.add(aluno);
		aluno.cursos.add(this);
	}
	
	
	
}
