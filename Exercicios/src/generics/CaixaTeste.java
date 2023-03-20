package generics;

public class CaixaTeste {
	public static void main(String[]args) {
		
		Caixa<String> caixaA = new Caixa<>();
		caixaA.guardar("Segredo patrão");
		
		String coisaA = caixaA.abrir();
		System.out.println(coisaA);
		
		
		Caixa<Integer> caixaB = new Caixa<>();
		caixaB.guardar(2);
		
		Integer coisaB = caixaB.abrir();
		
		System.out.println(coisaB);
	}
}
