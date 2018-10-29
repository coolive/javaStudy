package com.colive.DesignModel.AbstractFactory;

import com.colive.DesignModel.Factory.Human.AbstractHumanFactory;

public class FemaleYellowHuman extends AbstractYellowHuman {

    @Override
    public void getSex() {
        System.out.println("yellow woman");
    }
}
