package com.github.sky;

/**
 * 匿名内部类方式创建
 */
public class Singleton4 {

    private static class SingleHolder{
        private static Resource singleton = new Resource();
    }

    private Singleton4(){ }

    public static Resource getInstance(){
        return SingleHolder.singleton;
    }

}
