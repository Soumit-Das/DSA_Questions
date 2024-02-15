package com.dsa_questions;

public class Search_in_matrix {

	public static void main(String[] args) {
		
		int[][] matrix = {
				
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
				
		};
		int target = 4;
		int n = matrix.length; 
        int m = matrix[0].length;

        for(int i=0;i<n;i++){

            for(int j=0;j<m;j++){

                if(matrix[i][j] == target){
                    System.out.println("It is prsent");
                }

            }

        }
        System.out.println("It is not prsent");
		
	}
	
}
