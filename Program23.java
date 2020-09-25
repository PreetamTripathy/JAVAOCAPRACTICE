package com.cg.day3;
import java.io.*; 
import java.util.*; 

public class Program23 {

	  
	    public static void main(String[] args) 
	    { 
	        
	        int arr[] = new int[] { 1, 2, 3, 4 }; 
	        Vector<Integer> v = new Vector(); 
	        Hashtable<Integer, String> h 
	            = new Hashtable(); 
	   
	        v.addElement(1); 
	        v.addElement(2); 
	  
	        h.put(1, "fire"); 
	        h.put(2, "hole"); 
	   
	        System.out.println(arr[0]); 
	        System.out.println(v.elementAt(0)); 
	        System.out.println(h.get(1)); 
	  
	    } 
	} 

//ans-1
//1
//fire