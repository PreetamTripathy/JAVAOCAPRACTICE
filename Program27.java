package com.cg.day3;

import java.util.*; 

public class Program27 { 
  
    public static void main(String args[]) 
    { 
        ArrayList<String> al = new ArrayList<>(); 
  
        al.add("Risk"); 
        al.add("tisk"); 
        al.add(1, "For"); 
  
        System.out.println( 
            "Initial ArrayList " + al); 
  
        al.remove(1); 
  
        System.out.println( 
            "After the Index Removal " + al); 
  
        al.remove("Risk"); 
  
        System.out.println( 
            "After the Object Removal " + al); 
    } 
} 

//ans-Initial ArrayList [Risk, For, tisk]
	//	After the Index Removal [Risk, tisk]
		//		After the Object Removal [tisk]
