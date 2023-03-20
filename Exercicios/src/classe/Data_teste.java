package classe;

public class Data_teste {
	public static void main(String [] args) {
		
	Data n1 = new Data();
	
	//n1.ano = 2028;
	//n1.dia = 12;
	//n1.mes = 07;
	
	System.out.println(n1.obterDataFormatada());
		
	var n2 = new Data();
	
	n2.ano = 300;
	n2.dia = 31;
	n2.mes = 12;
	
	System.out.println(n2.obterDataFormatada());
	
	}
}
