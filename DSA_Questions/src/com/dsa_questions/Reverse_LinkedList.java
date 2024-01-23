package com.dsa_questions;

public class Reverse_LinkedList {

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
	
	public static Node reverseList(Node head) {
        
		Node curr = head;
		Node perv = null;
		Node next = null;

        while(curr != null){

            next = curr.next;
            curr.next = perv;
            perv = curr;
            curr = next;


        }
        return perv;
    }
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		Node curr = convert(arr);
		
		curr = reverseList(curr);
		
		while(curr != null) {
			
			System.out.print(curr.data+" ");
			curr = curr.next;
			
		}
		
		
	}
	
}
