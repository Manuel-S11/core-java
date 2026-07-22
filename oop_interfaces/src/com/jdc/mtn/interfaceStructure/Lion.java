package com.jdc.mtn.interfaceStructure;

public class Lion extends Feline{


	public Lion(int kg, int speed, int species) {
		super(kg, speed, species);
		
	}

	@Override
	void climbBehavior() {
		
		 System.out.println("Lion rarely climbs trees due to its heavy body.");
	}

	@Override
	void stealthMovement() {
		 System.out.println("Lion uses stealth to approach prey.");
		
	}

	@Override
	void retractableClaws() {
		
		System.out.println("Lion retracts claws when walking.");
	}

	@Override
	void jumpingAbility() {
		
		System.out.println("Lion can leap forward while attacking prey.");
	}

	@Override
	void sleepBehavior() {
		
		System.out.println("Lion sleeps around 16-20 hours a day.");
	}

	@Override
	void eatBehavior() {
		System.out.println("Lion hunts and eats large prey.");
	}

}
