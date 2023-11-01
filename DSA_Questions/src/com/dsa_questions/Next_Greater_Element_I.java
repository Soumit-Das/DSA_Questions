package com.dsa_questions;
import java.util.*;

public class Next_Greater_Element_I {

public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        Map<Integer,Integer> map = new HashMap<>();

        Stack<Integer> stack = new Stack<>();

        for(int i = nums2.length-1;i >= 0;i--){

            while(!stack.isEmpty() && stack.peek() <= nums2[i]){

                stack.pop();

            }

            int res = stack.isEmpty()? -1 : stack.peek();

            stack.push(nums2[i]);

            map.put(nums2[i],res);

        }

        int[] arr = new int[nums1.length];

        for(int j = 0;j<nums1.length;j++){

            arr[j] = map.get(nums1[j]);

        }

    return arr;

    }
	
}
