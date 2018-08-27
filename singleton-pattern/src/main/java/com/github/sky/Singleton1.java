package com.github.sky;

/**
 * 饿汉式
 */
public class Singleton1 {

    private final static Resource singleton = new Resource();

    private Singleton1(){ }

    public static Resource getInstance(){
        return singleton;
    }

}
