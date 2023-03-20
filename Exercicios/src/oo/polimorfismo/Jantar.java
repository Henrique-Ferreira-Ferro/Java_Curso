package oo.polimorfismo;

public class Jantar {
	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(60.24);
		
		Arroz ingrediente1 = new Arroz(0.245);
		Feijao ingrediente2 = new Feijao(0.300);
		Sorvete sobremesa = new Sorvete(0.500);
		Comida ingrediente3 = new Arroz(0.2);
		
		System.out.println(convidado.getPeso());
		convidado.comer(ingrediente1);
		convidado.comer(ingrediente2);
		convidado.comer(sobremesa);
		System.out.println(convidado.getPeso());
		
		
		
		
	}
}
