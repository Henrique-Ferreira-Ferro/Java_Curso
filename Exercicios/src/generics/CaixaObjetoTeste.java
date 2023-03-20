package generics;

public class CaixaObjetoTeste {

	public static void main(String[] args) {
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.1); //double -> Double
		
		
		Double coisa = (Double) caixaA.abrir();
		System.out.println(coisa);
		
		
		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.guardar("Oi");
	
		String fala = (String) caixaB.abrir();
		
		System.out.println(fala);
		
	}
	
	
}
