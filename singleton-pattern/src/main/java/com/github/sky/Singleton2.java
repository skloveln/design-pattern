package com.github.sky;

/**
 * 懒汉式
 */
public class Singleton2 {

    private static Resource singleton = null;

    private Singleton2(){}

    public synchronized static Resource getInstance(){
        if(singleton == null){
            singleton = new Resource();
        }
        return singleton;
    }
}
