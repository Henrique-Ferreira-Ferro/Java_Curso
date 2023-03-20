package fundamentos;

public class DesafioLogico {
	
	public static void main(String[] args) {
		//Trabalho na terça (v ou f)
		//Trabalho na quinta (v ou f)
		
		/*	Se ambos os trabalhos forem feitos a 
			familha vai ao shopping comprar uma 
			tv de 50 p e ainda vai tomar sorvete.
			Se apenas um trabalho for feito a 
			familha ira comprar uma de 30 p e irá 
			tomar sorvete. Caso nenhum trabalho ocorra
			a familha permanece em casa.
		*/
		
		
		boolean trabalhoTerca = true;
		boolean trabalhoQuinta = true;
		System.out.println(trabalhoTerca ||trabalhoQuinta);
		
		System.out.println("A familha comprou a tv de 50p e "
				+ "tomou sorvete");
	
		System.out.println("");
		
		System.out.println(!trabalhoTerca || trabalhoQuinta);
		System.out.println("A familha comprou a tv de 30p e "
				+ "tomou sorvete ");
		
		System.out.println("");
		
		System.out.println(!trabalhoTerca || !trabalhoQuinta);
		System.out.println("A familha ficou em casa e "
				+ "ficou mais saudavel, porêm sem sorvete :(");
	}
}
