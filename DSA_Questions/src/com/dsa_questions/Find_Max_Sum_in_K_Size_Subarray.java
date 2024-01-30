package com.dsa_questions;

public class Find_Max_Sum_in_K_Size_Subarray {

	public static void FindMax(int[] arr,int n,int k){
        
        if(k > n){
            System.out.println("Invalid");
            return;
        }
        
        int max = 0;
        
        for(int i=0;i<k;i++){
            
            max+=arr[i];
            
        }
        
        int window_sum = max;
        
        for(int i=k;i<n;i++){
            
            window_sum = window_sum - arr[i-k] + arr[i];
            max = Math.max(window_sum,max);
            
        }
        
        System.out.println(max);
        
    }
	
	public static void main(String[] args) {
		
		int[] arr = {1,4,2,10,2,3,1,0,20};
        
        int k = 4;
        int n = arr.length;
        
        FindMax(arr,n,k);
		
	}
	
}
