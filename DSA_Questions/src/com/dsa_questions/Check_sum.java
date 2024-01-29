package com.dsa_questions;

import java.util.*;

/*
 * You are given an array of elements and you have given an element with the name k you have to find two elements whose sum is equals to K those two elements should be present inside our array do it with the help of two pointers method return boolean value true if prsent else false.
 */

public class Check_sum {

	public static boolean SumCheck(int[] arr, int k) {
		
		int l = 0;
		int r = arr.length-1;
		
		while(l <= r) {
			
			if(arr[l] + arr[r] == k) {
				return true;
			}else if(arr[l] + arr[r] < k) {
				l++;
			}else {
				r--;
			}
			
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,4,45,6,10,-8};
		
		Arrays.sort(arr);
		
		int k = 16;
		
		System.out.println(SumCheck(arr,k));
		
		
	}
	
}
