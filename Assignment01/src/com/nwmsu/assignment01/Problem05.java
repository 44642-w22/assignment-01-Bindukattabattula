package com.nwmsu.assignment01;

import java.util.Scanner;
import java.util.Stack;

public class Problem05 {
	public static boolean problem5(String S){
	      Stack<Character> st = new Stack<>();
	      
	      if(S == null || S.length() == 0)
	      {
	           return false;
	      } else 
	      {    
	        for(int i = 0; i < S.length(); i++)
	        {
	            
	            switch (S.charAt(i)) {
	                case '(':
	                case '{':
	                case '[':
	                    st.push(S.charAt(i));
	                    break;
	                case ')':
	                    if(!st.isEmpty() && st.peek() == '(') {
	                        st.pop();
	                    }else {
	                        return false;
	                    }          break;
	                case ']':
	                    if(!st.isEmpty() && st.peek() == '[') {
	                        st.pop();
	                    } else {
	                        return false;
	                    }     break;
	                case '}':
	                    if(!st.isEmpty() && st.peek() == '{') {
	                        st.pop();
	                    } else {
	                        return false;
	                    }     break;
	                default:
	                    break;
	            }
	        }
	        
	            
	            return st.isEmpty();
	    }
	 }

	        
	    
	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the String");
	        String s=sc.next();
	        
	        System.out.println(problem5(s));
	    }
}
