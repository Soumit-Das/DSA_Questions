package com.dsa_questions;

public class Number_of_NGEs_to_the_right {

	public static int[] count_NGEs(int N, int arr[], int queries, int indices[]) {
	    
	    int[] ans = new int[queries];
	    
	    for(int i = 0;i<queries;i++){
	        
	        int idx = indices[i];
	        
	        int val = arr[idx];
	        
	        int count = 0;
	        
	        for(int j = idx;j<N;j++){
	            
	            if(arr[j] > val){
	                
	                count++;
	                
	            }
	            
	        }
	        
	        ans[i] = count;
	        
	    }
	     return ans;
	  }
	
}
