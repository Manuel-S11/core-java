package com.jdc.mtn.mutlipleinheritance;

public interface Tiger extends PantheraLeo {
	
	void swim();
	void huntAlone();
	
	@Override
	default void roar() {
		
		System.out.println("Tiger is Roaring");
	}
	@Override
	default void hunt() {
	 
		System.out.println("Tiger hunt alone");
	}
	public static void helo() {
		
	}
	
	default void hola() {
		
	}
	
//	public void hola2();
	
	public static String hola1() {
		
		return "";
		
	}
	
	

}
