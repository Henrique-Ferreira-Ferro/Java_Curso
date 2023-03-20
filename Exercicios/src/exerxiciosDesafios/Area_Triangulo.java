package exerxiciosDesafios;

import javax.swing.JOptionPane;

public class Area_Triangulo {
	public static void main(String[] args) {
		
	String Base = JOptionPane.showInputDialog("Digite o valor da base do triângulo: ");
	String Altura = JOptionPane.showInputDialog("Digite o valor da altura do triângulo");
	
	//Conversão
		double B1 = Double.parseDouble(Base);
		double A1 = Double.parseDouble(Altura);
	//Calculo
		double cal = (B1*A1)/2;
		System.out.printf("O valor da área do triângulo é %.1f", cal);
	}
}
