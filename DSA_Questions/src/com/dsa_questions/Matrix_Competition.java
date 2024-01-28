package com.dsa_questions;

import java.util.*;

public class Matrix_Competition {

	public static void LargestSum(int[][] mat1,int n,int m,int[][] mat2,int n2,int m2){
        
        int sum1 = 0;
        int sum2 = 0;
        
        for(int i=0;i<n;i++){
            
            for(int j=0;j<m;j++){
                
                sum1+=mat1[i][j];
                
            }
            
        }

        
        for(int i=0;i<n2;i++){
            
            for(int j=0;j<m2;j++){
                
                sum2+=mat2[i][j];
                
            }
            
        }
        
        if(sum1>sum2){
            System.out.println(sum1);
        }else{
            System.out.println(sum2);
        }
        
    }
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[][] mat1 = new int[n][m];
        
        for(int i=0;i<n;i++){
            
            for(int j=0;j<m;j++){
                
                mat1[i][j] = sc.nextInt();
                
            }
            
        }
        
        int n2 = sc.nextInt();
        int m2 = sc.nextInt();
        
        int[][] mat2 = new int[n2][m2];
        
        for(int i=0;i<n2;i++){
            
            for(int j=0;j<m2;j++){
                
                mat2[i][j] = sc.nextInt();
                
            }
            
        }
        
        LargestSum(mat1,n,m,mat2,n2,m2);
        
    }
	
}
