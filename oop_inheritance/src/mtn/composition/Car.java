package mtn.composition;

public class Car{
	
	private Engine engine;
	
	public Car(Engine engine) {
		this.engine = engine;
	}
	
//	void setEngine(Engine engine) {
//		this.engine = engine;
//	}
	
	void drive() {
		engine.startEngine(100);
		System.out.println("Car is start driving");
	}
	

}
