package exerxiciosDesafios;

import javax.swing.JOptionPane;

public class Area_Triangulo {
	public static void main(String[] args) {
		
	String Base = JOptionPane.showInputDialog("Digite o valor da base do tri�ngulo: ");
	String Altura = JOptionPane.showInputDialog("Digite o valor da altura do tri�ngulo");
	
	//Convers�o
		double B1 = Double.parseDouble(Base);
		double A1 = Double.parseDouble(Altura);
	//Calculo
		double cal = (B1*A1)/2;
		System.out.printf("O valor da �rea do tri�ngulo � %.1f", cal);
	}
}
