package com.colive.DesignModel.Factory.Human;

import com.colive.DesignModel.Factory.Interfaces.HumanInterface;

public class Nvwa {

    public static void main(String[] args){
        AbstractHumanFactory cc = new HumanFactory();
        HumanInterface whiteHuman  = cc.createHuman(WhiteHuman.class);
        HumanInterface yellowHuman = cc.createHuman(YellowHuman.class);
        HumanInterface blackHuman = cc.createHuman(BlackHuman.class);

        whiteHuman.getColor();
        yellowHuman.talk();
        blackHuman.talk();
        blackHuman.talk();
    }
}
