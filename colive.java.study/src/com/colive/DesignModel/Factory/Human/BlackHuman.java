package com.colive.DesignModel.Factory.Human;

import com.colive.DesignModel.Factory.Interfaces.HumanInterface;

public class BlackHuman implements HumanInterface {
    
    @Override
    public void getColor() {
        System.out.println("i am black");
    }

    @Override
    public void talk() {
        System.out.println("i don't know say what");
    }
}
