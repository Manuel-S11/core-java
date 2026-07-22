package mtn.composition;


public class PetrolEngine extends Engine{
	
	@Override
	protected void startEngine(int hp) {
		
		System.out.printf("Start the startEngine %d".formatted(hp));
	}

}
