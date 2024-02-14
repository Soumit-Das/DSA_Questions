package com.dsa_questions;

public class Max_SubArray {

	public static void main(String[] args) {
		
		int[] nums = {5,4,-1,7,8};
        
        int max = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){



        	int sum = 0;
            for(int j=i;j<nums.length;j++){
//            System.out.print(nums[j]+" ");
//                for(int k = i;k<=j;k++){

//                    System.out.print(nums[k]+" ");
                     sum+=nums[j];

//                }
//                System.out.println(sum);
            System.out.println();
            // max = Math.max(max,sum);
            }
            System.out.println(sum);
            System.out.println("------");
        }
    // return max;
		
	}
	
}
