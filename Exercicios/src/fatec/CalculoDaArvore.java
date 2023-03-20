package fatec;

public class CalculoDaArvore {
	public static void main(String[]args) {
		
		double arvore1 = 1.50;
		double arvore2 = 1.10;
		double crescimentoDaArvore1 = 0.02;
		double crescimentoDaArvore2 = 0.03;
		
		int tempo = 0;
		
		while(arvore1 > arvore2) {
			arvore1 += crescimentoDaArvore1;
			arvore2 += crescimentoDaArvore2;
			tempo++;
		}
		
		System.out.println(tempo);
		
		
	}
}
