package mtn.composition;

public class GasEngine extends Engine{
	
	@Override
	protected void startEngine(int hp) {
		
		System.out.printf("Start the GasEngine %d".formatted(hp));
	}

}
