package exerxiciosDesafios;

import javax.swing.JOptionPane;

public class Delta {
	
	public static void main(String[]args) {
		
	String A = JOptionPane.showInputDialog("Digite o valor de A");
	String B = JOptionPane.showInputDialog("Digite o valor de B");
	String C = JOptionPane.showInputDialog("Digite o valor de c");
	
	//Conversão
		double A1 = Double.parseDouble(A);
		double B1 = Double.parseDouble(B);
		double C1 = Double.parseDouble(C);
	//Calculo
		double elevado = Math.pow(B1, 2);
		double form = elevado-4*A1*C1;
	
		System.out.printf("O valor de delta é %.1f", form);
	
	}	
}
