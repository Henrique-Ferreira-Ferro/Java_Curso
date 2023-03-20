package fundamentos;

public class DesafioOperadores {
	public static void main(String[]args) {
		
		//Primeira Etapa
		double etapaOne = (6*(3+2)); 
		double etapaTwo = Math.pow(etapaOne, 2);
		double etapaThree = etapaTwo/6;
		
		//System.out.println(etapaThree);
		
		//Segunda etapa
		
		double etapaFour = ((1-5)*(2-7))/2;
		double etapaFive = Math.pow(etapaFour, 2); 
		
		//System.out.print(etapaFive);
		
		//Terceira etapa
		
		double etapaSix = etapaThree - etapaFive;
		double etapaSeven = Math.pow(etapaSix, 3);
		double etapaEight = Math.pow(10,3 );
		
		double etapaNine = etapaSeven/etapaEight;
		System.out.println(etapaNine);
		
	}
}
