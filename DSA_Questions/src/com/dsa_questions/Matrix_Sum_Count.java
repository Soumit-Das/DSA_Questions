package com.dsa_questions;

public class Matrix_Sum_Count {

	
public static void SumCount(int[][] matrix,int n,int m,int s){
        
        int count = 0;

        for(int i = 0; i < n; i++) {

            for(int j = 0; j < m; j++) {

                if(j < matrix[i].length - 2) {
                
                int temp = matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2];
            
                if(temp == s) {
                    
                count++;
                
                }
        }

        if(i < matrix.length - 2) {
            
            int temp = matrix[i][j] + matrix[i + 1][j] + matrix[i + 2][j];
            
            if(temp == s) {
                
                count++;
                
            }
        }

        if(i < matrix.length - 2 && j < matrix[j].length - 2) {
            
            int temp = matrix[i + 2][j] + matrix[i + 1][j + 1] + matrix[i][j + 2];
            
            if (temp == s) {
                
                count++;
                
            }
        }

        if(i < matrix.length - 2 && j < matrix.length - 2) {
            
            int temp = matrix[i][j] + matrix[i + 1][j + 1] + matrix[i + 2][j + 2];
            
            if(temp == s) {
                
                count++;
                
            }
        }
    }
}

    System.out.println(count);
        
    }
	
	public static void main(String[] args) {
		
		int[][] mat = {
				{3,2,1},
				{2,2,2},
				{1,5,1}
		};
		
		
		int n = 3;
		int m = 3;
		int s = 6;
		
		SumCount(mat,n,m,s);
		
	}
	
}
