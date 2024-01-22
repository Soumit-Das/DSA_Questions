package com.dsa_questions;

public class Delete_Node_At_End {

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
	
	public static Node deleteLastNode(Node head) {
		
		Node curr = head;
		Node perv = curr;
		
		boolean flag = false;
		
		while(curr != null && !flag) {
			
			if(curr.next == null) {
				perv.next = null;
				flag = true;
			}
			if(!flag) {
				perv = curr;
				curr = curr.next;
			}
			
			
		}
		
		return head;
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11};
		
		Node curr = convert(arr);
		
		deleteLastNode(curr);
		
		while(curr != null) {
			
			System.out.print(curr.data+" ");
			curr = curr.next;
			
		}
		
	}
	
}
