package br.com.projeto.calc.visao;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.plaf.DimensionUIResource;

@SuppressWarnings("serial")
public class Calculadora extends JFrame{

	
	public Calculadora(){
		
		organizarLayout();
		//setUndecorated(true); -> Podemos criar nossa propria barra lá em cima em apagar
		setSize(262,362);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setVisible(true);
	}
		
	private void organizarLayout() {
		setLayout(new BorderLayout());
		
		Display display = new Display();
		display.setPreferredSize(new DimensionUIResource(233, 60));
		add(display, BorderLayout.NORTH);
		Teclado teclado = new Teclado();
		add(teclado, BorderLayout.CENTER);
		
		
	}

	public static void main(String[]args) {
		new Calculadora();
	}
	
}
