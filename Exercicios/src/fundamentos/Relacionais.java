package fundamentos;

public class Relacionais {
	public static void main(String[]args) {
		
		var nota = 9.2;
		var bomComportamento = true;
		var passou = nota >= 9;
		boolean passeio = bomComportamento && passou;
		
		System.out.println("O aluno vai pro passeio? " 
				+ passeio);		
	}
}
