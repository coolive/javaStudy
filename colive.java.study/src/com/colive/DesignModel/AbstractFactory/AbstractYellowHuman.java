package com.colive.DesignModel.AbstractFactory;

import com.colive.DesignModel.AbstractFactory.Interfaces.HumanInterface;

public abstract class AbstractYellowHuman implements HumanInterface {

    @Override
    public void getColor() {
        System.out.println("i am yellow");
    }

    @Override
    public void say(){
        System.out.println(" i speak Chinese");
    }
}
