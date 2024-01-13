package com.dsa_questions;

import java.util.*;

public class Isomorphic_Strings {

	public Map<Character,Character> FreqCount(String str1,String str2){

	       Map<Character,Character> map = new LinkedHashMap<>();

	        char[] ch1 = str1.toCharArray();
	        char[] ch2 = str2.toCharArray();

	        if(str1.length() != str2.length()){
	            map.clear();
	            return map;
	        }


	        for(int i=0;i<ch1.length;i++){

	            if(map.containsKey(ch1[i]) && (map.get(ch1[i]) != ch2[i])){
	                map.clear();
	                return map;
	            }
	            else if(!map.containsKey(ch1[i]) && map.containsValue(ch2[i])){
	                map.clear();
	                return map;
	            }
	            else{
	                map.put(ch1[i],ch2[i]);
	            }

	        }
	        
	        return map;

	    }

	    public boolean isIsomorphic(String s, String t) {

	        Map<Character,Character> map = FreqCount(s,t);

	        if(map.size() == 0){
	            return false;
	        }else{
	            return true;
	        }

	    }
	
	public static void main(String[] args) {
		
		Isomorphic_Strings is = new Isomorphic_Strings();
		
		System.out.println(is.isIsomorphic("egg", "add"));
		
	}
	
}
