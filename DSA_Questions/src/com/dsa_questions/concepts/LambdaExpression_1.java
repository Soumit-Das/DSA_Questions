package com.dsa_questions.concepts;

// Below interface is a functional interface as it has only one abstract method

@FunctionalInterface
interface Myinter {
	
	 public abstract void sayHello();
	
}

// There are three methods to use this functional interface

// 1. Implementing the interface
// 2. Use Anonymous class
// 3. Use lambda expression


// Here inside this class we are using implementing the Functional interface to use its method

public class LambdaExpression_1 implements Myinter{

	@Override
	public void sayHello() {
		
		System.out.println("Hello");
		
	}
	
	public static void main(String[] args) {
		
		LambdaExpression_1 le = new LambdaExpression_1();
		
		le.sayHello();
		
		
		// Using anonymous class to use the functional interface
		
		Myinter i = new Myinter(){

			@Override
			public void sayHello() {
				
				System.out.println("Hello from anonymous class");
				
			}
			
		};
		
		i.sayHello();
		
		// Using lambda
		
		Myinter i2 = () -> {
			
			System.out.println("Hello from lambda expression");
			
		};
		
		i2.sayHello();
		
	}

	
}


