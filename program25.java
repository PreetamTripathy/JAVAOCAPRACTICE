package com.cg.day3;

import java.util.*; 
public class program25 { 
    public static void main(String args[]) 
    { 
       
        TreeSet<String> ts 
            = new TreeSet<String>(); 
  
        ts.add("fire"); 
        ts.add("in"); 
        ts.add("the"); 
        ts.add("hole"); 
        ts.add("ohk yess"); 
  
     
        Iterator<String> itr = ts.iterator(); 
        while (itr.hasNext()) { 
            System.out.println(itr.next()); 
        } 
    } 
} 

//ans-fire
//hole
//in
//ohk yess
//the
