package mtn.parent_child_polymorphism;

public class Parent {
	
	String hobbies = "Reading";
	String method = print();
	
	static {
		System.out.println("Parent static block is activated");
	}

	
	{
	
		System.out.println("parent Instance Block is activated");
		
	}
	
	public Parent() {
		System.out.println("+++++++ Parent Constructor is runned++++++++++++\n");
		show();
		
		System.out.println("Parent is end");
	}
	
	
	void show() {
		
		System.out.println("Show method from parent");
		System.out.println("Parent hobbies:" + hobbies + "\n\n");
	}
	
	String print() {
		System.out.println("Hobbies" + hobbies);
		System.out.println("This is print");
		return "P";
	}
}

