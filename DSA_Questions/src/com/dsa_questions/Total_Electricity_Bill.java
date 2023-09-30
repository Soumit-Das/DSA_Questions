package com.dsa_questions;

import java.util.Scanner;

public class Total_Electricity_Bill {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        int tc = sc.nextInt();
        
        for(int i=0;i<tc;i++){
            
            int N = sc.nextInt();
            
            int bill;
            
            if(N <= 50){
                
                bill = N*3;
                
            }else if(N <= 150){
                
                bill = (50*3) + ((N-50)*5);
                
            }else{
                
                bill = (50*3) + (100*5) + ((N-150)*10);
                
            }
            
            System.out.println(bill+80);
            
        }
		
	}
	
}
