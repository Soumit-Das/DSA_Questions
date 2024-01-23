package com.dsa_questions;

public class Serach_in_LinkedList {

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
	
	public static boolean searchKey(int n, Node head, int key) {
        
        Node curr = head;
        
        while(curr != null){
            
            if(curr.data == key){
                
                return true;
                
            }
            curr = curr.next;
        }
        return false;
    }
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11};
		
		Node curr = convert(arr);
		
		int key = 10;
		
		if(searchKey(11,curr,key)) {
			
			System.out.println("The element "+key+" is present in the LinkedList");
			
		}else {
			
			System.out.println("The element "+key+" is not present in the LinkedList");
			
		}
		
	}
	
}
