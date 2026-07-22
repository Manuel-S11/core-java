package com.jdc.mtn.interface1;

public interface MemberOfInterface {
	
	
//private int id;  -->instance variable can't be exist in interface
// In the interface state changed into the "public static final"
// in other ways is called constant state not instance or the static member
	
	void abstractBehavior();  // abstract method
	
	public static void staticMethod() {  // public static   // final keywords can't be utilize
	   
		System.out.println("This is the Static Method it can't be use with the Final keyword");
		
	}
	
	
    static void name() {   //auto public if you didn't declare the public access modifier
		
	}
    
    
   default void bstractMethod() {
    	System.out.println("This is the default method");
    	
    	privateNormal();
    	privateStatic();
    }
    
   
   private void privateNormal() {
	   
	   privateNormal();
	   
	   System.out.println("This is the normal Private Static 'Instance Private method' ");
   }
   
   private static void privateStatic() {
	   
	   System.out.println("This is the privateStatic method");
   }
    

}
