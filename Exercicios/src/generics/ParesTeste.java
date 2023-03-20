package generics;

public class ParesTeste {
	public static void main(String[] args) {
		Pares<Integer, String> resultadoConcurso = new Pares<>();
	
	resultadoConcurso.adicionar(1, "Maiary");
	resultadoConcurso.adicionar(2, "Milena");
	resultadoConcurso.adicionar(3, "Jesus");
	resultadoConcurso.adicionar(4, "Pedro Henrique");
	resultadoConcurso.adicionar(2, "Laura Gabriela");

	System.out.println(resultadoConcurso.getValor(1));
	System.out.println(resultadoConcurso.getValor(2));
	System.out.println(resultadoConcurso.getValor(3));

	
	
	}
}
