import br.com.empresa.app.Calculadora;
import br.com.empresa.app.calculo.CalculadoraImpl;

module app.calculo {
	
	exports br.com.empresa.app.calculo;
	requires app.logging;
	
	exports br.com.empresa.app.calculo.interno
		to app.financeiro;
	
	requires app.api;
	provides Calculadora
		with CalculadoraImpl;
}