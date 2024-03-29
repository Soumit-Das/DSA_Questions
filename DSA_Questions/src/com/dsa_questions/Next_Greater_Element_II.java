package com.dsa_questions;
import java.util.*;

public class Next_Greater_Element_II {

    public int[] nextGreaterElements(int[] nums) {
        
        int[] ans = new int[nums.length];

        Stack<Integer> stack = new Stack<>();

        int n = nums.length;

        for(int i = 2 * n - 1; i >= 0; i--){

            while(!stack.isEmpty() && stack.peek() <= nums[i%n]){

                stack.pop();

            }

            if(i < n){

                if(!stack.isEmpty()){

                    ans[i] = stack.peek();

                }else{

                    ans[i] = -1;

                }

            }

            stack.push(nums[i%n]);

        }

    return ans;

    }
	
}
