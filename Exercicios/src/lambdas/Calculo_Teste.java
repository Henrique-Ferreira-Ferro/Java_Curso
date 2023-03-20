package lambdas;

public class Calculo_Teste {
	public static void main(String[]args) {
	
	//Calculo soma = new Soma();
		
	//	System.out.println(soma.executar(2, 4));
		
	//	Calculo multiplicar = new Multiplicar();
		
	//	System.out.println(multiplicar.executar(3, 3));
		

		Calculo calculo = new Soma();
		
		System.out.println(calculo.executar(2, 3));
		
		calculo = new Multiplicar();
		
		System.out.println(calculo.executar(2, 3));
		
		
		
	}
		
}
