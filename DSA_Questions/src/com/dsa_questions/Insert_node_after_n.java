package com.dsa_questions;

public class Insert_node_after_n {

	public static Node convert(int[] arr){
        
        Node head = new Node();
        head.data = arr[0];
        head.next = null;
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
	
	public static Node insertAfterN(Node head,int data,int n){
        
        Node temp = new Node();

        Node curr = head;
        
        
        boolean flag = false;
        
        while(curr != null && !flag){
            
            if(curr.data == n){
                temp.data = data;
                temp.next = curr.next;
                curr.next = temp;
                flag = true;
            }
        
            curr = curr.next;
        }
        
        
        return head;
        
        
    }
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
        
        Node curr = convert(arr);
        
        insertAfterN(curr,11,10);
        
        while(curr != null){
            
            System.out.print(curr.data+" ");
            curr = curr.next;
            
        }
		
	}
	
}
