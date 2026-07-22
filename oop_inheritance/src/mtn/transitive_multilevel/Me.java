package mtn.transitive_multilevel;

public class Me{
	
	private String name;
	private int age;
	private String gender;
	private String qualification;


	public Me(String name,int age, String gender,String qualification) {

		this.name = name;
		this.age =  age;
		this.gender = gender;
		this.qualification = qualification;
		
	
	}
	
	public Me(String name,int age, String gender) {
		this(name ,age, gender,"Level-4 diploma in Computing");
		
	}
	
	public Me(String name, int age) {
		this(name,age, "male");
		
	}
	
	public Me(String name) {
		this(name, 20);
	}

	
	// Getter Mutator
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}


	public String getGender() {
		return gender;
	}


	public String getQualification() {
		return qualification;
	}


	

}
