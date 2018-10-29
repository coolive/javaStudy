package com.colive.DesignModel.AbstractFactory;

import com.colive.DesignModel.AbstractFactory.Interfaces.HumanFactory;
import com.colive.DesignModel.AbstractFactory.Interfaces.HumanInterface;

public class FemaleFactory implements HumanFactory {
    @Override
    public HumanInterface createYellowHuman() {
        return new FemaleYellowHuman();
    }

    @Override
    public HumanInterface createWhiteHuman() {
        return new FemaleWhiteHuman();
    }

    @Override
    public HumanInterface createBlackHuman() {
        return null;
    }
}
