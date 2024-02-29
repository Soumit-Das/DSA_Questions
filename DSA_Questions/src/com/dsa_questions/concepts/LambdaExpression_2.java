package com.dsa_questions.concepts;

// Below interface is a functional interface as it has only one abstract method

@FunctionalInterface
interface MyanotherInter{
	
	 int CalculateStrLenght(String str);
	
}

// There are three methods to use this functional interface

// 1. Implementing the interface
// 2. Use Anonymous class
// 3. Use lambda expression


// Here inside this class we are using implementing the Functional interface to use its method

public class LambdaExpression_2{


	public static void main(String[] args) {
		
		
		
		// Using lambda
		
		MyanotherInter i = (str) -> {
			
			return str.length();
			
		};
		
		
		System.out.println(i.CalculateStrLenght("Soumit"));
	}

	
}


