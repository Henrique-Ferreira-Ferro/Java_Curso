package arrays;
import java.util.Arrays;

public class Exercicio_Foreach {
	public static void main(String[]args) {
		
		double [] notaAlunoA = {12.1,10.1,5.6,9.1};
		System.out.print(Arrays.toString(notaAlunoA));
		
		double total = 0;
		
		for(double nota : notaAlunoA) {
			total += nota;
			
		}
		System.out.println();
		System.out.print(total/4);
	}
}
