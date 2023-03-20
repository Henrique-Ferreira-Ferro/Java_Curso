package colecoes;

import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;

public class Mapa {
	public static void main(String[]args) {

		Map<Integer,String> usuarios = new HashMap<Integer, String>();
		
		usuarios.put(1, "Alan");
		usuarios.put(2, "Brian");
		usuarios.put(3, "Joeli");
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.containsKey(1));
		System.out.println(usuarios.containsValue("Alan"));
		
		System.out.println(usuarios.get(4));
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}

		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		 
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + " = ");
			System.out.println(registro.getValue());
		}
		
	}
	
}
