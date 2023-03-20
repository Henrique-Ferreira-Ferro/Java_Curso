package classe_Desafio;

public class Jantar {
	public static void main(String[]args) {
		
		
		
		Comida d1 = new Comida("Arroz", 0.1241);
		Comida d2 = new Comida("Frango", 100.22);
		
		Pessoa n1 = new Pessoa("Luis", 70.1);
		
		n1.Comer(d1);
		System.out.println(n1.apresentar());
		
		
		
		
	}
}
