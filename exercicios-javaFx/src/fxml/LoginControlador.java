package fxml;

import org.controlsfx.control.Notifications;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginControlador {

	
	@FXML
	private TextField campoEmail;
	
	@FXML
	private PasswordField campoSenha;
	
	
	public void entrar() {
		
		boolean emailValido = campoEmail.getText().equals("admin@gmail.com");
		boolean senhaValida = campoSenha.getText().equals("a");
		
		if(emailValido && senhaValida) {
			Notifications.create()
						.position(Pos.TOP_CENTER)
						.title("Login FXML")
						.text("Login efetuado com sucesso")
						.showInformation();
		}else {
			Notifications.create()
						.position(Pos.TOP_CENTER)
						.title("Login FXML")
						.text("Ocorreu um erro ao efetuar o login")
						.showError();
		
		}
		
		
	}
	
	
}
