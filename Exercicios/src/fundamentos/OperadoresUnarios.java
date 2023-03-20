package fundamentos;

public class OperadoresUnarios {
	public static void main(String[]args) {
		int a = 2;
		int b = 3;
		
		++a;
		--a;
		
		b++;
		b--;
		
		System.out.println(++a == b++);
	}
}
