package com.colive.DesignModel.CreaterModel;

import java.util.ArrayList;

public class CreateBmwByBuilder  {

    public static void main(String[] args){
        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("start");
        sequence.add("stop");
        sequence.add("boom");
        BmwBuilder bmwBuilder = new BmwBuilder();
        bmwBuilder.setSequence(sequence);
        bmwBuilder.getCarModel().run();
    }
}
