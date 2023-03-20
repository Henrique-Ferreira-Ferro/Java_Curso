package excecao;

import java.lang.RuntimeException;

public class ChecadaVsNaoChecada {
	public static void main(String[] args) {
		
		try{
			geraErro1();
		}catch(RuntimeException e){
			System.out.println(e.getMessage());
		}
		
		try {
			geraErro2();
		}catch(Throwable e) {
			System.out.println(e.getMessage());
		}
		
		
		
		System.out.println("Fim :) ");
		
	}
	
	// Exce��o N�o checada ou n�o verificada
	static void geraErro1() throws RuntimeException {
		
		throw new RuntimeException("Ocorreu um erro");
		
	}
	
	//Exce��o checada ou verificada
	static void geraErro2() throws Exception{
		throw new Exception("Ocorreu um erro bem legal");
	}
	
}
