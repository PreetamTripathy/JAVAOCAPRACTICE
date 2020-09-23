package com.cg.day1;

class Base  
{ 
    final public void show()  
    { 
        System.out.println("Base::show() called"); 
    } 
} 
class Derived extends Base  
{ 
    public void show()  
    { 
        System.out.println("Derived::show() called"); 
    } 
} 
class you  
{ 
    public static void main(String[] args)  
    { 
        Base b = new Derived(); 
        b.show(); 
    } 
} 


//ans-compilation error as final method can't be overriden