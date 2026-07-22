package mtn.composition;

public class ElectricEngine extends Engine{

	@Override
	protected void startEngine(int hp) {
		
		System.out.printf("Start the ElectricEngine %d".formatted(hp));
	}
	
	
	
	
}
