package desafio_Heran�a_OO;

public interface Luxo {
	void ligarAr();
	void desligarAr();
	default int velocidadeDoAr() {
		return 1;
	}
	
}
