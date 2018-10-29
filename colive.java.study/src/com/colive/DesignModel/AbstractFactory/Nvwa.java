package com.colive.DesignModel.AbstractFactory;

import com.colive.DesignModel.AbstractFactory.Interfaces.HumanFactory;
import com.colive.DesignModel.AbstractFactory.Interfaces.HumanInterface;

public class Nvwa {

    public static void main(String[] args){

        HumanFactory maleHumanFactory  = new MaleFactory();
        HumanFactory femaleHumanFactory = new FemaleFactory();

        HumanInterface maleYellowHuman = maleHumanFactory.createYellowHuman();
        HumanInterface femaleWhiteHuman = femaleHumanFactory.createWhiteHuman();

        maleYellowHuman.getColor();
        maleYellowHuman.getSex();
        maleYellowHuman.say();

        femaleWhiteHuman.say();
        femaleWhiteHuman.getSex();
        femaleWhiteHuman.getColor();
    }
}
