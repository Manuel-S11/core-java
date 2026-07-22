package mtn.parent_child_polymorphism;

public class Child extends Parent{
	

	static String name = "Mg mg";
	 String email = "mgmg@gmail.com";
	
	static {
		System.out.println("Child Static block is run");
		
	}
	
	{
		System.out.println("Email address after initilizer: " + email);
		System.out.println("Child instance Block is run");
	}
	
	
	public Child() {
		super();
		
		System.out.println("====================== Child Constructor is runned ==================================");
	}
	
	
   @Override
	void show() {
	   System.out.println("Name:: "+ name);
	   System.out.println("Show method from child");
	  System.out.println("Email address:: " +  email);
	}

}
