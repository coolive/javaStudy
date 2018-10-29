package com.colive.DesignModel.CreaterModel.AbstractClass;

import java.util.ArrayList;

public abstract class CarModel {
    private ArrayList<String> sequence = new ArrayList();

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();


    final public void run() {
        for (int i = 0; i < this.sequence.size();i++){
            String actionNmae = sequence.get(i);
            if (actionNmae.equalsIgnoreCase("start")){
                this.start();
            }else if(actionNmae.equalsIgnoreCase("stop")){
                this.stop();
            }else if(actionNmae.equalsIgnoreCase("alarm")){
                this.alarm();
            }else if(actionNmae.equalsIgnoreCase("boom")){
                this.engineBoom();
            }
        }
    }

    final public void setSequence(ArrayList<String> sequence){
        this.sequence = sequence;
    }
}