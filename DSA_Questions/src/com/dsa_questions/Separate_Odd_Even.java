package com.dsa_questions;

/*
 *  You are given an array of integers and in that array the numbers are not sorted and you have to separate the odd and the even numbers the even numbers should come to the first part of the array and the odd numbers will remain at the last part do this using two pointer technique 
 */

import java.util.*;

public class Separate_Odd_Even {

	public static int[] OddEven(int[] arr) {
		
		int l = 0;
		int r = arr.length-1;
		
		while(l < r) {
			
			if(arr[l]%2!=0 && arr[r]%2==0) {
				
				int temp = arr[l];
				arr[l] = arr[r];
				arr[r] = temp;
				l++;
				r--;
				
			}else if(arr[l]%2!=0 && arr[r]%2!=0) {
				
				r--;
				
			}else if(arr[l]%2==0 && arr[r]%2!=0) {
				
				l++;
				
			}else if(arr[l]%2==0 && arr[r]%2==0) {
				
				l++;
				
			}
			
		}
		
		
		return arr;
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = {2,1,3,7,4,6,11,9};
		
		OddEven(arr);
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
			
		}
		
	}
	
}
