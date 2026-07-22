package com.jdc.mtn.interfaceStructure;

public class Cat extends Feline implements Pet{
	
	

	public Cat(int kg, int speed, int species) {
		super(kg, speed, species);
	}
	
	@Override
	public void shakeHand() {
		System.out.println("Can shakeHand and cuddle with the cat because Cat is in the ped group");
		
	}

	
	@Override
	void climbBehavior() {
		
		System.out.println("Cat climbs trees and furniture very easily.");
	}

	@Override
	void stealthMovement() {
		
		System.out.println("Cat moves very quietly while hunting.");
	}

	@Override
	void retractableClaws() {
		System.out.println("Cat retracts its claws to stay sharp.");
	}

	@Override
	void jumpingAbility() {
		
		System.out.println("Cat can jump several times its body height.");
	}

	@Override
	void sleepBehavior() {
		System.out.println("Cat Sleeps Many Hours During the day");
	}

	@Override
	void eatBehavior() {
		
		System.out.println("Cat eats Small prey and cat food");
	}

	
	

}
