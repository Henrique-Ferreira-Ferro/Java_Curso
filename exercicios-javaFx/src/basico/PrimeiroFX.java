package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PrimeiroFX extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {

		
		Button botaoA = new Button("A");
		Button botaoB = new Button("B");
		
		botaoA.setOnAction(e -> {
			System.out.println("Estudando...");
		});
		
		botaoB.setOnAction(e -> {
			System.exit(0);
		});
		
		
		VBox box = new VBox();
		
		box.getChildren().add(botaoA);
		box.getChildren().add(botaoB);
		
		box.setSpacing(10);
		box.setAlignment(Pos.CENTER);
		
		Scene cena = new Scene(box,200,400);
		
		primaryStage.setScene(cena);
		
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
	
}
