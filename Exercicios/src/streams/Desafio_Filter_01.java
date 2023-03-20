package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;


public class Desafio_Filter_01 {
	public static void main(String[]args) {
		
	 Carro v1 = new Carro("Ferrari",true,true, 100.5);
	 Carro v2 = new Carro("Fusca", false,true,80.5);
	 Carro v3 = new Carro("Lamborghini Urus", true,false,120.2);
	 Carro v4 = new Carro("Camaro", true, true, 100.2);
	 
	 
	 List<Carro> carros = Arrays.asList(v1,v2,v3,v4);
	 
	 Predicate<Carro> velocidade = v -> v.velocidade >= 80.0;
	 Predicate<Carro> MotorL = m -> m.motor == true ;
	 Predicate<Carro> PortaA = p -> p.portas == true;
	 Function<Carro, String> PodeCorrer = Frase -> "Parabens! O(A) " + Frase.nome + " esta apto a correr!!"  ;
	 
	 carros.stream()
	 .filter(velocidade)
	 .filter(MotorL)
	 .filter(PortaA)
	 .map(PodeCorrer)
	 .forEach(System.out::println);
	 
	 
	}
}
