package estruturas_de_Controle;

import javax.swing.JOptionPane;

public class If_Else {
	public static void main(String[]args) {

	String valor = JOptionPane.showInputDialog("Informe um número");
	int numero = Integer.parseInt(valor);
	
		if(numero %2 == 0) {
			System.out.println("Par");
		}else {
			System.out.println("Impar");
		}
	}
}
