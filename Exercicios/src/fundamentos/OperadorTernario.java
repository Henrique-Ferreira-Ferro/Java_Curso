package fundamentos;

public class OperadorTernario {
	public static void main(String[]args) {
		
		double media = 4.5;
		
		String resultadoParcial = media >=5.0 ? "Em recupera�ao" : "Reprovado";
		String resultadoFinal = media >= 7.5 ? "Aprovado" : resultadoParcial;
		
		System.out.println("O aluno est�: " + resultadoFinal);
	}
}
