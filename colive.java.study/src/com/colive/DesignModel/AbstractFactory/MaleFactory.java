package com.colive.DesignModel.AbstractFactory;

import com.colive.DesignModel.AbstractFactory.Interfaces.HumanFactory;
import com.colive.DesignModel.AbstractFactory.Interfaces.HumanInterface;

public class MaleFactory implements HumanFactory {
    @Override
    public HumanInterface createYellowHuman() {
        return new MaleYellowHuman();
    }

    @Override
    public HumanInterface createWhiteHuman() {
        return new MaleWhiteHuman();
    }

    @Override
    public HumanInterface createBlackHuman() {
        return null;
    }
}
