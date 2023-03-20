package estruturas_de_Controle;

public class Break_01 {
	public static void main(String[] args) {
		
		int i = 0;
		
		for(;i <10; i++){
			if(i == 5) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("fim");
	}
}
