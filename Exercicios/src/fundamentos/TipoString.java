package fundamentos;

public class TipoString {
	public static void main(String[]args) {
		System.out.println("Olá cavaleiros".charAt(0));
		
		System.out.println("Bom dia".concat("!!!"));
		
		String s = "Bom dia";
		System.out.println(s.toLowerCase().startsWith("bom"));
		System.out.println(s.endsWith("dia"));
		System.out.println("\n\n");
	
		var nome = "Pedro";
		var sobrenome = "Alucard";
		var idade = 20;
		var salario = 3000.0;
		
		System.out.printf("O senhor %s %s tem %d de idade "
				+ " e ganha"
				+ " %.2f. ", nome, sobrenome,idade,salario);
		
		System.out.println("\n");
		String frase = String.format("O senhor %s %s tem %d de idade  e ganha %.2f. ", nome, sobrenome,idade,salario);
		
		System.out.println(frase);
		
		
	}		
}
