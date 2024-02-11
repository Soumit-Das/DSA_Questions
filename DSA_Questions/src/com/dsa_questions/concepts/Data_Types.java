package com.dsa_questions.concepts;

public class Data_Types {

	public static void main(String[] args) {
		

		int max = Integer.MAX_VALUE;
		System.out.println("max = "+max + 1);

		// Output: -2147483648
		// Explanation: Adding 1 to Integer.MAX_VALUE (which is 2^31 - 1) causes an integer overflow, wrapping around to Integer.MIN_VALUE (which is -2^31).
		
		// byte: Stores small whole numbers (-128 to 127).
		
		byte bt = 127;
		System.out.println("byte = "+bt);
		
		//short: Stores small whole numbers (-32,768 to 32,767).
		
		short st = 32767;
		System.out.println("short = "+st);
		
		
		//int: Stores whole numbers (-2,147,483,648 to 2,147,483,647).
		
		int num = 2147483647;
		System.out.println("int = "+num);
		
		//long: Stores large whole numbers (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807).
	
		long lg = 922337203;
		System.out.println("long = "+lg);
		
		//Floating-Point Types:

		//float: Stores single-precision decimal numbers with less precision.
		
		float fl = 34.98f;
		System.out.println("float = "+fl);
		
		//double: Stores double-precision decimal numbers with more precision.
		
		double dbl = 42.65;
		System.out.println("double = "+dbl);
		
		//Boolean Type:

		// boolean: Stores true or false values.
		
		boolean flag = true;
		System.out.println("boolean = "+flag);
		
		//Character Type:

		//char: Stores a single character (Unicode).
		
		char ch = 'S';
		System.out.println("character = "+ch);
		
	}
	
}
