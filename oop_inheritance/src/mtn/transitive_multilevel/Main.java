package mtn.transitive_multilevel;

public class Main {
	
	
	public static void main(String[] args) {
	
		GrandFather grandF = new GrandFather();
		grandF.professionalJob();
       System.out.println("Hey!!!!!!!!!!! " + grandF.name);      // Variable Hiding even those at the Zero Casting
       
       GreatGrandFather gf = new GrandFather();
       System.out.println(gf.name);  // variable hiding at the down Casting
       gf.helo();
		
		
		
		Father f = new Father();
		f.professionalJob();
		f.buildHouse();
		
		
		
		System.out.println("Constructor Chaning");
		
		Me child1 = new Me("Manuel");
		System.out.println(child1.getName());
		
		
		
		
	}

}
