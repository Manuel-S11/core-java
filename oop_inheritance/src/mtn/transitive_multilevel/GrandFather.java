package mtn.transitive_multilevel;

public class GrandFather extends GreatGrandFather{
	

	
	String name  = null;

	@Override
	void professionalJob() {
	    
		System.out.println("Grand Father is the also Farmer");
		
	}
	
//	@Override   // occur the compile time error
//	static void workholicBehavior() {
//		
//		   System.out.println("The Greate Grand Parent has the Workholic Behavior");
//	}	
	
	
	void buildHouse() {
		System.out.println("Grand Father is built the new House");
	}
	
	
	
	
	

}
