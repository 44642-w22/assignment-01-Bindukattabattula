package com.nwmsu.assignment01;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Problem06 {
	public static ArrayList<Integer> problem6(Stack st){
        ArrayList<Integer> a1=new ArrayList<>();
        int k=st.size();
        
        while(!st.empty()){
            if(st.size()>(k/2)){
                a1.add((int)st.pop());
                
            }
            else{
                a1.add((int)(st.firstElement()));
                st.remove(0);
              
                
            }            
        }
        return a1;
    }
    public static void main(String[] args) {
        Stack s1=new Stack();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of elements");
        int n=sc.nextInt(); 
        System.out.println("Enter the Elements");
        for(int i=0;i<n;i++){  
           
            s1.push(sc.nextInt());
        }                
        System.out.println(problem6(s1));
    }
}
