package com.colive.DesignModel.AbstractFactory;

import com.colive.DesignModel.AbstractFactory.AbstractYellowHuman;

public class MaleYellowHuman extends AbstractYellowHuman {
    @Override
    public void getSex() {
        System.out.println("yellow male");
    }
}
