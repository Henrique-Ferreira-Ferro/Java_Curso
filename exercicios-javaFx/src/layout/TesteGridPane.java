package layout;

import javafx.scene.layout.GridPane;

public class TesteGridPane extends GridPane{

	public TesteGridPane() {
		
		Caixa c1 = new Caixa().comTexto("1");
		Caixa c2 = new Caixa().comTexto("2");
		Caixa c3 = new Caixa().comTexto("3");
		Caixa c4 = new Caixa().comTexto("4");
		Caixa c5 = new Caixa().comTexto("5");

		
		setGridLinesVisible(true);
		
	}
	
}
