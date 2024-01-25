package com.dsa_questions;

import java.util.*;

public class Zig_Zag_Matrix_Traversal {

	public static void print(int[][] mat,int n){
        
        String bag = "";
        int count = 1;
        
        for(int i=0;i<n;i++){

            if(count % 2 == 0){
                
               for(int j=n-1;j>=0;j--){
                
                bag+=mat[i][j]+" ";
                
                } 
                
            }else{
                
                for(int j=0;j<n;j++){
                    
                    bag+=mat[i][j]+" ";
                    
                }
                
            }
            count++;
        }
        
        System.out.println(bag);
        
    }
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[][] mat = new int[n][n];
        
        for(int i = 0;i<n;i++){
            
            for(int j=0;j<n;j++){
                
                mat[i][j] = sc.nextInt();
                
            }
            
        }
        
        print(mat,n);
        
    }
	
}
