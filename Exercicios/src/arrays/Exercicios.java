package arrays;
import java.util.Arrays;

public class Exercicios {
	public static void main(String[]args) {

		//Array aula #02
		double [] notasdoAlunoA = new double[6];
		
		notasdoAlunoA[0] = 10;
		notasdoAlunoA[1]= 9;
		notasdoAlunoA[2] = 8.1;
		notasdoAlunoA[3] = 1.2;

		System.out.println(Arrays.toString(notasdoAlunoA));
		
		double total = 0;
		for(int i = 0; i < notasdoAlunoA.length ; i++) {
			total += notasdoAlunoA[i];
		}
		System.out.println(total/notasdoAlunoA.length);
		
		//Array de tamanho fixo e já definido
		//Segue abaixo o exemplo
		double [] notasAluno = {10.1, 5.1, 8.1};
		
		double totalAluno = 0;
		for(int i = 0; i < notasAluno.length; i++) {
			totalAluno += notasAluno[i];
		}
		System.out.println(totalAluno/notasAluno.length);
	}
}
