package com.dsa_questions;

import java.util.*;

public class Minimum_platform_required {

	    
	    public static void main(String[] args){
	        
	        Scanner sc = new Scanner(System.in);
	        
	        int N = sc.nextInt();
	        
	        int[][] ari = new int[N][2];
	        
	        int[][] dept = new int[N][2];
	        
	        int[][] mat = new int[N*2][2];
	        
	        for(int i = 0;i < N;i++){
	            
	            String str = sc.next();
	            
	            if(str.length() == 5){
	                
	                str = "" + str.charAt(0) + str.charAt(1) + str.charAt(3) + str.charAt(4);
	                
	            }else{
	                
	                str = "" + str.charAt(0) + str.charAt(2) + str.charAt(3);
	                
	            }
	            
	            ari[i][0] = Integer.parseInt(str);
	            
	            ari[i][1] = 1;
	            
	            mat[i][0] = ari[i][0];
	            
	            mat[i][1] = ari[i][1];
	            
	        }
	        
	        
	        for(int i = 0;i < N;i++){
	            
	            String str = sc.next();
	            
	            if(str.length() == 5){
	                
	                str = "" + str.charAt(0) + str.charAt(1) + str.charAt(3) + str.charAt(4);
	                
	            }else{
	                
	                str = "" + str.charAt(0) + str.charAt(2) + str.charAt(3);
	                
	            }
	            
	            dept[i][0] = Integer.parseInt(str);
	            
	            dept[i][1] = -1;
	            
	            mat[i+N][0] = dept[i][0];
	            
	            mat[i+N][1] = dept[i][1];
	        }
	        
	        Comparator<int[]> comp = (o1,o2) -> o1[0] > o2[0] ? 1 : -1;
	        
	        Arrays.sort(mat, comp);
	        
	        int sum = 0;
	        
	        int max = 0;
	        
	        for(int i = 0;i < N*2;i++){
	            
	            sum += mat[i][1];
	            
	            max = Math.max(max, sum);

	        }
	        
	        System.out.println(max);
	        
	    }
	    
	}
	

