package mtn.parent_child_polymorphism;

public class Main {

	
	public static void main(String[] args) {
		Parent child = new Child();
		
		Child child1 = (Child) child;
		
	}
}
