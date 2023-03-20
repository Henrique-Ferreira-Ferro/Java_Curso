package oo.abstrato;

public class TesteAbstrato {
	public static void main(String[]args) {
		
		
		Mamifero Dog1 = new Cachorro();
		
		System.out.println(Dog1.mamar());
		System.out.println(Dog1.mover());
		System.out.println(Dog1.respirar());
		
		
		
	}
}
