package desafio_Herança_OO;

public interface Luxo {
	void ligarAr();
	void desligarAr();
	default int velocidadeDoAr() {
		return 1;
	}
	
}
