package com.colive.DesignModel.Singleton;

public class Minister {
    public static void main(String[] args){
        for(int day =0 ;day <3 ;day ++){

            //这么写是否合适？
            Emperor emperor = Emperor.getInstance();
            emperor.say();
        }
    }
}
