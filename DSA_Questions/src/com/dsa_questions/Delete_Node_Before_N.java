package com.dsa_questions;

import java.util.*;

class Node { 
    int data; 
    Node next; 

    Node() { data = 0; }
    Node(int d) { data = d; }  //constructor to create a new node
}


public class Delete_Node_Before_N {

	public static Node convert(int[] arr){
        
        Node head = new Node(arr[0]);
        Node curr = head;
        
        
        for(int i=1;i<arr.length;i++){
            
            Node temp = new Node();
            temp.data = arr[i];
            temp.next = null;
            curr.next = temp;
            curr = temp;
            
        }
        return head;
    }
	
	public static Node deleteNodeBeforeN(Node head,int n){
        
        Node curr = head;
        Node perv = null;
        Node preperv = null;
        
        boolean flag = false;
        
        while(curr != null && !flag){
            
            if(curr.data == n){
                
                preperv.next = curr;
                flag = true;
                
            }else{
                
                preperv = perv;
                perv = curr;
                curr = curr.next;
                
            }

        }
        return head;
    }
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
	    
	    Node curr = convert(arr);
		
	    deleteNodeBeforeN(curr,10);
	    
	    while(curr != null){
            
            System.out.print(curr.data+" ");
            curr = curr.next;
            
        }
	    
	}
	
	
	
}
