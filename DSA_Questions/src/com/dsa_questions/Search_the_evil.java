package com.dsa_questions;

import java.util.*;

public class Search_the_evil {

	    public static void main(String[] args){
	        
	        Scanner sc = new Scanner(System.in);
	        
	        int tc = sc.nextInt();
	        
	        for(int k = 0;k < tc;k++){
	            
	            int N = sc.nextInt();
	            
	            int M = sc.nextInt();
	            
	            int[][] mat = new int[N][M];
	            
	            boolean flag = false;
	            
	            for(int i=0;i<N;i++){
	                
	                for(int j=0;j<M;j++){
	                    
	                    mat[i][j] = sc.nextInt();
	                    
	                }
	                
	            }
	            
	            int evil = sc.nextInt();
	            
	            for(int i=0;i<N && !flag;i++){
	                
	                for(int j=0;j<M && !flag;j++){
	                    
	                     if(mat[i][j] == evil){
	                         
	                         System.out.println("true");
	                         
	                         flag = true;
	                         
	                     }
	                    
	                }
	                
	                
	            }
	            
	            if(flag == false){
	                
	                System.out.println("false");
	                
	            }
	            
	            
	        }
	        
	        
	    }
	    
	}
	

