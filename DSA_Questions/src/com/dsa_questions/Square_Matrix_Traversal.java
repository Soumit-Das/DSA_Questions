package com.dsa_questions;

import java.util.*;

public class Square_Matrix_Traversal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        
        int[][] mat = new int[a][a];
        
        for(int i=0;i<a;i++){
            
            for(int j = 0;j < a;j++){
                
                mat[i][j] = sc.nextInt();
                
            }
            
        }
        
        for(int i=0;i<a;i++){
            
            for(int j = 0;j < a;j++){
                
                System.out.print((mat[i][j]+1)+" ");
                
            }
            System.out.println();
        }
        
    }
		
	}
	

