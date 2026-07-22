package mtn.super_usage;

public class Parent {
	
	private String name;
	private int age;
	private String address;
	private String email;
	
	public Parent(String name, int age, String address, String email) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.email = email;
	}
	
	public Parent(String name, int age) {
		this(name,age,"Yangon","java@gmail.com");
	}
	
	public Parent(String address, String email) {
		this("Manuel",19, address, email);
	}
	
	public Parent(String name) {
		this(name,20,"Tamwe/Yangon","manuel@gmail.com");
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public String getEmail() {
		return email;
	}
	
	
	
	
	
	

}
