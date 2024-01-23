package com.dsa_questions;

public class Find_the_middle_node {

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
	
	public static int getMiddle(Node head) {

        int count = 0;
        
        Node curr = head;
        
        while(curr != null){
            
            count++;
            curr = curr.next;
            
        }
        
        int midx = (int)Math.ceil(count/2)+1;
        int c = 0;
        
        curr = head;
        
        int mid = 0;
        boolean flag = false;
        
        while(curr != null && !flag){
            
            c++;
            
            if(c == midx){
                
                mid = curr.data;
                flag = true;
            }
            curr = curr.next;
        }
        return mid;
   }
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		Node curr = convert(arr);
		
		int mid = getMiddle(curr);
		
		System.out.println("The middle node is : "+mid);
		
	}
	
}
