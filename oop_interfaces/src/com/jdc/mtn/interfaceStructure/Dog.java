package com.jdc.mtn.interfaceStructure;

public class Dog extends Canine implements Pet{
	

	@Override
	public void shakeHand() {
		System.out.println("Can shake hand with Dob, because it is in the pet group");
		
	}
	

	@Override
	void huntInPacks() {
		  System.out.println("Dogs can hunt in groups or assist humans in hunting.");
	}

	@Override
	void longDistanceRunning() {
		
		System.out.println("Dog can run long distances with good endurance.");
	}

	@Override
	void smellAbility() {
		
		System.out.println("Dog has a very powerful sense of smell.");
	}

	@Override
	void digging() {
		System.out.println("Dog digs holes in the ground.");
		
	}

	@Override
	void sleepBehavior() {
		 System.out.println("Dog sleeps lightly and wakes quickly.");
		
	}

	@Override
	void eatBehavior() {
		
		System.out.println("Dog eats meat, bones, and dog food.");
    
	}
	
	

}
