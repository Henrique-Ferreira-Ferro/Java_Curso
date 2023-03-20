package excecao.personalizadaB;

import excecao.Aluno;

public class TesteValidacoes {
	public static void main(String[]args) {
		
		try {
			Aluno aluno = new Aluno(" Ana  ", 0);
			Validaf.aluno(aluno);
			
			Validaf.aluno(null);
			
		}catch(StringVaziaException | NumeroForaIntervaloException e) {
			System.out.println(e.getMessage());
		}catch(IllegalArgumentException e ) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("Fim ");
	}
}
