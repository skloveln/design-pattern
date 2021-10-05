package com.github.sky;

/**
 * 饿汉式
 *
 * @author sukai
 */
public class Singleton1 {

    private final static Singleton1 SINGLETON = new Singleton1();

    private Singleton1(){ }

    public static Singleton1 getInstance(){
        return SINGLETON;
    }

    public static void doSomething(String[] args) {
        //业务方法
    }
}
