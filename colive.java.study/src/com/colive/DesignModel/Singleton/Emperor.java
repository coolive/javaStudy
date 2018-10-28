package com.colive.DesignModel.Singleton;

public class Emperor{

    //自动实例化
    private static final Emperor emperor = new Emperor();

    //定义私有
    private Emperor() {};

    public static Emperor getInstance(){
        return emperor;
    }
    public static void say(){
        System.out.println("i am colive, i am a emperor");
    }
}
