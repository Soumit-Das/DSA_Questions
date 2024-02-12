package com.dsa_questions.concepts;

public class Casting {

	public static void main(String[] args) {
		
		// Implicit Casting
		
		int i = 100;
		long l = i;
		System.out.println(l);

		//Output: 100
		//Explanation: An int value is automatically cast to a long without any data loss since long is a larger data type than int.

		
		// Explicit casting;
		
		long log = 100;
		int a = (int)log;
		System.out.println(a);
		
	}
	
}
