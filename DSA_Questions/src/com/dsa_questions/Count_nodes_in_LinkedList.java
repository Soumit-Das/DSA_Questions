package com.dsa_questions;

public class Count_nodes_in_LinkedList {

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
	
	public static int countinglength(Node head) {
		
		Node curr = head;
		int count = 0;
		
		while(curr != null) {
			
			count++;
			curr = curr.next;
			
		}
		
		return count;
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11};
		
		Node curr = convert(arr);
		
		System.out.println("Length of the linkedList : "+countinglength(curr));
		
		while(curr != null) {
			
			System.out.print(curr.data+" ");
			curr = curr.next;
			
		}
		

	}
	
	
}
