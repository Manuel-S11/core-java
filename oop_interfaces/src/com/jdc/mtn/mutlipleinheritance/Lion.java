package com.jdc.mtn.mutlipleinheritance;

public interface Lion extends PantheraLeo{
	
	void liveInPride();
	void protectTerritory();
	
	@Override
	default void roar() {
		System.out.println("Lion is Roaring");
		
	}
	@Override
	default void hunt() {
	   System.out.println("Lions hunt with team");
	   
	}
	
	
	
	
	

}
