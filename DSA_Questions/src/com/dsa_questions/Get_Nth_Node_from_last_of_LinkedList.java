package com.dsa_questions;

public class Get_Nth_Node_from_last_of_LinkedList {

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
	
	public static int getNthFromLast(Node head, int n)
    {
    	int len = 0;
    	Node curr = head;
    	
    	while(curr != null){
    	    
    	    len++;
    	    curr = curr.next;
    	    
    	}
    	
    	int idx = (len-n)+1;
    	int count = 0;
    	curr = head;
    	
    	boolean flag = false;
    	int ans = -1;
    	
    	while(curr != null && !flag){
    	    
    	    count++;
    	    
    	    if(count == idx){
    	        
    	        ans = curr.data;
    	        flag = true;
    	        
    	    }

    	    curr = curr.next;
 
    	}

    	return ans;
    	
    }
	
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		Node curr = convert(arr);
		
		System.out.println("Nth node from last is : "+getNthFromLast(curr,4));
		
	}
	
}
