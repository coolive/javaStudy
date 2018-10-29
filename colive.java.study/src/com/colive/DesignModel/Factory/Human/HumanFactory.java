package com.colive.DesignModel.Factory.Human;

import com.colive.DesignModel.Factory.Interfaces.HumanInterface;

public class HumanFactory extends AbstractHumanFactory {
    @Override
    public <T extends HumanInterface> T createHuman(Class<T> c) {
        HumanInterface human = null;
        try {
            human = (HumanInterface) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println(e);
        }
        return (T) human;
    }
}
