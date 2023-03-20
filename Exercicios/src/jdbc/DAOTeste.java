package jdbc;

public class DAOTeste {
	public static void main(String[]args) {
	
		
		DAO dao = new DAO();
		
		String sql = "INSERT INTO pessoas (nome, codigo)  values (?) ";
		
		System.out.println(dao.incluir(sql, "João Pereira", 1000));
		System.out.println(dao.incluir(sql, "Ana Tavares", 1001));
		System.out.println(dao.incluir(sql, "Rafael Da Silva",1002));
		System.out.println(dao.incluir(sql, "Luan Altamir",1003));
		
		
		dao.close();
		
	}
}
