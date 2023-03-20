package classe;

public class ValorVsReferencia {
	public static void main(String[]args) {
		
		double a = 2;
		double b = a; // Atribuição por valor
		
		Data d1 = new Data(1,6,2022);
		
		Data d2 = d1; // Atribuição por referência
		
		d1.mes = 7;
		d2.dia = 9;
		d1.ano = 2025;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
	
		int c = 5;
		alterarPrimitivos(c);
		System.out.println(c);
		
	}
	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1976;
	}
	
	
	static void alterarPrimitivos(int c) {
	
		c++;
		
	}
	
}
