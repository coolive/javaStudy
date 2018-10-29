package com.colive.DesignModel.CreaterModel;

import java.util.ArrayList;

public class CreateBmw {

    public static void main(String[] args){
        BmwModel bmwModel = new BmwModel();
        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("start");
        sequence.add("alarm");
        sequence.add("boom");
        sequence.add("alarm");

        bmwModel.setSequence(sequence);
        bmwModel.run();
    }
}
