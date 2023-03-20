package br.com.mezzo.cm;

import br.com.mezzo.cm.modelo.Tabuleiro;
import br.com.mezzo.cm.visao.TabuleiroConsole;

public class Aplicacao {
	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6,6,6);
		new TabuleiroConsole(tabuleiro);
		
		
		
	}
}
