package com.dsa_questions;

public class Generics_question {

	public static <T> void printArray(T[] array) {
        
        for (T element : array) {
            
            System.out.print(element + " ");
        }
        
        System.out.println();
}

    
    public static void main(String[] args) {
        
        Integer[] arr = {1,2,3,4,5,6,7,8};
        
        printArray(arr);
        

    }
	
}
