package com.dsa_questions;


class Node { 
    int data; 
    Node next; 

    Node() { data = 0; }
    Node(int d) { data = d; }  //constructor to create a new node
}

public class Make_LinkedList_from_Array {

	public static Node convert(int[] arr) {
		
		Node head;
		Node curr = new Node();
		curr.data = arr[0];
		curr.next = null;
		head = curr;
		
		for(int i=1;i<arr.length;i++) {
			
			Node temp = new Node();
			temp.data = arr[i];
			temp.next = null;
			curr.next = temp;
			curr = temp;
			
		}
		
		return head;
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		Node head = convert(arr);
		
		while(head != null) {
			System.out.print(head.data+" , ");
			head = head.next;
		}
		
	}
	
}
