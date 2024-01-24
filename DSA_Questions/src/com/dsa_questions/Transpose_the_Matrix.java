package com.dsa_questions;

import java.util.*;

public class Transpose_the_Matrix {

	public static void print(int[][] mat,int n,int m){
        
        for(int i=0;i<m;i++){
            
            for(int j=0;j<n;j++){
                
                 System.out.print(mat[j][i]+" ");
                
            }
            
            System.out.println();
            
        }
        
    }
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[][] mat = new int[n][m];
        
        for(int i=0;i<n;i++){
            
            for(int j=0;j<m;j++){
                
                mat[i][j] = sc.nextInt();
                
            }
            
        }
        
        print(mat,n,m);
		
	}
	
}
