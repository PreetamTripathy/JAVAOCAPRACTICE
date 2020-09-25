package com.cg.day3;
import java.util.*;
public class Program22 {

	    public static void main(String args[]) 
	    { 
	        // Creating HashSet and 
	        // adding elements 
	        HashSet<String> hs = new HashSet<String>(); 
	  
	        hs.add("fire"); 
	        hs.add("in"); 
	        hs.add("the"); 
	        hs.add("hole"); 
	        hs.add("Oo yess"); 
	  
	        // Traversing elements 
	        Iterator<String> itr = hs.iterator(); 
	        while (itr.hasNext()) { 
	            System.out.println(itr.next()); 
	        } 
	    } 
	} 

//ans-the
//hole
//in
//fire
//Oo yess
