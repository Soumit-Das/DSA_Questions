package com.dsa_questions;

/*
 * 
Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

Your solution must use only constant extra space.
 * 
 */


import java.util.*;

public class Three_Sum_II {

	public static int[] twoSum(int[] numbers, int target) {
        
        int[] ans = new int[2];

        int l = 0;
        int r = numbers.length-1;
        boolean flag = false;

        while(l<=r && !flag){

            if(numbers[l] + numbers[r] == target){
                ans[0] = l+1;
                ans[1] = r+1;
                flag = true;
            }else if(numbers[l] + numbers[r] < target){
                l++;
            }else if(numbers[l] + numbers[r] > target){
                r--;
            }

        }
    return ans;
    }
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		int target = 14;
		
		int[] ans = twoSum(arr,target);
		
		for(int i = 0;i<ans.length;i++) {
			
			System.out.println(ans[i]);
			
		}
		
	}
	
}
