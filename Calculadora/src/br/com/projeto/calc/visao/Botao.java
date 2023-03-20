package br.com.projeto.calc.visao;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;


@SuppressWarnings("serial")
public class Botao extends JButton{

	public Botao(String texto, Color cor) {
		
		setText(texto);
		setFont(new Font("courier", Font.PLAIN, 22 ));
		setOpaque(true);
		setBackground(cor);
		setForeground(Color.WHITE);
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
	}
	
	
}
