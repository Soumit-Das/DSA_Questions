package com.dsa_questions;

public class Matrix_Traversal_Top_To_Bottom {

	public static void main(String[] args) {
		
		int[][] mat = {
				
				{1,2,3},
				{4,5,6},
				{7,8,9}
				
		};
		
		int n = 3;
		int m = 3;
		
		for(int i =0;i<n;i++) {
			
			for(int j =0;j<m;j++) {
				
				System.out.print(mat[i][j]+" ");
				
			}
			
		}
		
	}
	
}
