package com.dsa_questions;

import java.util.*;

public class Single_Element_in_a_Sorted_Array {

	public static int SingleElement(int[] nums) {
		
		Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){

            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }

        }
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){

            if(entry.getValue() == 1){
                return entry.getKey();
            }

        }
        return -1;
		
	}
	
	public static void main(String[] args) {
		
		int[] nums = {1,1,2,3,3,4,4,8,8};
		
		
		System.out.println(SingleElement(nums));
		
	}
	
}
