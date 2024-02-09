package com.dsa_questions;

public class Matrix_Traversal_diagonally_Left_To_Right {

	public static void main(String[] args) {
		
		int[][] mat = {
				
				{1,2,3},
				{4,5,6},
				{7,8,9}
				
		};
		
		int n = 3;
		int m = 3;
		
		int i = 0;
		int j = 0;
		
//		while(i < n && j < m) {
//			
//			System.out.print(mat[i][j]+" ");
//			i++;
//			j++;
//		}
		
		System.out.println();
		
		
		System.out.println();
		for(int k = n-1;k>=1;k--) {
			
			int a =k;
			int b = 0;
			
			while(a < n && b < m) {
				
				System.out.print(mat[a][b]+" ");
				a++;
				b++;
			}
			System.out.println();
			
		}
		System.out.println("--");
		
		for(int k =0;k<m;k++) {
			
			int a =0;
			int b = k;
			
			while(a < n && b < m) {
				
				System.out.print(mat[a][b]+" ");
				a++;
				b++;
			}
			System.out.println();
			
		}
		
		
	}
	
}
