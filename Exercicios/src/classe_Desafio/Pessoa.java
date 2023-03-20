package classe_Desafio;

public class Pessoa {
	
	String nome;
	double peso;
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	void Comer(Comida Comida) {
		if(Comida != null) {
			this.peso += Comida.peso;
		}
		
	}
	
	String apresentar() {
		return "Olá eu sou " + nome + " e tenho " + peso + " Kgs."  ;
	}
	
}
