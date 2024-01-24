package com.dsa_questions;

import java.util.*;

public class Matrix_Prime_Check {

	public static void primecheck(int[][] mat,int n,int m){
        
        int ans = 0;
        
        for(int i = 0;i<n;i++){
            
            for(int j =0;j<m;j++){
                
                int count = 0;
                
                for(int k=1;k<=mat[i][j];k++){
                    
                    if(mat[i][j]%k == 0){
                        
                        count++;
                        
                    }
                    
                }
                
                if(count == 2){
                    
                    ans+=1;
                    
                }
                
                // mat[i][j] = sc.nextInt();
                
            }
            
        }
        
        System.out.println(ans);
        
    }
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[][] mat = new int[n][m];
        
        for(int i = 0;i<n;i++){
            
            for(int j =0;j<m;j++){
                
                mat[i][j] = sc.nextInt();
                
            }
            
        }
        primecheck(mat,n,m);
		
	}
	
}
