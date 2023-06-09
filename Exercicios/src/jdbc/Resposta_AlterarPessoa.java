package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Resposta_AlterarPessoa {
	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o c�digo da Pessoa: ");
		int codigo = entrada.nextInt();
				
		String sql = "Select codigo,nome from pessoas where codigo = ?";
		String update = "Update pessoas set nome = ? where codigo = ?";
		
		Connection conexao = FabricaConexao.getConexao();
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1,codigo);
		ResultSet r = stmt.executeQuery();
		
		if(r.next()) {
			Pessoa p = new Pessoa(r.getInt(1), r.getString(2));
			
			System.out.println("O nome atual �: " + p.getNome());
			entrada.nextLine();			
			
			System.out.print("Informe o novo nome");
			String novoNome = entrada.nextLine();
			
			
			stmt.close();
			stmt = conexao.prepareStatement(update);
			stmt.setString(1, novoNome);
			stmt.setInt(2, codigo);
			stmt.execute();
			
			
			System.out.println("Pessoa alterada com sucesso!!");
			
		}
		
		
		conexao.close();
		entrada.close();
	}
}
