package com.engine.entity.actionHolder;

public abstract class BeverageMaker {



    // template pattern method1
    public final void prepareBeverageForBoilType(){
        startMessage();
        boilWater();
        System.out.println(brew());
        pourIntoCup();
        addCondiments();
        endMessage();
    }

    //template pattern method2
    public final void prepareBeverageForIceType(){
        startMessage();
        iceWater();
        IO.println(brew());
        pourIntoCup();
        addCondiments();
        endMessage();

    }

    protected abstract String brew();

    private void startMessage(){
        IO.println("\n ================== BeverageMaker Brewing stage is started ==================\n");

    }
    private void endMessage(){

        IO.println("\n ================== BeverageMaker Brewing stage is finished ==================\n");
    }

    private void iceWater(){

        IO.println("Freezing the Water or Use the Ice which temperate is -11 degree Celsius");

    }
    private void boilWater(){

        IO.println("Boiling the Water for Brewing\n");
    }

    protected void pourIntoCup(){
        IO.println("Pouring the Beverage Liquid into the Suitable Cup");
    }

    // hook method
    protected void addCondiments(){
        IO.println("embellish with condiments");
    }


}
