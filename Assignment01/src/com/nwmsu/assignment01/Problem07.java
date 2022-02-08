package com.nwmsu.assignment01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem07 {

	 public static int problem7(Queue q1){
	        String s=new String();
	        while(!q1.isEmpty())
	        {
	        	
	            s=s+String.valueOf(q1.remove());
	            }
	        
	        return Integer.parseInt(s, 2);
	    }
	    public static void main(String[] args) {
	        Queue q1=new LinkedList<>();
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the no.of elements");
	        int n=sc.nextInt(); 
	        System.out.println("Enter the Elements");             
	        for(int i=0;i<n;i++){  
	           
	            q1.add(sc.nextInt());
	        }        
	       
	        
	        System.out.println(problem7(q1));
	        
	    }
}
