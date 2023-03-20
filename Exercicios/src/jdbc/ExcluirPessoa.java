package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

//Tente fazer esse código um pouco mais elaborado, trazendo resultado e perguntando ao
//Usuario se ele realmente deseja excluir aquela pessoa

public class ExcluirPessoa {
	public static void main(String[] args) throws SQLException{
		
		Scanner entrada = new Scanner(System.in);
		
		
		 // Consulta todas as pessoas no banco de dados
        Connection conexao = FabricaConexao.getConexao();
        String selectSql = "SELECT * FROM pessoas";
        PreparedStatement selectStmt = conexao.prepareStatement(selectSql);
        ResultSet resultados = selectStmt.executeQuery();

        // Exibe as pessoas no console
        System.out.println("Banco de dados antes da exclusão:");
        while (resultados.next()) {
            int codigo = resultados.getInt("codigo");
            String nome = resultados.getString("nome");
            System.out.println("Código: " + codigo + ", Nome: " + nome);
        }
		
		
		System.out.println("Informe o código");
		int codigo = entrada.nextInt();
	
		
		
			System.out.println("Tem certeza que deseja excluir esssa pessoa? (s/n) ");
			String resposta = entrada.next();
			
			if(resposta.equals("s") && codigo != 0) {
				Connection conect = FabricaConexao.getConexao();
				String DeleteSql = "Delete from pessoas where codigo = ?";
				
				
				PreparedStatement stmt = conect.prepareStatement(DeleteSql);
				stmt.setInt(1, codigo);
				
				
				int contador = stmt.executeUpdate();
								
				if(contador > 0) {
					System.out.println("Pessoa excluida com sucesso!");
					System.out.println("O numero de pessoas excluidas foi: " + contador);
				}else {
					System.out.println("Não existe esse id");
					}
				}else {
					System.out.println("Houve algo de errado!!");
				}
			
			entrada.close();

	}
	}


