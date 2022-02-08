package com.nwmsu.assignment01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem08 {

	 public static ArrayList<Integer> problem8(Queue q1){
	        ArrayList<Integer> a1=new ArrayList<>();
	        while(!q1.isEmpty()){
	            a1.add((int) q1.remove());
	        }
	        int s=a1.size()-1;
	        int i=0;
	        ArrayList<Integer> a2=new ArrayList<>();
	        while(a2.size()!=a1.size()){
	            a2.add(a1.get(s));
	            
	            if(!a1.isEmpty()){
	               a2.add(a1.get(i));
	               
	               i=i+1;
	            }
	            
	            s=s-1;
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
	        
	        System.out.println(problem8(q1));
	    }
}
