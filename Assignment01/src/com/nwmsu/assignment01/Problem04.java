package com.nwmsu.assignment01;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem04 {
	 public static ArrayList<String> problem4(ArrayList<String> a1){
	        ArrayList<String> a2=new ArrayList<>();
	        
	        
	        int s=a1.size();
	        
	        while(a2.size()!=s){
	            int j=0;
	            int l=a1.get(0).length();
	            for(String a:a1)
	            {
	                if(a.length()<s)
	                {                                       
	                    
	                    l=a.length();
	                    j=a1.indexOf(a);
	                }               
	                
	            
	            }
	            
	            a2.add(a1.get(j));
	            a1.remove(j);        
	          
	            
	        }
	        
	        return a2;
	        
	        
	        
	}
	    public static void main(String[] args) {
	        ArrayList<String> a1=new ArrayList<>();
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the no.of elememts");
	        int n=sc.nextInt();
	        System.out.println("Enter the Elements");
	        for(int i=0;i<n;i++){  
	           
	            a1.add(sc.next());
	        }        
	      
	        System.out.println(problem4(a1));
	        
	    }
}
