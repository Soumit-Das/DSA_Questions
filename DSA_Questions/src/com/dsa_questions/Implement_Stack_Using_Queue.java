package com.dsa_questions;
import java.util.*;

public class Implement_Stack_Using_Queue {

	    Queue<Integer> queue = new LinkedList<>();
	    
	    public void push(int x) {

	        queue.add(x);

	        for(int i = 0;i < queue.size()-1;i++){

	            queue.add(queue.peek());

	            queue.poll();

	        }

	    }
	    
	    public int pop() {
	        
	        return queue.poll();

	    }
	    
	    public int top() {
	        
	        return queue.peek();

	    }
	    
	    public boolean empty() {
	        
	        return queue.isEmpty();

	    }
}
	

