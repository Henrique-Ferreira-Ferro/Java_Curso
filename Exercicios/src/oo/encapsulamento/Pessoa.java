package oo.encapsulamento;

public class Pessoa {

	private String nome;
	private int idade;
	
	public Pessoa(String nome, int idade) {
		setNome(nome);
		setIdade(idade);
	}
	
	
	
	
	public String getNome() { //Criado pelo java de forma 
							//automatica
		return nome;
	}




	public void setNome(String nome) {//Criado pelo java de forma 
									//automatica
		this.nome = nome;
	}




	//Getter: Segue o nome get atras e na frente o atributo,
	//metodo, etc.. com a inicial maiuscula.
	public int getIdade() {
		return idade;
	}
	
	//Setter: Segue o nome get atras e na frente o atributo,
	//metodo, etc.. com a inicial maiuscula. Geralmente
	//não possui retorno 
	
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if(novaIdade >= 0 && novaIdade <= 100) {
			this.idade = novaIdade;
		}
	}
	
	
	@Override
	public String toString() {
		
		return "Ola eu sou o " + getNome() + " e tenho " + 
		getIdade() + " anos";
	}
	
	
}
