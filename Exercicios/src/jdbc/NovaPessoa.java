package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
	public static void main(String[] args) throws SQLException{
		
		Scanner entrada = new Scanner(System.in);
		
	
		System.out.println("Informe o nome: ");
		String nome = entrada.next();
		
		//System.out.print(nome);
		
		Connection conexao = FabricaConexao.getConexao();
		
		String sql = "insert into pessoas (nome) values (?)";
	
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, nome);
		stmt.execute();
		
		System.out.println("Pessoa incluida com sucesso!!!");
		
		stmt.close();
		entrada.close();
	}
}
