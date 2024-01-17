package com.dsa_questions;

import java.util.*;

class Node { 
    int data; 
    Node next; 

    Node() { data = 0; }
    Node(int d) { data = d; }  //constructor to create a new node
}

//class LinkedList{
//	Node head;
//}

public class Insert_node_before_n {

	
	public static LinkedList insert(LinkedList list,int data) {
		
		
		Node new_node = new Node(data);
		new_node.next = null;
		
		if(list.head == null) {
			list.head = new_node;
		}else {
			
			Node last = list.head;
			
			while(last.next != null) {
				last = last.next;
			}
			
			last.next = new_node;
			
		}
		
		return list;
		
	}
	
	public static LinkedList insertbeforen(LinkedList list,int data,int n) {
		
		Node curr = list.head;
	    Node prev = null;
	    Node newNode = new Node(data);
	    
	    while(curr != null) {
	    	
	    	if(curr.data == n) {
	    		
	    		newNode.next = curr;
	    		prev.next = newNode;
	    		
	    	}
	    	prev = curr;
	    	curr = curr.next;
	    	
	    }
	    
	    return list;
		
	}
	
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list = insert(list,1);
		list = insert(list,2);
		list = insert(list,4);
		list = insert(list,5);
		list = insert(list,7);
		list = insert(list,9);
		list = insert(list,10);
		
		insertbeforen(list,3,4);
		insertbeforen(list,6,7);
		insertbeforen(list,8,9);
		
		Node curr = list.head;
		
		while(curr != null) {
			
			System.out.print(curr.data+" ");
			curr = curr.next;
			
		}
		
	}
	
}
