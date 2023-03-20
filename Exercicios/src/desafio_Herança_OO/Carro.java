package desafio_Herança_OO;

public class Carro {
	
	 public final int Velocidade_Maxima;
	 public int velocidadeAtual;
	 private int delta = 5;
	
	 
	 protected Carro(){
		this(190);
	}
	
 	protected Carro(int VelocidadeMaxima){
		Velocidade_Maxima = VelocidadeMaxima;
	}
	
	
	
	
	public void acelerar() {
		
		if(velocidadeAtual + getDelta() > Velocidade_Maxima) {
			velocidadeAtual = Velocidade_Maxima;
		}else {
		
			velocidadeAtual += getDelta();
		}
		
		
	}
	public  void frear() {	
		if(velocidadeAtual >= 5) {
			velocidadeAtual -= 5 ;
		}else {
			 velocidadeAtual = 0 ;
		}
	}
	
	public String toString() {
		return "Velocidade atual é " + velocidadeAtual + "Km/h"; 
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	
	
}
