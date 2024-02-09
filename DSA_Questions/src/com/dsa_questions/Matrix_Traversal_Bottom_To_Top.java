package com.dsa_questions;

public class Matrix_Traversal_Bottom_To_Top {

	public static void main(String[] args) {
		
		int[][] mat = {
				
				{1,2,3},
				{4,5,6},
				{7,8,9}
				
		};
		
		int n = 3;
		int m = 3;
		
		for(int i = n-1;i>=0;i--) {
			
			for(int j = m-1;j>=0;j--) {
				
				System.out.print(mat[i][j]+" ");
				
			}
			
		}
		
		
	}
	
}
