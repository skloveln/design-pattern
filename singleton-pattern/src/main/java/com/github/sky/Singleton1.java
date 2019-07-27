package com.github.sky;

/**
 * 饿汉式
 */
public class Singleton1 {

    private final static Singleton1 singleton = new Singleton1();

    private Singleton1(){ }

    public static Singleton1 getInstance(){
        return singleton;
    }

    public static void doSomething(String[] args) {
        //业务方法
    }
}
