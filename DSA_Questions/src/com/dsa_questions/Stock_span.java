package com.dsa_questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Stock_span {

	public static int[] calculateSpan(int price[], int n)
    {
        
        List<Integer> res = new ArrayList<>();
        
        res.add(1);
        
        Stack<Integer> stack = new Stack<>();
        
        stack.push(0);
        
        for(int i = 1;i<n;i++){
            
            while(!stack.isEmpty() && price[stack.peek()] <= price[i]){
                
                stack.pop();
                
            }
            if(!stack.isEmpty()){
                 res.add(i - stack.peek());
            }else{
                 res.add(i + 1);
            }
            
            
            stack.push(i);
            
        }
        
        int[] arr = new int[res.size()];
        
        for(int i=0;i<res.size();i++){
            
            arr[i] = res.get(i);
            
        }
        
        return arr;
        
    }
	
}
