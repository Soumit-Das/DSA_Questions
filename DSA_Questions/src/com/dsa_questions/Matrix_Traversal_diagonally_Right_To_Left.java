package com.dsa_questions;

public class Matrix_Traversal_diagonally_Right_To_Left {

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
		for(int k = m-1;k>=0;k--) {
			
			int a =0;
			int b = k;
			
			while(a < n && b >= 0) {
				
				System.out.print(mat[a][b]+" ");
				a++;
				b--;
			}
			System.out.println();
			
		}
		System.out.println("--");
		
		for(int k =1;k<n;k++) {
			
			int a =k;
			int b = m-1;
			
			while(a < n && b >= 0) {
				
				System.out.print(mat[a][b]+" ");
				a++;
				b--;
			}
			
		
			System.out.println();
			
		}
		
	}
	
}
