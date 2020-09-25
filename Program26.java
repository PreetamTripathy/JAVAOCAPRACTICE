package com.cg.day3;

import java.util.*; 

public class Program26 { 
  
    public static void main(String args[]) 
    { 
        ArrayList<String> al 
            = new ArrayList<>(); 
  
        al.add("Risk"); 
        al.add("tisk"); 
        al.add(1, "For"); 
  
        for (int i = 0; i < al.size(); i++) { 
  
            System.out.print(al.get(i) + " "); 
        } 
  
        System.out.println(); 
  

        for (String str : al) 
            System.out.print(str + " "); 
    } 
} 
//ans-Risk For tisk 
//Risk For tisk 