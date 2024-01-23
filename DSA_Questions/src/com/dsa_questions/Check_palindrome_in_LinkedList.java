package com.dsa_questions;

public class Check_palindrome_in_LinkedList {

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
	
	
	public static Node reverse(Node head){
        
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
    
    //Function to check whether the list is palindrome.
    public static boolean isPalindrome(Node head) 
    {
        String s = "";
        String a = "";
        
        Node curr = head;
        
        while(curr != null){
            
            s+=curr.data+"";
            curr = curr.next;
            
        }
        
        Node c = reverse(head);

        while(c != null){
            
            a+=c.data+"";
            c = c.next;
            
        }
        
        if(s.equals(a)){
            
            return true;
            
        }
        return false;
    }
	
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,1};
		
		Node curr = convert(arr);
		
		if(isPalindrome(curr)) {
			
			System.out.println("Yes it is a palindrome");
			
		}else {
			
			System.out.println("No it is not a palindrome");
			
		}
		
	}
	
}
