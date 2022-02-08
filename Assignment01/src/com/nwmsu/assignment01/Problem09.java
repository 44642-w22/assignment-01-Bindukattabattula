package com.nwmsu.assignment01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem09 {

	 public static ArrayList<Integer> problem9(Queue q1){
	        ArrayList<Integer> o=new ArrayList<>();
	        ArrayList<Integer> e=new ArrayList<>();
	        ArrayList<Integer> a2=new ArrayList<>();
	        q1.forEach(i -> {
	            if(((int) i)%2==0){
	                e.add((int) i);
	            }
	            else
	                o.add((int)i);
	        });
	        
	        while(true){
	            if(!e.isEmpty()){
	                a2.add(e.get(0));
	                e.remove(0);
	                                           
	            }
	            else
	            {}            
	            if(!o.isEmpty()){
	                a2.add(o.get(0));
	                o.remove(0);
	            }
	            else{}
	            if(e.isEmpty() && o.isEmpty()){
	            	break;
	            	}
	        }
	        return a2;
	        
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
	       
	        System.out.println(problem9(q1));
	    }
}
