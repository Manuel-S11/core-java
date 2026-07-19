package com.engine;

public abstract class Mammal {


    private final String species = "mammal";
    String name;
    protected String count;
    private String location;
    public String letter  = "%s, living numbers is %s found at %s".formatted(species,count, location);

    public Mammal(String name,String count, String location) {
        this.name  = name;
        this.count = count;
        this.location = location;
    }

    protected abstract String learnSkill();

    public abstract void communicate();

    abstract void defendTerritory();


    // public/ protected/ default
    protected void template(){

        communicate();
        learnSkill();
        defendTerritory();
    }

    public static String template2(){

        String returnString  = "This is the Template 2 and Using for the Detection";

        return returnString;
    }

    public void greeting(){

        template2();
        IO.println("Hello, How's your day, I am ".concat(name));
    }






}
