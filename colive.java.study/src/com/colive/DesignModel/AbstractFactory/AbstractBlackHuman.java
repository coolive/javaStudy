package com.colive.DesignModel.AbstractFactory;

import com.colive.DesignModel.AbstractFactory.Interfaces.HumanInterface;

public abstract class AbstractBlackHuman implements HumanInterface {

    @Override
    public void getColor() {
        System.out.println("i am black");
    }

    @Override
    public void say() {
        System.out.println("i don't know say what");
    }
}
