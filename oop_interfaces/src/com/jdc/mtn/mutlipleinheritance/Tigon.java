package com.jdc.mtn.mutlipleinheritance;

public class Tigon implements Tiger, Lion {

	@Override
	public void liveInPride() {
		
		System.out.println("Is from the Lion 'Live in Pride'");
	}

	@Override
	public void protectTerritory() {
		System.out.println("Is from the Lion 'Territory'");
	}

	@Override
	public void swim() {
		
		System.out.println("Is from the Tiger 'Tiger is Swimming'");
	}

	@Override
	public void huntAlone() {
		System.out.println("Is from the Tiger 'Tiger hunt alone'");
		
	}

	@Override
	public void roar() {
		Tiger.super.roar();
	}

	@Override
	public void hunt() {
	     Lion.super.hunt();
	}
	
	
	
	
	
	
	

}
