package fatec;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContaNegativo {
	public static void main(String[]args) {
	
	Scanner entrada = new Scanner(System.in);
	
	String numeros;
	int contador = 0;
	
	int i = 0;
	
	List<Integer> numerosNegativos = new ArrayList<>();
	
	System.out.println("Digite alguns numeros");
	
	while( i < 5) {
		for(int x = 5; i < x; i++) {
			numeros = entrada.nextLine();
			
			
			
			if(numeros.contains("-")) {
				
				contador = Integer.parseInt(numeros);
				
				numerosNegativos.add(contador);
				
				
				
			}	
		}
	
}
	
	for(int y = 0; y < contador; y++) {
		System.out.println(numerosNegativos.get(y));
	}
	
	
	
	entrada.close();
		
	}
}
