package com.dsa_questions;

import java.util.Scanner;

public class Coding_Streak {

public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int tc = sc.nextInt();
        
        int max_global = 0;
        
        int curr_global = 0;
        
        int max_inner = 0;
        
        for(int i = 0;i<tc;i++){
            
            
            
            int curr_inner = 0;
            
            String str = sc.nextLine();
            
            char[] ch = str.toCharArray();
            
            for(int j = 0;j<ch.length;j++){
                
                if(ch[j] == 'C'){
                    
                    curr_global++;
                    
                    curr_inner++;
                    
                }else{
                    
                    max_global = Math.max(max_global,curr_global);
                    
                    curr_global = 0;
                    
                    max_inner = Math.max(max_inner,curr_inner);
                    
                    curr_inner = 0;
                    
                }
                
                max_inner = Math.max(max_inner,curr_inner);
                
            }
            
        }
        
        System.out.println(max_inner+" "+max_global);
    }
	
}
