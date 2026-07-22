package com.jdc.mtn.interfaceStructure;

public abstract class RbotDog extends Robot implements Pet{

	@Override
	void charginBattery() {
		System.out.println("RobotDog is charging its battery.");
		
	}

	@Override
	void executingCommands() {
		
		 System.out.println("RobotDog executes programmed commands.");
	}

	@Override
	void systemUpdate() {
		 System.out.println("RobotDog updating software system.");
		
	}

	@Override
	public void shakeHand() {
		System.out.println("Command to Robot dog to shake a hand");
		
		
	}
	
	
	
	

}
