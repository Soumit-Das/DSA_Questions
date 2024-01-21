package com.dsa_questions;

public class Delete_Node_At_Begining {

	
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
	
	public static Node deleteFirstNode(Node head) {
		
		head = head.next;
		return head;
		
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = {0,1,2,3,4,5,6,7,8,9,10};
		
		Node curr = convert(arr);
		
		curr = deleteFirstNode(curr);
		
		while(curr != null) {
			
			System.out.print(curr.data+" ");
			curr = curr.next;
			
		}
		
	}
	
}
