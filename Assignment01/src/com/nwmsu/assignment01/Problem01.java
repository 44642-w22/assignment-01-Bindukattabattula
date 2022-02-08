package com.nwmsu.assignment01;

import java.util.LinkedList;
import java.util.Scanner;

public class Problem01 {

	 public static LinkedList<Integer> problem1(LinkedList<Integer> l1){
	        LinkedList<Integer> l2=new LinkedList<>();        
	        for(int s:l1)
	        {
	            int add=0;
	           
	            for(int j=1;j<s;j++)
	            {
	                if(s%j==0)
	                {
	                    add=add+j;
	                   
	                }
	            }
	            if(add==s){
	                
	            l2.add(s);}
	        }
	        return l2;
	        
	    
	    }
	    public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        LinkedList<Integer> l1=new LinkedList<>();
	        System.out.print("Enter no.of elements");
	        int n=sc.nextInt();                
	        for(int i=0;i<n;i++){  
	            System.out.print("Enter the elements");
	            l1.add(sc.nextInt());
	        }        
	       
	        
	        System.out.println(problem1(l1));
	        
	        
	    }
	    
}
