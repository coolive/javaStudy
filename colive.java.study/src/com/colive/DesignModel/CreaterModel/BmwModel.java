package com.colive.DesignModel.CreaterModel;

import com.colive.DesignModel.CreaterModel.AbstractClass.CarModel;

public class BmwModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("bmw start");
    }

    @Override
    protected void stop() {
        System.out.println("bmw stop");
    }

    @Override
    protected void alarm() {
        System.out.println("bmw alarm");
    }

    @Override
    protected void engineBoom() {
        System.out.println("bmw boom");
    }
}
