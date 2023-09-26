package com.dsa_questions;

public class Reverse_linked_list {

	public static Node reverseLinkedList(Node a){
		   
	    Node prev = null;
	    
	    Node curr = a;
	    
	    Node next = null;
	    
	    while(curr != null){
	        
	        next = curr.next;
	        
	        curr.next = prev;
	        
	        prev = curr;
	        
	        curr = next;
	        
	    }
	    
	    return prev;
	   }
	
}


class Node{
	  int data;
	  Node next;
	  
	  public Node(int data,Node next){
	    this.data = data;
	    this.next = next;
	  }
	  public Node(int data){
	    this.data = data;
	    this.next = null;
	  }
	  public Node(){
	    this.data = 0;
	    this.next = null;
	  }
	}