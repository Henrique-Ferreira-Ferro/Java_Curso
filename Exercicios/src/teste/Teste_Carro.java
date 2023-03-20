package teste;

import desafio_Herança_OO.Ferrari;
import desafio_Herança_OO.Fusca;


public class Teste_Carro {
	public static void main(String[]args) {
	
		Ferrari carro1 = new Ferrari(100);
		
		System.out.println(carro1.velocidadeAtual);
		
		
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		carro1.ligarTurbo();
		carro1.desligarAr();
		
		System.out.println(carro1);
		System.out.println(carro1.velocidadeDoAr());
		
			Fusca carro2 = new Fusca();
			
			carro2.acelerar();
			carro2.acelerar();
			carro2.acelerar();
			carro2.acelerar();
			carro2.frear();
			
	
		System.out.println(carro2);

		
		
	}
}
