package com.github.sky;

/**
 * 懒汉式双重锁校验
 */
public class Singleton3 {

    private volatile static Resource singleton = null;

    private Singleton3(){}

    public static Resource getInstance(){
        if(singleton == null){
            synchronized (Resource.class){
                if(singleton == null){
                    singleton = new Resource();
                }
            }
        }
        return singleton;
    }
}
