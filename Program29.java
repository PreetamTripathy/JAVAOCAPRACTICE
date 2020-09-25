package com.cg.day3;

import java.util.*;  

public class Program29 {  
    
    public static void main(String args[])  
    {  
        LinkedList<String> ll = new LinkedList<>();  
    
        ll.add("Risk");  
        ll.add("Tisk");  
        ll.add(1, "For");  
    
        System.out.println(ll);  
    }  
} 

//ans-[Risk, For, Tisk]