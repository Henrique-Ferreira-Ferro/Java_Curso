package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Ator;
import modelo.muitospramuitos.Filme;

public class NovoFilmeAtor {
	public static void main(String[] args) {
		
		Filme filmeA = new Filme("Star Plation", 8.9);
		Filme filmeB = new Filme("Azar", 9.9);
		
		
		Ator atorA = new Ator("Alucard l");
		Ator atrizB = new Ator("Carrie V");
		
		
		filmeA.adicionarAtor(atorA);
		filmeA.adicionarAtor(atrizB);
		
		
		filmeB.adicionarAtor(atorA);
		
		DAO<Filme> dao = new DAO<Filme>();
		
		dao.incluirAtomico(filmeA);
	
	}
}
