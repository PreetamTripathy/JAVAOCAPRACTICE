package com.cg.day3;

import java.util.*;  

public class Program30 {  
    
    public static void main(String args[])  
    {  
        LinkedList<String> ll = new LinkedList<>();  
    
        ll.add("risk");  
        ll.add("tisk");  
        ll.add(1, "For");  
    
        System.out.println(  
            "Initial LinkedList " + ll);  
    
        ll.remove(1);  
    
        System.out.println(  
            "After the Index Removal " + ll);  
    
        ll.remove("risk");  
    
        System.out.println(  
            "After the Object Removal " + ll);  
    }  
}  

//ans-Initial LinkedList [risk, For, tisk]
//After the Index Removal [risk, tisk]
//After the Object Removal [tisk]
