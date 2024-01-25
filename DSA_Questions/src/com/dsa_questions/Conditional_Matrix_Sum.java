package com.dsa_questions;

import java.util.*;

public class Conditional_Matrix_Sum {

	public static void check(int[][] mat,int n,int m){
        
        int sum = 0;
        
        for(int i = 0;i<n;i++){
            
            for(int j=0;j<m;j++){
                
                 if(mat[i][j]%3==0){
                     
                     sum+=mat[i][j];
                     
                 }
                
            }
            
        }
        
        System.out.println(sum);
        
    }
    
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int m = sc.nextInt();
        
        int[][] mat = new int[n][m];
        
        for(int i = 0;i<n;i++){
            
            for(int j=0;j<m;j++){
                
                mat[i][j] = sc.nextInt();
                
            }
            
        }
        check(mat,n,m);
    }
	
}
