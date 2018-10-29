package com.colive.DesignModel.AbstractFactory;


import com.colive.DesignModel.AbstractFactory.Interfaces.HumanInterface;

public abstract  class AbstraceWhiteHuman implements HumanInterface {

    @Override
    public void getColor(){
        System.out.println(" i am white");
    }

    @Override
    public void say(){
        System.out.println("say english");
    }
}
