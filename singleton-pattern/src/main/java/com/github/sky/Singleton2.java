package com.github.sky;

/**
 * 懒汉式
 */
public class Singleton2 {

    private static Singleton2 singleton = null;

    private Singleton2(){}

    public synchronized static Singleton2 getInstance(){
        if(singleton == null){
            singleton = new Singleton2();
        }
        return singleton;
    }

    public static void doSomething(String[] args) {
        //业务方法
    }
}
