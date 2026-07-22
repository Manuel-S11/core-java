package mtn.composition;

public class Main {
	
	public static void main(String[] args) {
		
		Car gasEngine = new Car(new GasEngine());
		gasEngine.drive();
	
	}

}
