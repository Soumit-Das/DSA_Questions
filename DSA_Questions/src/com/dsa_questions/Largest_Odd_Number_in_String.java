package com.dsa_questions;

public class Largest_Odd_Number_in_String {

	public String largestOddNumber(String num) {
        
        char[] ch = num.toCharArray();

        String str = "";

        int idx = -1;

        boolean flag = false;

        for(int i = ch.length-1;i>=0 && !flag;i--){
            if(Integer.parseInt(ch[i]+"") % 2 != 0){
                idx = i;
                flag = true;
            }

        }
        
        if(idx == -1){
            return "";
        }

        for(int j=0;j<=idx;j++){
            
            str+=ch[j]+"";
        }

   
        return str;

    }
	
	public static void main(String[] args) {
		
		Largest_Odd_Number_in_String lons = new Largest_Odd_Number_in_String();
		String str = lons.largestOddNumber("52");
		
		System.out.println("Largest Odd Number in String is : "+str);
		
	}
	
}
