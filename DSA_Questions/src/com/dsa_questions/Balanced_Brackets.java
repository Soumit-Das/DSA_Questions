package com.dsa_questions;

import java.util.Stack;

public class Balanced_Brackets {

public static String Check(String str){
        
        char[] ch = str.toCharArray();
        
        Stack<Character> stack = new Stack<>();
        
        if(ch[0] == ')' || ch[0] == '}' || ch[0] == ']'){
                
                return "not balanced";
                
            }
        
        for(int i = 0;i < ch.length;i++){

            
            if(ch[i] == '(' || ch[i] == '{' || ch[i] == '['){
                
                stack.push(ch[i]);
                
            }else{
                
                if(stack.peek() == '(' && ch[i] == ')'){
                    
                    stack.pop();
                    
                    
                }else if(stack.peek() == '{' && ch[i] == '}'){
                    
                    stack.pop();
                    
                }else if(stack.peek() == '[' && ch[i] == ']'){
                    
                    stack.pop();
                    
                }
                else{
                    
                    return "not balanced";
                    
                }
                
            }
            
        }

        if(stack.isEmpty()){
            
            return "balanced";
            
        }else{
            
            return "not balanced";
            
        }
        
    }
	
}
