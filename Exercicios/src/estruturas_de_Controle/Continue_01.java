package estruturas_de_Controle;

public class Continue_01 {
	public static void main(String[]args) {
		
		for (int i = 0; i <10 ; i++){
			if(i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}
			
	}
}
