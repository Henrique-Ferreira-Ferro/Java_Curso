package exerxiciosDesafios;

import javax.swing.JOptionPane;

public class Quadrado_Cubo {
	public static void main(String[]args) {

	String Convert = JOptionPane.showInputDialog("Digite um valor que será Elevado: ");
		
	double valor1 = Double.parseDouble(Convert);
	
	double Quadrado = Math.pow(valor1, 2);
	double Cubo = Math.pow(valor1, 3);
	
	System.out.printf("O número %.1f elevado ao "
			+ "quadrado resulta em: %.1f e ao cubo: %.1f ", valor1, Quadrado, Cubo);
	
	}
}
