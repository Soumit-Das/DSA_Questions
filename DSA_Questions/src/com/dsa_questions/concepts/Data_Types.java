package com.dsa_questions.concepts;

public class Data_Types {

	public static void main(String[] args) {
		

		int max = Integer.MAX_VALUE;
		System.out.println(max + 1);

		// Output: -2147483648
		// Explanation: Adding 1 to Integer.MAX_VALUE (which is 2^31 - 1) causes an integer overflow, wrapping around to Integer.MIN_VALUE (which is -2^31).
		
		
	}
	
}
