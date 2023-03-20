package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[]args) {
		
		HashSet conjunto = new HashSet();
	
			//Ocorre a convers�o automatica de tipos primitivos
			conjunto.add(1.2);
			conjunto.add("Teste");
			conjunto.add(true);
			conjunto.add(1);
			conjunto.add('x');
			
			System.out.println("Tamanho: "+ conjunto.size());
			
			System.out.println(conjunto.remove("Teste"));
			
			System.out.println(conjunto.contains(1));
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
 
		//conjunto.addAll(nums);
		
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		conjunto.clear();
		
	}
}
