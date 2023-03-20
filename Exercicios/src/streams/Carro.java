package streams;

public class Carro {
	
	String nome;
	Boolean portas;
	Boolean motor = true;
	final double velocidade;
	
	public Carro(String nome ,Boolean portas, Boolean motor, double velocidade ) {
		
		this.nome = nome;
		this.portas = portas;
		this.motor = motor;
		this.velocidade = velocidade;
		
	}
	
}
