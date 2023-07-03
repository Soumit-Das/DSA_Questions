package com.dsa_questions;

public class Getting_heated {

}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;
 
public class Main {

    static class FastReader {
	
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader(){
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
 
        String next(){
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() { return Integer.parseInt(next()); }
 
        long nextLong() { return Long.parseLong(next()); }
 
        double nextDouble(){
            return Double.parseDouble(next());
        }
 
        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
 
    public static void main(String[] args){
				//This will take the input
        FastReader sc = new FastReader();
        int tc = sc.nextInt();
        
        for(int i=0;i<tc;i++){
            
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
       if(a<=b && c<=b){
                System.out.println("AC");
            }else{
                System.out.println("No AC");
            }   
        }
    }
}

