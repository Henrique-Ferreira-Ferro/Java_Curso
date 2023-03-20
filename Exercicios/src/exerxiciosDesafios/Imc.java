package exerxiciosDesafios;

import javax.swing.JOptionPane;

public class Imc {
	public static void main(String [] args) {

		String Peso = JOptionPane.showInputDialog("Digite seu peso: ");
		String Altura = JOptionPane.showInputDialog("Digite sua altura");
		
		double P1 = Double.parseDouble(Peso);
		double A1 = Double.parseDouble(Altura);
	
		double imc = P1/(A1*A1);
		
		
		System.out.printf("O valor do seu Imc é: %.1f ", imc);
		
		
	}
}
