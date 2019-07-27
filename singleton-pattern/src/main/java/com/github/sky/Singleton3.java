package com.github.sky;

/**
 * 懒汉式双重锁校验
 */
public class Singleton3 {

    private volatile static Singleton3 singleton = null;

    private Singleton3(){}

    public static Singleton3 getInstance(){
        if(singleton == null){
            synchronized (Singleton3.class){
                if(singleton == null){
                    singleton = new Singleton3();
                }
            }
        }
        return singleton;
    }

    public static void doSomething(String[] args) {
        //业务方法
    }
}
