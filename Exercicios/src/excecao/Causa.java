package excecao;

public class Causa {
	public static void main(String[] args) {
		
		try{
			metodoA(null);
		}catch(IllegalArgumentException e) {
			if(e.getCause() != null) {
				System.out.println(e.getCause().getMessage());
			}
		}
		
		
	}
	
	
	static void metodoA(Aluno aluno) {
		try{
			metodoB(aluno);
		}catch(Exception Causa) {
			throw new IllegalArgumentException(Causa);
		}
	}
	
	static void metodoB(Aluno aluno) {
		if(aluno == null) {
			throw new NullPointerException("Aluno est� NUULOOO");
		}
		System.out.println(aluno.nome);
	}
	
}
