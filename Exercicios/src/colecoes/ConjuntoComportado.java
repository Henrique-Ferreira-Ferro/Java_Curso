package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[]args) {
		 
		//Set <String> listaAprovados = new HashSet <String>();
		Set <String> listaAprovados = new TreeSet<String>();
		
		listaAprovados.add("Teste");
		listaAprovados.add("Ana");
		listaAprovados.add("Laura");
		listaAprovados.add("Regiana");
		listaAprovados.add("Paula");
		
		for(String Alunos: listaAprovados) {
			System.out.println(Alunos);
		}
	
	
	}
}
