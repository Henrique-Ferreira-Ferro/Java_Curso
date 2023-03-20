package br.com.empresa.app.calculo;

import br.com.empresa.app.Calculadora;
import br.com.empresa.app.calculo.interno.OperacoesAritmeticas;
import br.com.empresa.app.logging.Logger;

public class CalculadoraImpl implements Calculadora{

	
	private String id = "abc";
	
	
	private OperacoesAritmeticas opAritimeticas = new OperacoesAritmeticas();
	
	public double soma(double... nums) {
	
		Logger.info("Somando....");
		return opAritimeticas.soma(nums);
	}
	
	public String getId() {
		return id;
	}
	
}
