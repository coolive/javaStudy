package com.colive.DesignModel.Factory.Human;

import com.colive.DesignModel.Factory.Interfaces.HumanInterface;

public abstract class AbstractHumanFactory {

    public abstract <T extends HumanInterface>  T createHuman (Class <T> c);

}
