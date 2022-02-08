package com.nwmsu.assignment01;

import java.util.LinkedList;
import java.util.Scanner;

public class Problem02 {
	 public static LinkedList<LinkedList<Integer>> problem2(LinkedList<Integer> l1,int k){
	        LinkedList<LinkedList<Integer>> l2=new LinkedList<>();
	            for(int i=0;i<l1.size()-1;i++){
	                LinkedList<Integer> l3=new LinkedList<>();
	                if(l1.get(i)+l1.get(i+1)==k){
	                    l3.add(l1.get(i));
	                    l3.add(l1.get(i+1));
	                
	                }
	                else{}
	                if(l3.isEmpty()==false){l2.add(l3);};
	                
	            }
	        return l2;
	    
	    }
	    public static void main(String[] args) {
	        
	        LinkedList<Integer> l1=new LinkedList<>();
	        Scanner sc=new Scanner(System.in);
	        System.out.print("Enter K value");
	        int k=sc.nextInt();
	        System.out.print("Enter the no.of elements");
	        int b=sc.nextInt();   
	        System.out.print("enter the elements");
	        for(int i=0;i<b;i++){  
	            
	            l1.add(sc.nextInt());
	        }        
	        
	      
	        System.out.println(problem2(l1,k));
	        
	    }
}
