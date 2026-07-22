package com.jdc.mtn.interfaceStructure;

public abstract class Feline extends Animal {
	
	
   private int kg;
   private int speed;
   private int species;
   

	public Feline(int kg, int speed, int species) {
	super();
	this.kg = kg;
	this.speed = speed;
	this.species = species;
}

	abstract void climbBehavior();
	
	abstract void stealthMovement();
	
	abstract void retractableClaws();
	
	abstract void jumpingAbility();

}
