package com.jdc.mtn.interfaceStructure;

public class Tiger extends Feline {

	public Tiger(int kg, int speed, int species) {
		super(kg, speed, species);
		
	}

	@Override
	void climbBehavior() {
		
		 System.out.println("Young tigers can climb trees.");
	}

	@Override
	void stealthMovement() {
		System.out.println("Tiger silently stalks its prey.");
	}

	@Override
	void retractableClaws() {
		
		 System.out.println("Tiger keeps claws retracted until attacking.");
	}

	@Override
	void jumpingAbility() {
		 System.out.println("Tiger can jump great distances to catch prey.");
		
	}

	@Override
	void sleepBehavior() {
		 System.out.println("Tiger sleeps in dense forest areas.");
		
	}

	@Override
	void eatBehavior() {
		System.out.println("Tiger hunts deer and other wild animals.");
		
	}

}
