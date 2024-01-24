package com.dsa_questions;

import java.util.*;

public class Printing_Matrix_with_multiple_testcases {

	public static void print(int[][] mat,int n){
        
        for(int j=0;j<n;j++){
                
                for(int k=0;k<n;k++){
                    
                     System.out.print((mat[j][k]+1)+" ");
                    
                }
                System.out.println();
            }
        
    }
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        int tc = sc.nextInt();
        
        for(int i=0;i<tc;i++){
            
            int n = sc.nextInt();
            
            int[][] mat = new int[n][n];
            
            for(int j=0;j<n;j++){
                
                for(int k=0;k<n;k++){
                    
                    mat[j][k] = sc.nextInt();
                    
                }
                
            }
            
            print(mat,n);
            
        }
		
	}
	
}
