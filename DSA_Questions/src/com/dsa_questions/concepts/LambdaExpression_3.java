package com.dsa_questions.concepts;



public class LambdaExpression_3{


	public static void main(String[] args) {
		
		// Creating a thread using lambda expression
		
		Runnable r = () -> {
			
			for(int i =1;i<=10;i++) {
				
				System.out.println("The value is "+i);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		};
		
		Thread t = new Thread(r);
		t.setName("Soumit");
		t.start();
		
	}

	
}


