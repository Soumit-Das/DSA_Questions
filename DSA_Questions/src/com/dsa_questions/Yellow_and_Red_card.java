package com.dsa_questions;

import java.util.*;

public class Yellow_and_Red_card {

	    
	     public static void main(String[] args ){
	         
	        Scanner sc = new Scanner(System.in);
	        
	        int N = sc.nextInt();
	        
	        int K = sc.nextInt();
	        
	        int[] arr = new int[N];
	        
	        while(K-- != 0){
	            
	            int a = sc.nextInt();
	            
	            int i = sc.nextInt();
	            
	            if(a == 1){
	                
	                arr[i-1]++;
	                
	            }else if(a == 2){
	                
	                arr[i-1] = 5;
	                
	            }else if(a == 3){
	                
	                if(arr[i-1] < 2){
	                
	                System.out.println("No");
	                
	                }else{
	                    
	                    System.out.println("Yes");
	                    
	                }
	               
	                
	                
	            }
	            
	        }
	        
	    }
	    
	}
	

