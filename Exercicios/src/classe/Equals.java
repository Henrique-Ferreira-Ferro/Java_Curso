package classe;
public class Equals {
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		
		u1.nome = "Pedro";
		u1.email= "pedro@gmail.com.br";
		
		Usuario u2 = new Usuario();
		
		u2.nome = "Pedro";
		u2.email= "pedro@gmail.com.br";

		System.out.println(u1.equals(u2));
		//System.out.println(u2.equals(new Data()));
	}
}
