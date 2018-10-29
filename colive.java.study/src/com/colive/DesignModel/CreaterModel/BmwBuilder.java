package com.colive.DesignModel.CreaterModel;

import com.colive.DesignModel.CreaterModel.AbstractClass.CarBuilder;
import com.colive.DesignModel.CreaterModel.AbstractClass.CarModel;

import java.util.ArrayList;

public class BmwBuilder extends CarBuilder {

    private BmwModel bmw = new BmwModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmw.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmw;
    }
}
