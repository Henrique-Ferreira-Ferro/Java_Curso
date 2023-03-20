package br.com.projeto.calc.visao;

import java.awt.Color;
import java.awt.Font;
import java.awt.FlowLayout;


import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.ColorUIResource;

import br.com.projeto.calc.modelo.Memoria;
import br.com.projeto.calc.modelo.MemoriaObservador;

@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador{

	private final JLabel label ;
	
	public Display() {

		Memoria.getInstancia().adicionarObservador(this);
		
		setBackground(new ColorUIResource(46,49, 50));
		label = new JLabel(Memoria.getInstancia().getTextoAtual());
		label.setForeground(Color.WHITE);
		label.setFont(new Font("courier", Font.PLAIN,30 ));
		
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10,25));
		
		add(label);
		
	}
	
	
	public void valorAlterado(String novoValor) {
		label.setText(novoValor);
	}
	
}
