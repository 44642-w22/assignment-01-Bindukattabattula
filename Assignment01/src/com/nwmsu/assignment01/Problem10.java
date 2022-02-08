package com.nwmsu.assignment01;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Problem10 {

	public static String problem10(Deque q1,int[] b){
        char ch = 0;
        
        boolean l=false;
        for(int i:b){
            
            if(i==1){
                ch=(char) q1.pop();
                
                l=true;              
               }
            else if(i==0){ 
                if(l){                
                 q1.addFirst(ch);
                
                 l=false;                 
                }
                              
            }
            else{}
        }  
        String S=new String();
        while(!q1.isEmpty()){
            S=S+String.valueOf(q1.poll());
        }
        return S;
        
}
    public static void main(String[] args) {
        Deque q1 = new LinkedList<>();
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of elements");
        int n=sc.nextInt(); 
        System.out.println("Enter the Elements");               
        for(int i=0;i<n;i++){  
           
            q1.add(sc.next().charAt(0));
        }  
        
        System.out.println("Enter no.of values");
        int a=sc.nextInt();
        int[] b=new int[a];
        System.out.println("Enter the values");   
        for(int i=0;i<a;i++){  
            
            b[i]=sc.nextInt();
        }  
               System.out.println(problem10(q1,b));
    }
}
