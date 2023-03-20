package excecao;

public class Basico {
	public static void main(String[]args) {
		
		Aluno a1 = null;
		
		try {
			imprimirAlunno(a1);

		}catch(Exception exececao) {
			System.out.println("Ocorreu um erro ao imprimir o nome");
		}
		
		
		try {
			System.out.println(7/0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}
	
	public static void imprimirAlunno(Aluno aluno) {
		
		System.out.println(aluno.nome);
		
	}
	
}
