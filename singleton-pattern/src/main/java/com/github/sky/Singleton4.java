package com.github.sky;

/**
 * 静态内部类方式创建
 */
public class Singleton4 {

    private static class SingleHolder{
        private static Singleton4 singleton = new Singleton4();
    }

    private Singleton4(){ }

    public static Singleton4 getInstance(){
        return SingleHolder.singleton;
    }

    public static void doSomething(String[] args) {
        //业务方法
    }
}
