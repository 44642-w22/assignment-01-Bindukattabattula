package com.nwmsu.assignment01;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem03 {
	 public static int problem3(ArrayList<Integer> a1){        
	        if(a1.isEmpty())
	        {
	        	return Integer.MIN_VALUE;
	        	}
	        else{
	        int i=a1.get(0);
	        for(int s : a1)
	        {
	            if(s>i)
	            {
	            	i=s;
	            }
	            
	            
	        }
	        return i;
	        }
	        
	}

	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String[] args) {
	        // TODO code application logic here
	        Scanner sc=new Scanner(System.in);
	        ArrayList<Integer> a1=new ArrayList<>();
	        System.out.println("Enter the no.of elememts");
	        int n=sc.nextInt(); 
	        System.out.println("Enter the elememts");
	        for(int i=0;i<n;i++){  
	            
	            a1.add(sc.nextInt());
	        }        
	        
	        System.out.println(problem3(a1));
	        
	    }
}
