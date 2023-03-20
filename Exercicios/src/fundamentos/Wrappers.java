package fundamentos;

import java.util.Scanner;

public class Wrappers {
	public static void main(String[]args) {
		
		
		
		Byte b = 100;
		Short c = 1000;
		Integer i = Integer.parseInt("3566");
		Long l = 1000000L;
		
		System.out.println(b.byteValue());
		System.out.println(i);
	
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		
		
		System.out.println(bo.toString().toUpperCase());
	}
}
