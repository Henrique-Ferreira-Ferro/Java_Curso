package desafio_Herança_OO;



public class Ferrari extends Carro implements Esportivo,Luxo{

	private boolean ligarTurbo = false;
	private boolean ligarAr = false;
	 
	
	@SuppressWarnings("unused")
	public Ferrari(){
		this(100);
	}
	
	public Ferrari(int VelocidadeMaxima){
		super(VelocidadeMaxima);
		setDelta(15);
	}
	
	public void ligarTurbo() {
		ligarTurbo = true;
	}
	
	public void desligarTurbo() {
		ligarTurbo = false;
	}
	
	public void ligarAr() {
		ligarAr = true;
	}
	
	public void desligarAr() {
		ligarAr = false;
	}
	
	
	public int getDelta() {
		
		if(ligarTurbo && !ligarAr) {
			return 35;
		}else if(!ligarTurbo && !ligarAr){
			return 20;
		}else if(ligarTurbo && ligarAr) {
			return 30;
		}else {
			return 15;
		}

	}
	
	
	
	
		// void acelerar() {
	//	super.acelerar();			 
	//}

	
}
