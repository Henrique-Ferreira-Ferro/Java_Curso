package teste;

import ooHeranca.Heroi;
import ooHeranca.Monstro;

public class Jogo   {

	public static void main(String[] args) {
		Monstro monstro = new Monstro();
		
		monstro.x = 10;
		monstro.y = 10;
		
		
		Heroi heroi = new Heroi(10, 11);
		
		
		
		System.out.println("A vida do monstro é : " + monstro.vida);
		System.out.println("A vida do Heroi é : " + heroi.vida);

		
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);


		System.out.println("A vida do monstro é : " + monstro.vida);
		System.out.println("A vida do Heroi é : " + heroi.vida);		
		
		
	}
	
}
