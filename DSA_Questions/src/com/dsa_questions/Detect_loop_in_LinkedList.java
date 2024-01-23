package com.dsa_questions;

import java.util.*;

public class Detect_loop_in_LinkedList {

	public static Node convert(int[] arr) {
		
		Node head = new Node();
		head.data = arr[0];
		
		Node curr = head;
		
		for(int i =1;i<arr.length;i++) {
			
			Node temp = new Node();
			temp.data = arr[i];
			curr.next = temp;
			curr = temp;
			
		}
		return head;
	}
	
	
	public static boolean detectLoop(Node head){
        
	    Node curr = head;

	    Set<Node> set = new HashSet<>();

	        while(curr != null){
	    
	            if(set.contains(curr)){
	                return true;
	            }else{
	        
	                set.add(curr);
	                curr = curr.next;
	    
	            }
	    
	    
	        }
	    return false;
	    }
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		Node curr = convert(arr);
		
		
		
		if(detectLoop(curr)) {
			
			System.out.println("Loop exists");
			
		}else {
			
			System.out.println("Loop not present");
			
		}
		
	}
	
}
