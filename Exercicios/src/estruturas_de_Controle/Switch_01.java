package estruturas_de_Controle;

public class Switch_01 {
	public static void main(String[]args) {
		String faixa = "preta";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o golpe x...");
		case "Marrom":
			System.out.println("Sei o golpe y....");
		case"verde":
			System.out.println("Sei o golpe a....");
			default:
				System.out.println("Não sei lutar ;-;");
		}
	}
}
