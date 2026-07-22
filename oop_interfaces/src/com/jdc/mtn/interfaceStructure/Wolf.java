package com.jdc.mtn.interfaceStructure;

public class Wolf extends Canine{

	@Override
	void huntInPacks() {
		
		System.out.println("Wolves hunt in coordinated packs.");
	}

	@Override
	void longDistanceRunning() {
		
		 System.out.println("Wolf can run long distances while chasing prey.");
	}

	@Override
	void smellAbility() {
		System.out.println("Wolf uses its strong sense of smell to track prey.");
		
	}

	@Override
	void digging() {
		
		System.out.println("Wolf digs dens to live and protect its young.");
	}

	@Override
	void sleepBehavior() {
		System.out.println("Wolf sleeps in the wild with its pack.");
		
	}

	@Override
	void eatBehavior() {
		
		System.out.println("Wolf hunts and eats large prey animals.");
	}
	
	

}
