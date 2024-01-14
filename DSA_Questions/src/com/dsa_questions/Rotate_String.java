package com.dsa_questions;

public class Rotate_String {

	
	public boolean rotateString(String s, String goal) {
        
        for(int i=0;i<s.length();i++){

            String ans = "";
        
            char a = s.charAt(0);
        
            ans = s.substring(1);
        
            ans+=a+"";

            if(s.equals(goal)){
                return true;
            }
            
            s = ans;

        }
        return false;
    }
	
	
	public static void main(String[] args) {
		
		Rotate_String rs = new Rotate_String();
		
		System.out.println(rs.rotateString("abcde", "cdeab"));
		
	}
	
}
