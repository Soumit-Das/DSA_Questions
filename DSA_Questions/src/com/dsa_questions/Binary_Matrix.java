package com.dsa_questions;

import java.util.*;

public class Binary_Matrix {

	public static void print(int[][] mat,int n,int m){
        
        for(int i=0;i<n;i++){
            
            for(int j=0;j<m;j++){
                
                    if(mat[i][j] == 0){
                        mat[i][j] = 1;
                    }else if(mat[i][j] == 1){
                        mat[i][j] = 0;
                    }
                System.out.print(mat[i][j]+" ");
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