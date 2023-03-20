package fatec;

public class Multiplo {
	public static void main(String[]args) {
		
		int cemP = 0;
		int valorIni = 13;
		int cont;
		int calc;
		while(cemP < 100 ) {
			for(cont = 100; cemP <= cont ; cemP++ ) {
				calc = cemP * valorIni ;
				System.out.println(calc);
			
			}
		}
		
	}
}
